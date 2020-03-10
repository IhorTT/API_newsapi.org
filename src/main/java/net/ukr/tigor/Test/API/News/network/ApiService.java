package net.ukr.tigor.Test.API.News.network;

import net.ukr.tigor.Test.API.News.domain.Example;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface ApiService {
   @Headers("Content-Type: application/json")
   @GET("/v2/everything")
   Call<Example> getArticle(
           @Query("q") String q,
           @Query("from") String dateFrom,
           @Query("to") String dateTo,
           @Query("apiKey") String apiKey
   );
}
