package playo.co.news.network;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import playo.co.news.entity.NewsData;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Divum on 14-10-2017.
 */

public class RestClient implements INetwork {

    ApiCall iNetwork;
    private static final String baseUrl= "http://hn.algolia.com/api/v1/";

    RestClient() {

        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)

                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(new OkHttpClient())

                .build();

        iNetwork = retrofit.create(ApiCall.class);

    }

    @Override
    public void getFoodData(final UiCallBack<NewsData> uiCallBack) {
        Call<NewsData> newsCallback=iNetwork.getNewsData();
        newsCallback.enqueue(new Callback<NewsData>() {
            @Override
            public void onResponse(Call<NewsData> call, Response<NewsData> response) {

                if (response.isSuccessful()) {
                    uiCallBack.onSuccess(response.body());
                }
            }

            @Override
            public void onFailure(Call<NewsData> call, Throwable t) {

                uiCallBack.onError("Something went wrong!",ErrorCode.UNKNOWN_ERROR);
            }
        });

    }
}
