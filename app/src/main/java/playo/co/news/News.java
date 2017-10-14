package playo.co.news;

import android.app.Application;

import playo.co.news.network.AppLib;

/**
 * Created by Divum on 15-10-2017.
 */

public class News extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AppLib.getAppLib(getApplicationContext());
    }
}
