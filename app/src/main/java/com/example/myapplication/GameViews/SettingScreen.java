package com.example.myapplication.GameViews;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;

import com.e_mobadara.audiomanaging.AudioSettingsActivity;
import com.e_mobadara.audiomanaging.moblibAudioFileManager;
import com.example.emobadaragaminglib.Base.Game;
import com.example.emobadaragaminglib.Base.Graphics;
import com.example.emobadaragaminglib.Base.Screen;
import com.example.emobadaragaminglib.Components.Sprite;
import com.example.myapplication.Assets.Images;
import com.example.myapplication.Assets.Sounds;
import com.example.myapplication.R;
import com.example.myapplication.Sprites.Resp;
import com.example.myapplication.Sprites.StartingSprite;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;


public class SettingScreen extends Screen {

    private StartingSprite eng_btn, fr_btn, ar_btn;
    private StartingSprite background;
    private Resp mark, music, off;

    int X = game.getGraphics().getWidth();
    int Y = game.getGraphics().getHeight();

    public SettingScreen(Game game) {
        super(game);

        Images.index = 0;
        Arrays.sort(Images.Nums, new Comparator<Integer>() {
            Random r = new Random();

            public int compare(Integer o1, Integer o2) {
                return r.nextInt();
            }
        });

        if (Sounds.musicOn == 1) {
            Sounds.background_music.start();
            Sounds.background_music.setLooping(true);
        }

        background = new StartingSprite(game, Images.backblue, 0, 0, Y, X);
        eng_btn = new StartingSprite(game, Images.eng, 0, (int) (Y / (8)), (int) (Y / (3.76)), X);
        fr_btn = new StartingSprite(game, Images.fr, 0, (int) (Y / (3.5)), ((int) (Y / (3.76))), (int) (X));
        ar_btn = new StartingSprite(game, Images.ar, 0, (int) (Y / (2.12)), ((int) (Y / (3.76))), (int) (X));
        mark = new Resp(game, Images.settingo, Sounds.hihat_audio, 0, 0, (int) (Y / (6.5)), (int) (Y / (6.5)));
        music = new Resp(game, Images.music, Sounds.hihat_audio, (int) (game.getGraphics().getWidth() / (1.3)), (int) (Y / (40)), (int) (game.getGraphics().getHeight() / (8.534)), (int) (game.getGraphics().getWidth() / (4.8)));
        off = new Resp(game, Images.off, Sounds.hihat_audio, (int) (X / (1.28)), (int) (Y / (33)), 0, 0);


        //Adding Sprites
        addSprite(background);
        addSprite(eng_btn);
        addSprite(fr_btn);
        addSprite(ar_btn);
        addSprite(mark);
        addSprite(music);
        addSprite(off);
    }

    @Override
    public void render(float deltaTime) {

        Graphics g = game.getGraphics();
        g.drawARGB(255, 0, 0, 0);

        if (Sounds.musicOn == 1) {
            off.setHeight(0);
            off.setWidth(0);
        } else {
            off.setHeight((int) (game.getGraphics().getHeight() / (8.534)));
            off.setWidth((int) (game.getGraphics().getWidth() / (5)));
        }
    }

    @Override
    public void handleTouchDown(int x, int y, int pointer) {

        super.handleTouchDown(x, y, pointer);
        Sprite s = getDraggedSprite();

        if (s != null && s.equals(eng_btn)) {
            Sounds.correct_audio = moblibAudioFileManager.getRandomAudioFile((Context) game, "excellent", "AN");
            if (Sounds.correct_audio == null)
                Sounds.correct_audio = MediaPlayer.create((Context) game, R.raw.goodjob);

            Sounds.tryagain_audio = moblibAudioFileManager.getRandomAudioFile((Context) game, "encouragement", "AN");
            if (Sounds.tryagain_audio == null)
                Sounds.tryagain_audio = MediaPlayer.create((Context) game, R.raw.tryagain);

            game.setScreen(new StartingScreen(game));
        }

        if (s != null && s.equals(fr_btn)) {

            Sounds.correct_audio_fr = moblibAudioFileManager.getRandomAudioFile((Context) game, "excellent", "FR");
            if (Sounds.correct_audio_fr == null)
                Sounds.correct_audio_fr = MediaPlayer.create((Context) game, R.raw.goodjobfr);

            Sounds.tryagain_audio_fr = moblibAudioFileManager.getRandomAudioFile((Context) game, "encouragement", "FR");
            if (Sounds.tryagain_audio_fr == null)
                Sounds.tryagain_audio_fr = MediaPlayer.create((Context) game, R.raw.tryagainfr);

            game.setScreen(new StartingScreenFrench(game));
        }

        if (s != null && s.equals(ar_btn)) {

            Sounds.correct_audio_ar = moblibAudioFileManager.getRandomAudioFile((Context) game, "excellent", "AR");
            if (Sounds.correct_audio_ar == null)
                Sounds.correct_audio_ar = MediaPlayer.create((Context) game, R.raw.goodjobar);

            Sounds.tryagain_audio_ar = moblibAudioFileManager.getRandomAudioFile((Context) game, "encouragement", "AR");
            if (Sounds.tryagain_audio_ar == null)
                Sounds.tryagain_audio_ar = MediaPlayer.create((Context) game, R.raw.tryagainar);

            game.setScreen(new ScreenArabic(game));
        }

        if (s != null && s.equals(music)) {
            Sounds.musicOn = 0;
            Sounds.background_music.pause();
        }

        if (s != null && s.equals(off)) {
            Sounds.musicOn = 1;
            Sounds.background_music.start();
        }

        if (s != null && s.equals(mark)) {
            Sounds.background_music.pause();
            Sounds.musicOn = 0;
            Intent i = new Intent((Context) game, AudioSettingsActivity.class);
            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            ((Context) game).getApplicationContext().startActivity(i);

        }
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void backButton() {

    }

    @Override
    public void dispose() {
        super.dispose();
        System.gc();
    }
}
