package com.example.task04_08;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class LivedataTest extends ViewModel {
    MutableLiveData<Integer> conn;

    Context context;

    public MutableLiveData getdata(Context context){
    conn=new MutableLiveData<>();
    this.context=context;
    ConnectivityManager connectivityManager=(ConnectivityManager) context.getSystemService(context.CONNECTIVITY_SERVICE);
    NetworkInfo networkInfo=(NetworkInfo) connectivityManager.getActiveNetworkInfo();
    conn.setValue(2);

    if (networkInfo!=null)
    {
        if (networkInfo.getType() == ConnectivityManager.TYPE_WIFI) {
            conn.postValue(101);
            return conn;
        }
        if (networkInfo.getType() == ConnectivityManager.TYPE_MOBILE) {
            conn.postValue(102);
            return conn;
        }



    }
    else {
        conn.setValue(0);
        return conn;
    }



    return conn;
}


}
