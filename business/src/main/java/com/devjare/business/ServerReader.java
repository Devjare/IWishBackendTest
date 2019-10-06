package com.devjare.business;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.Image;

import androidx.annotation.RequiresPermission;

import services.Reader;

public class ServerReader {

    public static Bitmap SendImageRequest(Context context, String url){

        return new Reader().ReadFromServer(context, url).getResult();
    }

}
