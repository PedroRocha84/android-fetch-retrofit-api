package pt.pedrorocha.android.androidretrofitapi;

import java.util.concurrent.CompletableFuture;

import retrofit2.http.GET;

public interface JsonPlaceHolderService {
    String TAG = "FETCH";
    String API_ENDPOINT = "http://api.quotable.io";
    String QUOTES_PATH = "/random";

    @GET(QUOTES_PATH)
    CompletableFuture<Quotes> getQuote();
}
