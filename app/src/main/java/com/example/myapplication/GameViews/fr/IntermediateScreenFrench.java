package com.example.myapplication.GameViews.fr;

import com.example.emobadaragaminglib.Base.Game;
import com.example.emobadaragaminglib.Base.Graphics;
import com.example.emobadaragaminglib.Base.Image;
import com.example.emobadaragaminglib.Base.Screen;
import com.example.emobadaragaminglib.Components.Sprite;
import com.example.myapplication.Assets.Images;
import com.example.myapplication.Assets.Sounds;
import com.example.myapplication.Assets.Stat;
import com.example.myapplication.GameViews.StartingScreenFrench;
import com.example.myapplication.MainActivityEng;
import com.example.myapplication.Sprites.Resp;
import com.example.myapplication.Sprites.StartingSprite;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Random;

public class IntermediateScreenFrench extends Screen {

    private Resp rsp;
    private Resp qst;
    private Resp rsp1;
    private Resp rsp2, home, mark, finger, next;
    private StartingSprite background;
    private int success, fail;

    Date date1;

    public IntermediateScreenFrench(Game game) throws IOException {
        super(game);
        Stat.debut = Stat.time();
        date1 = new Date();
        Arrays.sort(Images.Others_what, new Comparator<Image>() {
            Random r = new Random();

            public int compare(Image o1, Image o2) {
                return r.nextInt();
            }
        });

        Images.position[0] = 0;
        Images.position[1] = (int) (game.getGraphics().getWidth() / (3));
        Images.position[2] = (int) (game.getGraphics().getWidth() / (1.5));

        Arrays.sort(Images.position, new Comparator<Integer>() {
            Random r = new Random();

            public int compare(Integer o1, Integer o2) {
                return r.nextInt();
            }
        });
        Sounds.playSound(Sounds.Questions_what_fr[Images.Nums[Images.index]]);

        background = new StartingSprite(game, Images.background_img, 0, 0, game.getGraphics().getHeight(), game.getGraphics().getWidth());
        qst = new Resp(game, Images.Questions_what_fr[Images.Nums[Images.index]], Sounds.Questions_what_fr[Images.Nums[Images.index]], 0, 0, (int) (game.getGraphics().getHeight() / (2.24)), (int) (game.getGraphics().getWidth()));
        rsp = new Resp(game, Images.Answers_what[Images.Nums[Images.index]], Sounds.correct_audio_fr, Images.position[0], (int) (game.getGraphics().getHeight() / (1.68)), (int) (game.getGraphics().getHeight() / (5.334)), (int) (game.getGraphics().getWidth() / (3)));
        rsp1 = new Resp(game, Images.Others_what[0], Sounds.tryagain_audio_fr, Images.position[1], (int) (game.getGraphics().getHeight() / (1.68)), (int) (game.getGraphics().getHeight() / (5.334)), (int) (game.getGraphics().getWidth() / (3)));
        rsp2 = new Resp(game, Images.Others_what[3], Sounds.tryagain_audio_fr, Images.position[2], (int) (game.getGraphics().getHeight() / (1.68)), (int) (game.getGraphics().getHeight() / (5.334)), (int) (game.getGraphics().getWidth() / (3)));

        home = new Resp(game, Images.home, Sounds.tryagain_audio_fr, (int) (game.getGraphics().getWidth() / (1.263)), (int) (game.getGraphics().getHeight() / (1.133)), (int) (game.getGraphics().getHeight() / (8.534)), (int) (game.getGraphics().getWidth() / (4.8)));
        mark = new Resp(game, Images.mark, Sounds.hihat_audio_fr, 0, (int) (game.getGraphics().getHeight() / (1.133)), (int) (game.getGraphics().getHeight() / (8.534)), (int) (game.getGraphics().getWidth() / (4.8)));
        finger = new Resp(game, Images.finger, Sounds.hihat_audio_fr, Images.position[0], (int) (game.getGraphics().getHeight() / (1.68)) - (int) (game.getGraphics().getWidth() / (5)), (int) (game.getGraphics().getHeight() / (5.5)), (int) (game.getGraphics().getWidth() / (5)));
        next = new Resp(game, Images.next, Sounds.hihat_audio, game.getGraphics().getWidth() / 21, game.getGraphics().getHeight() / 3, (int) (game.getGraphics().getHeight() / (2.24)), (int) (game.getGraphics().getHeight() / (2.24)));


        //Adding Sprites
        addSprite(background);
        addSprite(qst);
        addSprite(rsp);
        addSprite(rsp1);
        addSprite(rsp2);
        addSprite(home);
        addSprite(mark);
    }


    public void handleTouchDown(int x, int y, int pointer) {
        super.handleTouchDown(x, y, pointer);
        Sprite s = getDraggedSprite();

        if (s != null && s.equals(rsp)) {
            if (Images.index < 4) {
                Images.index++;
            } else {
                Images.index = 0;
            }
            Resp ss = (Resp) s;
            try {
                Sounds.playSound(ss.getmAndroidSound());
            } catch (IOException e) {
                e.printStackTrace();
            }
            success += 1;
            Stat.addDelay(date1, new Date());
            addSprite(next);

        }

        if (s != null && s.equals(rsp1)) {
            Resp ss = (Resp) s;
            try {
                Sounds.playSound(ss.getmAndroidSound());
            } catch (IOException e) {
                e.printStackTrace();
            }
            fail += 1;
        }

        if (s != null && s.equals(rsp2)) {
            Resp ss = (Resp) s;
            try {
                Sounds.playSound(ss.getmAndroidSound());
            } catch (IOException e) {
                e.printStackTrace();
            }
            fail += 1;
        }

        if (s != null && s.equals(qst)) {
            Resp ss = (Resp) s;
            try {
                Sounds.playSound(ss.getmAndroidSound());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (s != null && s.equals(home)) {
            Stat.saveStat(game, Stat.success, Stat.fail, "2");
            Sounds.stop();
            game.setScreen(new StartingScreenFrench(game));
        }
        if (s != null && s.equals(next)) {
            try {
                game.setScreen(new IntermediateScreenFrench((MainActivityEng) game));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (s != null && s.equals(mark)) {
            Resp ss = (Resp) s;
            try {
                Sounds.playSound(ss.getmAndroidSound());
            } catch (IOException e) {
                e.printStackTrace();
            }
            addSprite(finger);
        }
    }


    @Override
    public void render(float deltaTime) {

        Graphics g = game.getGraphics();
        g.drawARGB(255, 0, 0, 0);

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
}
