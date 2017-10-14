package playo.co.news.network;

import okhttp3.internal.framed.ErrorCode;

/**
 * Created by Divum on 14-10-2017.
 */

public abstract class UiCallBack<T> {
    public abstract void onSuccess(T t);

    public void onError(String errorMessage,ErrorCode code){

    }
    public void onError(int stringId,ErrorCode code){

    }
}
