package com.example.myapplication.GameViews;

import com.example.emobadaragaminglib.Base.Game;
import com.example.emobadaragaminglib.Base.Graphics;
import com.example.emobadaragaminglib.Base.Screen;
import com.example.emobadaragaminglib.Components.Sprite;
import com.example.myapplication.Assets.Images;
import com.example.myapplication.Assets.Sounds;
import com.example.myapplication.GameViews.eng.AdvancedScreen;
import com.example.myapplication.GameViews.eng.BeginnerScreen;
import com.example.myapplication.GameViews.eng.IntermediateScreen;
import com.example.myapplication.Sprites.Resp;
import com.example.myapplication.Sprites.StartingSprite;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

import android.content.Context;
import android.content.Intent;


public class StartingScreen extends Screen {

    private StartingSprite title_eng;
    private StartingSprite background;
    private StartingSprite bgn_btn;
    private StartingSprite int_btn;
    private StartingSprite adv_btn;
    private Resp home, exit;

    public StartingScreen(Game game) {
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
        }

        background = new StartingSprite(game, Images.background_img, 0, 0, game.getGraphics().getHeight(), game.getGraphics().getWidth());
        title_eng = new StartingSprite(game, Images.title_eng_img, 0, ((int) (game.getGraphics().getHeight() / (29.16))), ((int) (game.getGraphics().getHeight() / (3.76))), (int) (game.getGraphics().getWidth()));
        bgn_btn = new StartingSprite(game, Images.bgn_img, (int) (game.getGraphics().getWidth() / (2.92)), (int) (game.getGraphics().getHeight() / (1.68)), (int) (game.getGraphics().getHeight() / (2.77)), (int) (game.getGraphics().getWidth() / (3.6)));
        int_btn = new StartingSprite(game, Images.int_img, (int) (game.getGraphics().getWidth() / (20)), (int) (game.getGraphics().getHeight() / (3.01)), (int) (game.getGraphics().getHeight() / (2.77)), (int) (game.getGraphics().getWidth() / (3.73)));
        adv_btn = new StartingSprite(game, Images.adv_img, (int) (game.getGraphics().getWidth() / (1.48)), (int) (game.getGraphics().getHeight() / (2.85)), (int) (game.getGraphics().getHeight() / (2.77)), (int) (game.getGraphics().getWidth() / (3.73)));

        home = new Resp(game, Images.setting, Sounds.tryagain_audio, (int) (game.getGraphics().getWidth() / (1.263)), (int) (game.getGraphics().getHeight() / (1.133)), (int) (game.getGraphics().getHeight() / (8.534)), (int) (game.getGraphics().getWidth() / (4.8)));
        exit = new Resp(game, Images.exit, Sounds.hihat_audio_fr, 0, (int) (game.getGraphics().getHeight() / (1.133)), (int) (game.getGraphics().getHeight() / (8.534)), (int) (game.getGraphics().getWidth() / (4.8)));

        //Adding Sprites
        addSprite(background);
        addSprite(title_eng);
        addSprite(bgn_btn);
        addSprite(int_btn);
        addSprite(adv_btn);
        addSprite(home);
        addSprite(exit);
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

        if (s != null && s.equals(bgn_btn)) {
            try {
                game.setScreen(new BeginnerScreen(game));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (s != null && s.equals(int_btn)) {
            try {
                game.setScreen(new IntermediateScreen(game));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (s != null && s.equals(adv_btn)) {
            try {
                game.setScreen(new AdvancedScreen(game));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (s != null && s.equals(home)) {
            game.setScreen(new SettingScreen(game));
        }
        if (s != null && s.equals(exit)) {
            System.exit(0);
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
