package pt.pedrorocha.android.androidretrofitapi.view;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
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

    private SharedPreferences prefs;
    private String link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        prefs = getSharedPreferences("quote", MODE_PRIVATE);
        link = prefs.getString("author-link","Default");
    }

    @Override
    protected void onStart() {
        super.onStart();

        WebView webView = findViewById(R.id.webView);
        webView.setWebViewClient(new MyWebClient());
        webView.loadUrl("https://www.kkkl.pt");

        Button btn = findViewById(R.id.btn_back);
        btn.setOnClickListener(v->
                finish()
        );
    }

    public static class MyWebClient extends WebViewClient{
        @Override
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            Log.d("WebView", "Loading: " + url);
        }

        @Override
        public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
            super.onReceivedError(view, request, error);
            if (request.isForMainFrame()) {
                view.loadUrl("file:///android_asset/404.html");
            }
        }

        @Override
        public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
            super.onReceivedHttpError(view, request, errorResponse);
            if (request.isForMainFrame()) {
                view.loadUrl("file:///android_asset/404.html");
            }
        }
    }
}