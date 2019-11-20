package com.e_mobadara.audiomanaging;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

public class AudioSettingsActivity extends AppCompatActivity {

    Button server_button, localy_button, managing_button;
    private SeekBar volumeSeekbar = null;
    private AudioManager audioManager = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio_settings);


        server_button = findViewById(R.id.audio_file_server_button);
        localy_button = findViewById(R.id.audio_file_localy_button);
        managing_button = findViewById(R.id.audio_file_managing_button);

      initControls();
        /*server_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplication(),ExportImportActivity.class);
                i.putExtra("WorkToDo","server");
                startActivity(i);
                finish();
            }
        });
        */

        localy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplication(),chooseImportOrExportActivity.class);
                i.putExtra("WorkToDo","localy");
                startActivity(i);
                finish();
            }
        });

        managing_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplication(),MainAudioModuleActivity.class);
                startActivity(i);
                finish();
            }
        });

    }
  private void initControls()
  {
    try
    {
      volumeSeekbar = (SeekBar)findViewById(R.id.seekBar1);
      audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
      volumeSeekbar.setMax(audioManager
        .getStreamMaxVolume(AudioManager.STREAM_MUSIC));
      volumeSeekbar.setProgress(audioManager
        .getStreamVolume(AudioManager.STREAM_MUSIC));


      volumeSeekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
      {
        @Override
        public void onStopTrackingTouch(SeekBar arg0)
        {
        }

        @Override
        public void onStartTrackingTouch(SeekBar arg0)
        {
        }

        @Override
        public void onProgressChanged(SeekBar arg0, int progress, boolean arg2)
        {
          audioManager.setStreamVolume(AudioManager.STREAM_MUSIC,
            progress, 0);
        }
      });
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
  public void play(View view) {
    finish();
  }
}
