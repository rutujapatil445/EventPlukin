package com.example.eventplaneer;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyService extends Service {
    MediaPlayer mp;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    public void onCreate()
    {
        Toast.makeText(this,"Booking Confirmed !!",Toast.LENGTH_LONG).show();
        mp=MediaPlayer.create(this,R.raw.notification);
        mp.setLooping(false);
    }

    public void onStart(Intent i1,int startId) {
        mp.start();
    }

    public void onDestroy(){
        mp.stop();
    }
}
