package com.example.myapplication.Assets;

import android.media.MediaPlayer;

import com.example.myapplication.Sprites.Resp;

import java.io.IOException;

public class Sounds {
    public static int musicOn = 1;

    public static MediaPlayer hihat_audio;
    public static MediaPlayer hihat_audio_fr;
    public static MediaPlayer hihat_audio_ar;
    public static MediaPlayer background_music;
    public static MediaPlayer correct_audio;
    public static MediaPlayer correct_audio_fr;
    public static MediaPlayer correct_audio_ar;
    public static MediaPlayer tryagain_audio;
    public static MediaPlayer tryagain_audio_fr;
    public static MediaPlayer tryagain_audio_ar;

    public static MediaPlayer Questions_who[] = {null, null, null, null, null};
    public static MediaPlayer Questions_what[] = {null, null, null, null, null};
    public static MediaPlayer Questions_where[] = {null, null, null, null, null};

    public static MediaPlayer Questions_who_fr[] = {null, null, null, null, null};
    public static MediaPlayer Questions_what_fr[] = {null, null, null, null, null};
    public static MediaPlayer Questions_where_fr[] = {null, null, null, null, null};

    public static MediaPlayer Questions_who_ar[] = {null, null, null, null, null};
    public static MediaPlayer Questions_what_ar[] = {null, null, null, null, null};
    public static MediaPlayer Questions_where_ar[] = {null, null, null, null, null};

    public static void play(Resp resp) {

        Sounds.background_music.pause();
        resp.getmAndroidSound().start();
    }

    public static void stop() {

        Sounds.background_music.pause();
        Sounds.tryagain_audio.stop();
        Sounds.tryagain_audio_fr.stop();
        Sounds.tryagain_audio_ar.stop();
        Sounds.correct_audio_fr.stop();
        Sounds.correct_audio_ar.stop();
        Sounds.correct_audio.stop();
        Sounds.hihat_audio.stop();
        Sounds.hihat_audio_fr.stop();
        Sounds.hihat_audio_ar.stop();
        for (int i = 0; i < 5; i++) {

            Sounds.Questions_who[i].stop();
            Sounds.Questions_what[i].stop();
            Sounds.Questions_where[i].stop();
            Sounds.Questions_who_fr[i].stop();
            Sounds.Questions_what_fr[i].stop();
            Sounds.Questions_where_fr[i].stop();
            Sounds.Questions_who_ar[i].stop();
            Sounds.Questions_what_ar[i].stop();
            Sounds.Questions_where_ar[i].stop();

        }
    }

    public static void playSound(MediaPlayer sound) throws IOException {

        Sounds.stop();
        sound.prepare();
        sound.start();
    }
}

