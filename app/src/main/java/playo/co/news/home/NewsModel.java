package playo.co.news.home;

import okhttp3.internal.framed.ErrorCode;
import playo.co.news.entity.NewsData;
import playo.co.news.network.AppLib;
import playo.co.news.network.UiCallBack;

/**
 * Created by Divum on 15-10-2017.
 */

public class NewsModel implements NewsContract.NewsModel {
    @Override
    public void getNewsData(final NewsDataListener newsDataListener) {
        AppLib.getAppLib().getNetworkClient().getFoodData(new UiCallBack<NewsData>() {
            @Override
            public void onSuccess(NewsData newsData) {
                newsDataListener.onSuccess(newsData);
            }
            @Override
            public void onError(String errorMessage, ErrorCode code) {
                super.onError(errorMessage, code);
                newsDataListener.onFailure(errorMessage, code);
            }
        });
    }
}
