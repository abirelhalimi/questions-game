package com.example.myapplication.Sprites;

import android.media.MediaPlayer;
import android.provider.MediaStore;

import com.example.emobadaragaminglib.Base.Game;
import com.example.emobadaragaminglib.Base.Image;
import com.example.emobadaragaminglib.Components.Sprite;
import com.example.emobadaragaminglib.Implementation.AndroidSound;

public class Resp extends Sprite {
    private MediaPlayer mAndroidSound;


    public Resp(Game game, Image image, MediaPlayer sound, int x, int y, int height, int width) {
        super(image, x, y, height, width);
        this.mAndroidSound = sound;


    }

    public MediaPlayer getmAndroidSound() {
        return mAndroidSound;
    }

}
