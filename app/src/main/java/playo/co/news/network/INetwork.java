package playo.co.news.network;

import playo.co.news.entity.NewsData;

/**
 * Created by Divum on 14-10-2017.
 */

public interface INetwork {

    public void getFoodData(UiCallBack<NewsData> uiCallBack);

}
