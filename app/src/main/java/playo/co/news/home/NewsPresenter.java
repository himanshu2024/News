package playo.co.news.home;

import okhttp3.internal.framed.ErrorCode;
import playo.co.news.entity.NewsData;

/**
 * Created by Divum on 15-10-2017.
 */

public class NewsPresenter implements NewsContract.NewsModel.NewsDataListener, NewsContract.NewsPresent {

    private NewsContract.NewsView mNewsView;
    private NewsContract.NewsModel mNewsModel;

    public NewsPresenter(NewsContract.NewsView newsView){
        this.mNewsView=newsView;
        this.mNewsModel=new NewsModel();
    }

    @Override
    public void getNewsData() {
        mNewsModel.getNewsData(this);
    }

    @Override
    public void noInterNet() {
        mNewsView.noInterNet();
    }

    @Override
    public void onSuccess(NewsData newsData) {
        mNewsView.onSuccess(newsData);
    }

    @Override
    public void onFailure(String errorMsg, ErrorCode errorCode) {
        mNewsView.onFailure(errorMsg,errorCode);
    }

    @Override
    public void onNoItem() {

    }
}
