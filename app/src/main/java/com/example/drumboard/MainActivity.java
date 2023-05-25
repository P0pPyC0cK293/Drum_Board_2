package com.example.drumboard;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton btnBass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBass = findViewById(R.id.btn_bass_drum);
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


        btnBass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playBass();
            }
        });
    }
}