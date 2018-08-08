package com.example.ramya.adkoin;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.Random;

/**
 * Created by kavi on 4/8/18.
 */

public class CustomPhoneStateListener extends Activity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {


        ImageView close;
        ImageView banner;

        String url[] = {
                "https://pbs.twimg.com/profile_images/874661809139073025/X8yzIhNy_400x400.jpg",
                "https://storage.googleapis.com/gd-wagtail-prod-assets/original_images/evolving_google_identity_share.jpg",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSbC24wxj7HNxqtewPrOMHcbYG-TgBBqe_xPHUa8CmVuoBqGneU",
                "https://cdn.mos.cms.futurecdn.net/2sDGvXSwDRvrJqq9YN5oc4-480-80.jpg"
        };

        Random rand = new Random();

        int  n = rand.nextInt(3);

        //try {
//            requestWindowFeature(Window.FEATURE_NO_TITLE);
//            this.setFinishOnTouchOutside(false);
//            Log.d("flag2", "flag2");

        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);

//            getWindow().addFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
//            getWindow().addFlags(
//                    WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL);

//            Log.d("flagy ", "flagy");

        setContentView(R.layout.popup);

//            Log.d("flagz ", "flagz");

//            String number = getIntent().getStringExtra(
//                    TelephonyManager.EXTRA_INCOMING_NUMBER);
//            TextView text = (TextView) findViewById(R.id.text1);
//            text.setText("Incoming call from " + number);



        banner = findViewById(R.id.banner);

        Picasso.with(this)
                .load(url[n])
                .resize(400,300)                       // optional
                .into(banner);

        final DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().getWindowManager().getDefaultDisplay();
        getWindow().setBackgroundDrawable(null);

        //getWindow().setLayout((int)(width*.8),(int)(height*.3));



        close = findViewById(R.id.close);

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });








        // }
//        catch (Exception e) {
//            Log.d("Exception", e.toString());
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
    }
}
