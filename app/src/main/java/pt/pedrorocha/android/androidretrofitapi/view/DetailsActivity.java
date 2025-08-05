package pt.pedrorocha.android.androidretrofitapi.view;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import pt.pedrorocha.android.androidretrofitapi.R;

public class DetailsActivity extends AppCompatActivity {

    String link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        // Prepare my views
        Button btnBack = findViewById(R.id.button_back);
        Button btnUrl = findViewById(R.id.button_url);
        TextView txtAuthorName = findViewById(R.id.text_author);
        TextView txtAuthorSlug = findViewById(R.id.textView_author_slug);
        TextView txtAuthorDesc= findViewById(R.id.author_description);
        TextView txtAuthorLink = findViewById(R.id.text_link);
        TextView txtAuthorBio = findViewById(R.id.author_bio);

        // Logic
        SharedPreferences prefs = getSharedPreferences("quote", MODE_PRIVATE);
            String authorName = prefs.getString("author-name","Default");
            String authorSlug = prefs.getString("author-slug", "Default");
            String authorDescription = prefs.getString("author-description","Default");
            String authorBio = prefs.getString("author-bio","Default");
             link = prefs.getString("author-link","Default");

            txtAuthorName.setText(authorName);
            txtAuthorSlug.setText(authorSlug);
            txtAuthorDesc.setText(authorDescription);
            txtAuthorBio.setText(authorBio);
            txtAuthorLink.setText(link);

        btnBack.setOnClickListener(v->
            finish()
        );

        btnUrl.setOnClickListener(v->{
            Intent intent = new Intent(this, WebviewActivity.class);
            startActivity(intent);
        });






    }
}