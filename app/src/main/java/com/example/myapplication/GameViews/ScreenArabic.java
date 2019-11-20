package com.example.myapplication.GameViews;

import android.content.Context;
import android.content.Intent;

import com.e_mobadara.audiomanaging.AudioSettingsActivity;
import com.example.emobadaragaminglib.Base.Game;
import com.example.emobadaragaminglib.Base.Graphics;
import com.example.emobadaragaminglib.Base.Screen;
import com.example.emobadaragaminglib.Components.Sprite;
import com.example.myapplication.Assets.Images;
import com.example.myapplication.Assets.Sounds;
import com.example.myapplication.Sprites.Resp;
import com.example.myapplication.Sprites.StartingSprite;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;


public class ScreenArabic extends Screen {

    private StartingSprite mr_btn, ar_btn;
    private StartingSprite background;
    private Resp home, mark, logo;

    int X = game.getGraphics().getWidth();
    int Y = game.getGraphics().getHeight();

    public ScreenArabic(Game game) {
        super(game);

        Images.index = 0;
        Sounds.background_music.start();
        Arrays.sort(Images.Nums, new Comparator<Integer>() {
            Random r = new Random();

            public int compare(Integer o1, Integer o2) {
                return r.nextInt();
            }
        });

        int X = game.getGraphics().getWidth();
        int Y = game.getGraphics().getHeight();

        Sounds.background_music.start();
        Sounds.background_music.setLooping(true);

        background = new StartingSprite(game, Images.backblue, 0, 0, Y, X);
        ar_btn = new StartingSprite(game, Images.ar, 0, ((int) (Y / (4.5))), ((int) (Y / (3.76))), (int) (X));
        mr_btn = new StartingSprite(game, Images.mr, 0, 2 * ((int) (Y / (4.5))), ((int) (Y / (3.76))), (int) (X));
        mark = new Resp(game, Images.settingo, Sounds.hihat_audio, 0, (int) (game.getGraphics().getHeight() / (1.25)), (int) (Y / (5.5)), (int) (Y / (5.5)));
        logo = new Resp(game, Images.logo, Sounds.hihat_audio, (int) (X / 2.5), 0, (int) (X / (5)), (int) (X / (5)));


        //Adding Sprites
        addSprite(background);
        addSprite(ar_btn);
        addSprite(mr_btn);
        addSprite(mark);
        addSprite(logo);

    }

    @Override
    public void render(float deltaTime) {

        Graphics g = game.getGraphics();
        g.drawARGB(255, 0, 0, 0);
    }

    @Override
    public void handleTouchDown(int x, int y, int pointer) {

        super.handleTouchDown(x, y, pointer);
        Sprite s = getDraggedSprite();

        if (s != null && s.equals(ar_btn)) {
            game.setScreen(new StartingScreenArabic(game));
        }

        if (s != null && s.equals(mr_btn)) {
            game.setScreen(new StartingScreenMoroccan(game));
        }

        if (s != null && s.equals(mark)) {
            game.setScreen(new SettingScreen(game));

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
