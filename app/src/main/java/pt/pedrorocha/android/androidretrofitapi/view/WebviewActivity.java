package pt.pedrorocha.android.androidretrofitapi.view;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import pt.pedrorocha.android.androidretrofitapi.R;

public class WebviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        Button btn = findViewById(R.id.btn_back);

        SharedPreferences prefs = getSharedPreferences("quote", MODE_PRIVATE);
        String link = prefs.getString("author-link","Default");

        WebView webView = findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(link);

        btn.setOnClickListener(v->
                finish()
        );
    }


}