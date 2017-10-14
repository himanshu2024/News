package playo.co.news.network;

import playo.co.news.entity.NewsData;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Divum on 14-10-2017.
 */

public interface ApiCall {

    @GET("search")
    Call<NewsData> getNewsData ();

}
