package services;

import android.graphics.Bitmap;
import android.media.Image;
import android.media.MediaMetadataRetriever;
import android.media.MediaSync;
import android.widget.ImageView;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;

public class Reader {

    Bitmap result;

    public Reader(){

    }

    public Reader ReadFromServer(String url){

        ImageRequest request = new ImageRequest(url, new Response.Listener<Bitmap>(){
            @Override
            public void onResponse(Bitmap response) {
                result = response;
            }
        }, 0, 0, ImageView.ScaleType.CENTER_CROP, null, new Response.ErrorListener(){
            @Override
            public void onErrorResponse(VolleyError error) {
                result = null;
            }
        });
        return this;
    }

    public Bitmap getResult(){
        return result;
    }

}
