package playo.co.news.home;

import okhttp3.internal.framed.ErrorCode;
import playo.co.news.entity.NewsData;

/**
 * Created by Divum on 15-10-2017.
 */

public class NewsContract {

    interface NewsModel {

        void getNewsData(NewsDataListener NewsDataListener);

        interface NewsDataListener{

            void noInterNet();

            void onSuccess(NewsData newsData);

            void onFailure(String errorMsg,ErrorCode errorCode);

            void onNoItem();
        }
    }

    public interface NewsView {
        void noInterNet();

        void onSuccess(NewsData newsData);

        void onFailure(String errorMsg,ErrorCode errorCode);

        void onNoItem();


    }

    interface NewsPresent {
        void getNewsData();
    }
}
