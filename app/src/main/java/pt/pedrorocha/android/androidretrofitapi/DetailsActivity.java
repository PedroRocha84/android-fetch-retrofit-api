package pt.pedrorocha.android.androidretrofitapi;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        // Prepare my views
        Button btnBack = findViewById(R.id.button_back);
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
            String link = prefs.getString("author-link","Default");

            txtAuthorName.setText(authorName);
            txtAuthorSlug.setText(authorSlug);
            txtAuthorDesc.setText(authorDescription);
            txtAuthorBio.setText(authorBio);
            txtAuthorLink.setText(link);

        btnBack.setOnClickListener(v->
            finish()
        );

    }
}