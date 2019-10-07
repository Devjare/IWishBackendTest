package com.devjare.business;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.Toast;

import services.Reader;
import services.ServerCallback;

public class ServerReader {

    private static Reader reader;

    private static Bitmap response;

    public static Bitmap SendImageRequest(Context context, String url){

        reader = new Reader();

        reader = reader.ReadFromServer(context, url, new ServerCallback() {
            @Override
            public void onSuccess(Bitmap bitmap) {
                response = bitmap;
            }
        });


        if (response == null){
            Toast.makeText(context, "SERVER!, NULL", Toast.LENGTH_SHORT).show();
            return null;
        }

        return response;
    }

}
