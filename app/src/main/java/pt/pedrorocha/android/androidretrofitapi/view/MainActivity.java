package pt.pedrorocha.android.androidretrofitapi.view;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import pt.pedrorocha.android.androidretrofitapi.network.JsonService;
import pt.pedrorocha.android.androidretrofitapi.R;
import pt.pedrorocha.android.androidretrofitapi.model.Quote;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private EditText text_multi;
    private Button btnGetQuote;
    private Button btnDetails;
    private TextView text_author;

    private Quote quote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGetQuote = findViewById(R.id.button_get);
        btnDetails = findViewById(R.id.button_details);
        text_multi = findViewById(R.id.textmulti_quote);
        text_author = findViewById(R.id.text_author);

        btnGetQuote.setOnClickListener(v -> {
            btnDetails.setEnabled(false);
            retrofitFetch();
        });

        btnDetails.setOnClickListener(v ->{
            Intent intent = new Intent(this, DetailsActivity.class);
            SharedPreferences prefs = getSharedPreferences("quote", MODE_PRIVATE);
                prefs.edit().putString("author-name", quote.getAuthor().getName()).apply();
                prefs.edit().putString("author-slug", quote.getAuthor().getSlug()).apply();
                prefs.edit().putString("author-description", quote.getAuthor().getDescription()).apply();
                prefs.edit().putString("author-bio", quote.getAuthor().getBio()).apply();
                prefs.edit().putString("author-link", quote.getAuthor().getLink()).apply();

            startActivity(intent);
        });
    }

    private void retrofitFetch() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(JsonService.API_ENDPOINT)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        JsonService api = retrofit.create(JsonService.class);
        api.getQuote().thenAccept(post -> {
            runOnUiThread(() -> {
                Log.d("thenAccept", "Runing on UI Thread");
                btnDetails.setEnabled(true);
                quote = post.getQuote();
                text_author.setText(post.getQuote().getAuthor().getName());
                text_multi.setText(post.getQuote().getContent());
            });

        }).exceptionally(ex -> {
            runOnUiThread(() -> {
                if (btnDetails.isEnabled()) {
                    btnDetails.setEnabled(false);
                };
                Log.e("ERROR ", ex.getMessage());
            });
            return null;
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        resetUI(); // your custom method to clear fields, reset views, etc.
    }

    private void resetUI() {

        text_author.setText(" ");
        text_multi.setText(" ");
        btnDetails.setEnabled(false);
        btnGetQuote.setEnabled(true);
    }
}
