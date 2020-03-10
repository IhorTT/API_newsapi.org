package net.ukr.tigor.Test.API.News.service;

import net.ukr.tigor.Test.API.News.domain.Example;
import net.ukr.tigor.Test.API.News.network.ApiFactory;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;

@Service
public class ArticleService implements Callback<Example> {

    private Example example;

    public Example getExample() {
        Call<Example> call = ApiFactory.getService().getArticle("apple", "2020-03-07", "2020-03-08", "fd868cb7d74b41d59cb8f6dc708c521c");

        //call.enqueue(this);
        try {
            example = call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return example;
    }

    @Override
    public void onResponse(Call<Example> call, Response<Example> response) {
        if (response.isSuccessful()) {
            example = response.body();
        } else {
            System.out.println(ErrorUtils.errorMessage(response));
        }
    }

    @Override
    public void onFailure(Call<Example> call, Throwable t) {
        System.out.println("failure");
    }
}

