package pt.pedrorocha.android.androidretrofitapi.network;

import java.util.concurrent.CompletableFuture;

import pt.pedrorocha.android.androidretrofitapi.model.Response;
import retrofit2.http.GET;

public interface JsonService {
    String TAG = "FETCH";
    String API_ENDPOINT = "https://api.quotable.kurokeita.dev/api/quotes/";
    String QUOTES_PATH = "random";

    @GET(QUOTES_PATH)
    CompletableFuture<Response> getQuote();
}
