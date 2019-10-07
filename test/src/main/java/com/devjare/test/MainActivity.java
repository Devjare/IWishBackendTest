package com.devjare.test;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.devjare.business.ServerReader;

public class MainActivity extends AppCompatActivity {

    ImageView ivView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivView = findViewById(R.id.imageView);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://192.168.56.1/raphtalia.png";
                Bitmap img = ServerReader.SendImageRequest(getApplicationContext(), url);


//                ImageRequest request = new ImageRequest(url, new Response.Listener<Bitmap>() {
//                    @Override
//                    public void onResponse(Bitmap response) {
//                        ivView.setImageBitmap(response);
//                    }
//                }, 0, 0, ImageView.ScaleType.CENTER_CROP, null, new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//                        Toast.makeText(getApplicationContext(), "Failed to load!", Toast.LENGTH_SHORT).show();
//                    }
//                });
//                RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
//                queue.add(request);


                if (img != null)
                    ivView.setImageBitmap(img);
                // else
                    // Toast.makeText(getApplicationContext(), "Failed", Toast.LENGTH_SHORT).show();


            }
        });

    }
}
