package com.example.drumboard;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton btnBass;
    private ImageButton btnCrash;
    private ImageButton btnRide;
    private ImageButton btnHi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBass = findViewById(R.id.btn_bass_drum);

        btnBass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playBass();
            }
        });


        btnCrash = findViewById(R.id.btn_crash_symbal);

        btnCrash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playCrash();
            }
        });

        btnRide = findViewById(R.id.btn_ride_cymbal);
        btnRide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playRide();
            }
        });

        btnHi = findViewById(R.id.btn_hi_hat);
        btnHi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playHi();
            }
        });
    }

    private void playBass() {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sample_bass_hit);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp=null;
            }
        });
    }

    private void playCrash() {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sample_crash_hit);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp=null;
            }
        });
    }

    private void playRide() {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sample_ride_hit);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp=null;
            }
        });
    }

    private void playHi() {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sample_hi_hit);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp=null;
            }
        });
    }
}