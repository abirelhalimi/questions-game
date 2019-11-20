package com.example.myapplication;


import android.media.MediaPlayer;


import com.e_mobadara.audiomanaging.moblibAudioFileManager;
import com.example.emobadaragaminglib.Base.Graphics;
import com.example.emobadaragaminglib.Base.Screen;
import com.example.emobadaragaminglib.Implementation.AndroidGame;

import com.example.myapplication.Assets.Images;
import com.example.myapplication.Assets.Sounds;

import com.example.myapplication.GameViews.SettingScreen;


public class MainActivityEng extends AndroidGame {

    public Screen getInitScreen() {

        Images.background_img = getGraphics().newImage(R.drawable.bg, Graphics.ImageFormat.ARGB8888, getResources());
        Images.sound = getGraphics().newImage(R.drawable.sound, Graphics.ImageFormat.ARGB8888, getResources());
        Images.bgimg_white = getGraphics().newImage(R.drawable.bg_white, Graphics.ImageFormat.ARGB8888, getResources());
        Images.home = getGraphics().newImage(R.drawable.home, Graphics.ImageFormat.ARGB8888, getResources());
        Images.mark = getGraphics().newImage(R.drawable.mark, Graphics.ImageFormat.ARGB8888, getResources());
        Images.eng = getGraphics().newImage(R.drawable.eng, Graphics.ImageFormat.ARGB8888, getResources());
        Images.fr = getGraphics().newImage(R.drawable.fr, Graphics.ImageFormat.ARGB8888, getResources());
        Images.ar = getGraphics().newImage(R.drawable.ar, Graphics.ImageFormat.ARGB8888, getResources());
        Images.mr = getGraphics().newImage(R.drawable.mr, Graphics.ImageFormat.ARGB8888, getResources());
        Images.setting = getGraphics().newImage(R.drawable.setting, Graphics.ImageFormat.ARGB8888, getResources());
        Images.settingo = getGraphics().newImage(R.drawable.settingo, Graphics.ImageFormat.ARGB8888, getResources());
        Images.backblue = getGraphics().newImage(R.drawable.backlog, Graphics.ImageFormat.ARGB8888, getResources());
        Images.finger = getGraphics().newImage(R.drawable.finger, Graphics.ImageFormat.ARGB8888, getResources());
        Images.next = getGraphics().newImage(R.drawable.next, Graphics.ImageFormat.ARGB8888, getResources());
        Images.exit = getGraphics().newImage(R.drawable.exit, Graphics.ImageFormat.ARGB8888, getResources());
        Images.logo = getGraphics().newImage(R.drawable.logo, Graphics.ImageFormat.ARGB8888, getResources());
        Images.music = getGraphics().newImage(R.drawable.music, Graphics.ImageFormat.ARGB8888, getResources());
        Images.off = getGraphics().newImage(R.drawable.off, Graphics.ImageFormat.ARGB8888, getResources());

        //loading answers
        Images.firefighter = getGraphics().newImage(R.drawable.firefighter, Graphics.ImageFormat.ARGB8888, getResources());
        Images.mom = getGraphics().newImage(R.drawable.mother, Graphics.ImageFormat.ARGB8888, getResources());
        Images.fish = getGraphics().newImage(R.drawable.fish, Graphics.ImageFormat.ARGB8888, getResources());
        Images.kid = getGraphics().newImage(R.drawable.kid3, Graphics.ImageFormat.ARGB8888, getResources());
        Images.pilot = getGraphics().newImage(R.drawable.pilot, Graphics.ImageFormat.ARGB8888, getResources());
        Images.baby = getGraphics().newImage(R.drawable.baby, Graphics.ImageFormat.ARGB8888, getResources());
        Images.gazelle = getGraphics().newImage(R.drawable.gazelle, Graphics.ImageFormat.ARGB8888, getResources());
        Images.chair = getGraphics().newImage(R.drawable.chair, Graphics.ImageFormat.ARGB8888, getResources());
        Images.school = getGraphics().newImage(R.drawable.school, Graphics.ImageFormat.ARGB8888, getResources());
        Images.scissors = getGraphics().newImage(R.drawable.scissors, Graphics.ImageFormat.ARGB8888, getResources());
        Images.honey = getGraphics().newImage(R.drawable.honey, Graphics.ImageFormat.ARGB8888, getResources());
        Images.pencil = getGraphics().newImage(R.drawable.pencil, Graphics.ImageFormat.ARGB8888, getResources());
        Images.umbrella = getGraphics().newImage(R.drawable.umbrella, Graphics.ImageFormat.ARGB8888, getResources());
        Images.shoes = getGraphics().newImage(R.drawable.shoes, Graphics.ImageFormat.ARGB8888, getResources());
        Images.bed = getGraphics().newImage(R.drawable.bed, Graphics.ImageFormat.ARGB8888, getResources());
        Images.book = getGraphics().newImage(R.drawable.book, Graphics.ImageFormat.ARGB8888, getResources());
        Images.crayons = getGraphics().newImage(R.drawable.crayons, Graphics.ImageFormat.ARGB8888, getResources());
        Images.door = getGraphics().newImage(R.drawable.door, Graphics.ImageFormat.ARGB8888, getResources());
        Images.grandma = getGraphics().newImage(R.drawable.grandma, Graphics.ImageFormat.ARGB8888, getResources());
        Images.grandpa = getGraphics().newImage(R.drawable.grandpa, Graphics.ImageFormat.ARGB8888, getResources());
        Images.nest = getGraphics().newImage(R.drawable.nest, Graphics.ImageFormat.ARGB8888, getResources());
        Images.refrigerator = getGraphics().newImage(R.drawable.refrigerator, Graphics.ImageFormat.ARGB8888, getResources());
        Images.table = getGraphics().newImage(R.drawable.table, Graphics.ImageFormat.ARGB8888, getResources());
        Images.toothbrush = getGraphics().newImage(R.drawable.toothbrush, Graphics.ImageFormat.ARGB8888, getResources());

        //answers
        Images.Answers[0] = Images.firefighter;
        Images.Answers[1] = Images.mom;
        Images.Answers[2] = Images.fish;
        Images.Answers[3] = Images.kid;
        Images.Answers[4] = Images.pilot;


        //wrong answers
        Images.Others[0] = Images.baby;
        Images.Others[1] = Images.gazelle;
        Images.Others[2] = Images.chair;
        Images.Others[3] = Images.school;
        Images.Others[4] = Images.scissors;
        Images.Others[5] = Images.honey;
        Images.Others[6] = Images.pencil;
        Images.Others[7] = Images.umbrella;
        Images.Others[8] = Images.shoes;
        Images.Others[9] = Images.bed;
        Images.Others[10] = Images.book;
        Images.Others[11] = Images.crayons;
        Images.Others[12] = Images.door;
        Images.Others[13] = Images.nest;
        Images.Others[14] = Images.refrigerator;
        Images.Others[15] = Images.table;
        Images.Others[16] = Images.toothbrush;

        //answers what
        Images.Answers_what[0] = Images.honey;
        Images.Answers_what[1] = Images.pencil;
        Images.Answers_what[2] = Images.shoes;
        Images.Answers_what[3] = Images.scissors;
        Images.Answers_what[4] = Images.umbrella;

        //others what
        Images.Others_what[0] = Images.baby;
        Images.Others_what[1] = Images.gazelle;
        Images.Others_what[2] = Images.chair;
        Images.Others_what[3] = Images.school;
        Images.Others_what[4] = Images.mom;
        Images.Others_what[5] = Images.kid;
        Images.Others_what[6] = Images.firefighter;
        Images.Others_what[7] = Images.pilot;
        Images.Others_what[8] = Images.fish;
        Images.Others_what[9] = Images.bed;
        Images.Others_what[10] = Images.book;
        Images.Others_what[11] = Images.crayons;
        Images.Others_what[12] = Images.door;
        Images.Others_what[13] = Images.nest;
        Images.Others_what[14] = Images.refrigerator;
        Images.Others_what[15] = Images.table;
        Images.Others_what[16] = Images.toothbrush;

        //answers where
        Images.Answers_where[0] = Images.bed;
        Images.Answers_where[1] = Images.chair;
        Images.Answers_where[2] = Images.nest;
        Images.Answers_where[3] = Images.refrigerator;
        Images.Answers_where[4] = Images.toothbrush;

        //others
        Images.Others_where[0] = Images.baby;
        Images.Others_where[1] = Images.gazelle;
        Images.Others_where[2] = Images.scissors;
        Images.Others_where[3] = Images.school;
        Images.Others_where[4] = Images.mom;
        Images.Others_where[5] = Images.kid;
        Images.Others_where[6] = Images.firefighter;
        Images.Others_where[7] = Images.pilot;
        Images.Others_where[8] = Images.fish;
        Images.Others_where[9] = Images.honey;
        Images.Others_where[10] = Images.book;
        Images.Others_where[11] = Images.crayons;
        Images.Others_where[12] = Images.door;
        Images.Others_where[13] = Images.shoes;
        Images.Others_where[14] = Images.pencil;
        Images.Others_where[15] = Images.table;
        Images.Others_where[16] = Images.umbrella;

        //Audio
        Sounds.hihat_audio = MediaPlayer.create(this, R.raw.click);
        Sounds.hihat_audio_fr = MediaPlayer.create(this, R.raw.clickfr);
        Sounds.hihat_audio_ar = MediaPlayer.create(this, R.raw.clickar);
        if (Sounds.musicOn == 1) {
            Sounds.background_music = MediaPlayer.create(this, R.raw.background_music);
        }
        //english

        Sounds.correct_audio = MediaPlayer.create(this, R.raw.goodjob);
        Sounds.tryagain_audio = MediaPlayer.create(this, R.raw.tryagain);
        Sounds.correct_audio_fr = MediaPlayer.create(this, R.raw.goodjobfr);
        Sounds.tryagain_audio_fr = MediaPlayer.create(this, R.raw.tryagainfr);
        Sounds.correct_audio_ar = MediaPlayer.create(this, R.raw.goodjobar);
        Sounds.tryagain_audio_ar = MediaPlayer.create(this, R.raw.tryagainar);


        Sounds.Questions_where[0] = MediaPlayer.create(this, R.raw.bed);
        Sounds.Questions_where[1] = MediaPlayer.create(this, R.raw.chair);
        Sounds.Questions_where[2] = MediaPlayer.create(this, R.raw.nest);
        Sounds.Questions_where[3] = MediaPlayer.create(this, R.raw.refrigirator);
        Sounds.Questions_where[4] = MediaPlayer.create(this, R.raw.toothbrush);

        Sounds.Questions_what[0] = MediaPlayer.create(this, R.raw.honey);
        Sounds.Questions_what[1] = MediaPlayer.create(this, R.raw.pencil);
        Sounds.Questions_what[2] = MediaPlayer.create(this, R.raw.shoes);
        Sounds.Questions_what[3] = MediaPlayer.create(this, R.raw.cisor);
        Sounds.Questions_what[4] = MediaPlayer.create(this, R.raw.umbrella);

        Sounds.Questions_who[0] = MediaPlayer.create(this, R.raw.fire);
        Sounds.Questions_who[1] = MediaPlayer.create(this, R.raw.mother);
        Sounds.Questions_who[2] = MediaPlayer.create(this, R.raw.fish);
        Sounds.Questions_who[3] = MediaPlayer.create(this, R.raw.kid);
        Sounds.Questions_who[4] = MediaPlayer.create(this, R.raw.airplane);

        //sounds french
        Sounds.Questions_where_fr[0] = MediaPlayer.create(this, R.raw.bedfr);
        Sounds.Questions_where_fr[1] = MediaPlayer.create(this, R.raw.chairfr);
        Sounds.Questions_where_fr[2] = MediaPlayer.create(this, R.raw.nestfr);
        Sounds.Questions_where_fr[3] = MediaPlayer.create(this, R.raw.refrigiratorfr);
        Sounds.Questions_where_fr[4] = MediaPlayer.create(this, R.raw.toothbrushfr);

        Sounds.Questions_what_fr[0] = MediaPlayer.create(this, R.raw.honeyfr);
        Sounds.Questions_what_fr[1] = MediaPlayer.create(this, R.raw.pencilfr);
        Sounds.Questions_what_fr[2] = MediaPlayer.create(this, R.raw.shoesfr);
        Sounds.Questions_what_fr[3] = MediaPlayer.create(this, R.raw.cisorfr);
        Sounds.Questions_what_fr[4] = MediaPlayer.create(this, R.raw.umbrellafr);

        Sounds.Questions_who_fr[0] = MediaPlayer.create(this, R.raw.firefr);
        Sounds.Questions_who_fr[1] = MediaPlayer.create(this, R.raw.motherfr);
        Sounds.Questions_who_fr[2] = MediaPlayer.create(this, R.raw.fishfr);
        Sounds.Questions_who_fr[3] = MediaPlayer.create(this, R.raw.kidfr);
        Sounds.Questions_who_fr[4] = MediaPlayer.create(this, R.raw.airplanefr);

        //sounds arabic

        Sounds.Questions_where_ar[0] = MediaPlayer.create(this, R.raw.bedar);
        Sounds.Questions_where_ar[1] = MediaPlayer.create(this, R.raw.chairar);
        Sounds.Questions_where_ar[2] = MediaPlayer.create(this, R.raw.nestar);
        Sounds.Questions_where_ar[3] = MediaPlayer.create(this, R.raw.refrigiratorar);
        Sounds.Questions_where_ar[4] = MediaPlayer.create(this, R.raw.toothbrushar);

        Sounds.Questions_what_ar[0] = MediaPlayer.create(this, R.raw.honeyar);
        Sounds.Questions_what_ar[1] = MediaPlayer.create(this, R.raw.pencilar);
        Sounds.Questions_what_ar[2] = MediaPlayer.create(this, R.raw.shoesar);
        Sounds.Questions_what_ar[3] = MediaPlayer.create(this, R.raw.cisorar);
        Sounds.Questions_what_ar[4] = MediaPlayer.create(this, R.raw.umbrellaar);

        Sounds.Questions_who_ar[0] = MediaPlayer.create(this, R.raw.firear);
        Sounds.Questions_who_ar[1] = MediaPlayer.create(this, R.raw.motherar);
        Sounds.Questions_who_ar[2] = MediaPlayer.create(this, R.raw.fishar);
        Sounds.Questions_who_ar[3] = MediaPlayer.create(this, R.raw.kidar);
        Sounds.Questions_who_ar[4] = MediaPlayer.create(this, R.raw.airplanear);


        Images.bgn_img_ar = getGraphics().newImage(R.drawable.beginner_img_ar, Graphics.ImageFormat.ARGB8888, getResources());
        Images.int_img_ar = getGraphics().newImage(R.drawable.intermediate_img_ar, Graphics.ImageFormat.ARGB8888, getResources());
        Images.adv_img_ar = getGraphics().newImage(R.drawable.advanced_img_ar, Graphics.ImageFormat.ARGB8888, getResources());
        Images.title_ar_img = getGraphics().newImage(R.drawable.title_ar, Graphics.ImageFormat.ARGB8888, getResources());

        Images.Questions_ar[0] = getGraphics().newImage(R.drawable.qst_firefighter_ar, Graphics.ImageFormat.ARGB8888, getResources());
        Images.Questions_ar[1] = getGraphics().newImage(R.drawable.qst_mom_ar, Graphics.ImageFormat.ARGB8888, getResources());
        Images.Questions_ar[2] = getGraphics().newImage(R.drawable.qst_fish_ar, Graphics.ImageFormat.ARGB8888, getResources());
        Images.Questions_ar[3] = getGraphics().newImage(R.drawable.qst_kid_ar, Graphics.ImageFormat.ARGB8888, getResources());
        Images.Questions_ar[4] = getGraphics().newImage(R.drawable.qst_pilot_ar, Graphics.ImageFormat.ARGB8888, getResources());

        Images.Questions_what_ar[0] = getGraphics().newImage(R.drawable.qst_honey_ar, Graphics.ImageFormat.ARGB8888, getResources());
        Images.Questions_what_ar[1] = getGraphics().newImage(R.drawable.qst_pencil_ar, Graphics.ImageFormat.ARGB8888, getResources());
        Images.Questions_what_ar[2] = getGraphics().newImage(R.drawable.qst_shoes_ar, Graphics.ImageFormat.ARGB8888, getResources());
        Images.Questions_what_ar[3] = getGraphics().newImage(R.drawable.qst_scissors_ar, Graphics.ImageFormat.ARGB8888, getResources());
        Images.Questions_what_ar[4] = getGraphics().newImage(R.drawable.qst_umbrella_ar, Graphics.ImageFormat.ARGB8888, getResources());

        Images.Questions_where_ar[0] = getGraphics().newImage(R.drawable.qst_bed_ar, Graphics.ImageFormat.ARGB8888, getResources());
        Images.Questions_where_ar[1] = getGraphics().newImage(R.drawable.qst_chair_ar, Graphics.ImageFormat.ARGB8888, getResources());
        Images.Questions_where_ar[2] = getGraphics().newImage(R.drawable.qst_nest_ar, Graphics.ImageFormat.ARGB8888, getResources());
        Images.Questions_where_ar[3] = getGraphics().newImage(R.drawable.qst_refrigerator_ar, Graphics.ImageFormat.ARGB8888, getResources());
        Images.Questions_where_ar[4] = getGraphics().newImage(R.drawable.qst_toothbrush_ar, Graphics.ImageFormat.ARGB8888, getResources());


        Images.bgn_img_fr = getGraphics().newImage(R.drawable.beginner_fr, Graphics.ImageFormat.ARGB8888, getResources());
        Images.int_img_fr = getGraphics().newImage(R.drawable.intermediate_fr, Graphics.ImageFormat.ARGB8888, getResources());
        Images.adv_img_fr = getGraphics().newImage(R.drawable.advanced_fr, Graphics.ImageFormat.ARGB8888, getResources());
        Images.title_fr_img = getGraphics().newImage(R.drawable.title_fr, Graphics.ImageFormat.ARGB8888, getResources());

        Images.Questions_fr[0] = getGraphics().newImage(R.drawable.qst_firefighter_fr, Graphics.ImageFormat.ARGB8888, getResources());
        Images.Questions_fr[1] = getGraphics().newImage(R.drawable.qst_mom_fr, Graphics.ImageFormat.ARGB8888, getResources());
        Images.Questions_fr[2] = getGraphics().newImage(R.drawable.qst_fish_fr, Graphics.ImageFormat.ARGB8888, getResources());
        Images.Questions_fr[3] = getGraphics().newImage(R.drawable.qst_kid_fr, Graphics.ImageFormat.ARGB8888, getResources());
        Images.Questions_fr[4] = getGraphics().newImage(R.drawable.qst_pilot_fr, Graphics.ImageFormat.ARGB8888, getResources());

        Images.Questions_what_fr[0] = getGraphics().newImage(R.drawable.qst_honey_fr, Graphics.ImageFormat.ARGB8888, getResources());
        Images.Questions_what_fr[1] = getGraphics().newImage(R.drawable.qst_pencil_fr, Graphics.ImageFormat.ARGB8888, getResources());
        Images.Questions_what_fr[2] = getGraphics().newImage(R.drawable.qst_shoes_fr, Graphics.ImageFormat.ARGB8888, getResources());
        Images.Questions_what_fr[3] = getGraphics().newImage(R.drawable.qst_scissors_fr, Graphics.ImageFormat.ARGB8888, getResources());
        Images.Questions_what_fr[4] = getGraphics().newImage(R.drawable.qst_umbrella_fr, Graphics.ImageFormat.ARGB8888, getResources());

        Images.Questions_where_fr[0] = getGraphics().newImage(R.drawable.qst_bed_fr, Graphics.ImageFormat.ARGB8888, getResources());
        Images.Questions_where_fr[1] = getGraphics().newImage(R.drawable.qst_chair_fr, Graphics.ImageFormat.ARGB8888, getResources());
        Images.Questions_where_fr[2] = getGraphics().newImage(R.drawable.qst_nest_fr, Graphics.ImageFormat.ARGB8888, getResources());
        Images.Questions_where_fr[3] = getGraphics().newImage(R.drawable.qst_refrigerator_fr, Graphics.ImageFormat.ARGB8888, getResources());
        Images.Questions_where_fr[4] = getGraphics().newImage(R.drawable.qst_toothbrush_fr, Graphics.ImageFormat.ARGB8888, getResources());

        //who what where buttons
        Images.bgn_img = getGraphics().newImage(R.drawable.beginner_img, Graphics.ImageFormat.ARGB8888, getResources());
        Images.int_img = getGraphics().newImage(R.drawable.intermediate_img, Graphics.ImageFormat.ARGB8888, getResources());
        Images.adv_img = getGraphics().newImage(R.drawable.advanced_img, Graphics.ImageFormat.ARGB8888, getResources());
        Images.title_eng_img = getGraphics().newImage(R.drawable.title_eng, Graphics.ImageFormat.ARGB8888, getResources());

        //questions who
        Images.Questions[0] = getGraphics().newImage(R.drawable.qst_firefighter, Graphics.ImageFormat.ARGB8888, getResources());
        Images.Questions[1] = getGraphics().newImage(R.drawable.qst_mom, Graphics.ImageFormat.ARGB8888, getResources());
        Images.Questions[2] = getGraphics().newImage(R.drawable.qst_fish, Graphics.ImageFormat.ARGB8888, getResources());
        Images.Questions[3] = getGraphics().newImage(R.drawable.qst_kid, Graphics.ImageFormat.ARGB8888, getResources());
        Images.Questions[4] = getGraphics().newImage(R.drawable.qst_pilot, Graphics.ImageFormat.ARGB8888, getResources());


        //questions what
        Images.Questions_what[0] = getGraphics().newImage(R.drawable.qst_honey, Graphics.ImageFormat.ARGB8888, getResources());
        Images.Questions_what[1] = getGraphics().newImage(R.drawable.qst_pencil, Graphics.ImageFormat.ARGB8888, getResources());
        Images.Questions_what[2] = getGraphics().newImage(R.drawable.qst_shoes, Graphics.ImageFormat.ARGB8888, getResources());
        Images.Questions_what[3] = getGraphics().newImage(R.drawable.qst_scissors, Graphics.ImageFormat.ARGB8888, getResources());
        Images.Questions_what[4] = getGraphics().newImage(R.drawable.qst_umbrella, Graphics.ImageFormat.ARGB8888, getResources());


        //questions where
        Images.Questions_where[0] = getGraphics().newImage(R.drawable.qst_bed, Graphics.ImageFormat.ARGB8888, getResources());
        Images.Questions_where[1] = getGraphics().newImage(R.drawable.qst_chair, Graphics.ImageFormat.ARGB8888, getResources());
        Images.Questions_where[2] = getGraphics().newImage(R.drawable.qst_nest, Graphics.ImageFormat.ARGB8888, getResources());
        Images.Questions_where[3] = getGraphics().newImage(R.drawable.qst_refrigerator, Graphics.ImageFormat.ARGB8888, getResources());
        Images.Questions_where[4] = getGraphics().newImage(R.drawable.qst_toothbrush, Graphics.ImageFormat.ARGB8888, getResources());


        return new SettingScreen(this);
    }


    @Override
    protected void onDestroy() {

        super.onDestroy();
        Sounds.stop();
        Sounds.background_music.stop();
    }

    @Override

    public void onBackPressed() {

    }


    public void onStop() {
        super.onStop();
        Sounds.background_music.stop();
    }
}
