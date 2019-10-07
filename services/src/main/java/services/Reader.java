package services;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.Image;
import android.media.MediaMetadataRetriever;
import android.media.MediaSync;
import android.widget.ImageView;
import android.widget.Toast;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;

public class Reader {

    Bitmap result;

    public Reader(){
        result = null;
    }

    public Reader ReadFromServer(final Context context, String url, final ServerCallback callback){

        ImageRequest request = new ImageRequest(url, new Response.Listener<Bitmap>(){
            @Override
            public void onResponse(Bitmap response) {
                Toast.makeText(context, "Response: " + response, Toast.LENGTH_SHORT).show();
                callback.onSuccess(response);
            }
        }, 0, 0, ImageView.ScaleType.CENTER_CROP, null, new Response.ErrorListener(){
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(context, "Failed, error: " + error.getMessage(), Toast.LENGTH_SHORT).show();
                result = null;
            }
        });
        VolleySingleton.getInstance(context).addToRequestQueue(request);

        return this;
    }

    public Bitmap getResult(){
        return result;
    }
    public void setResult(Bitmap bitmap){
        this.result = bitmap;
    }
}
