package com.devjare.business;

import android.graphics.Bitmap;
import android.media.Image;

import androidx.annotation.RequiresPermission;

import services.Reader;

public class ServerReader {

    public static Bitmap SendImageRequest(String url){

        return new Reader().ReadFromServer(url).getResult();
    }

}
