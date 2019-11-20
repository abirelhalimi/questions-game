package com.example.myapplication.Assets;

import android.content.Context;

import com.example.emobadaragaminglib.Base.Game;
import com.example.ensias_auth_library.FoxyAuth;
import com.example.ensias_auth_library.models.GameStat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Stat {

    public static String debut;
    public static int success, fail;
    public static Double latitude, longitude;
    public static List<Integer> timeSuccess = new ArrayList();

    public static String time() {
        Date d = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return dateFormat.format(d);
    }

    public static void addDelay(Date time1, Date time2) {
        timeSuccess.add((int) (time2.getTime() - time1.getTime()) / 1000);
    }

    public static String avg() {
        int c = 0;
        int j = 0;
        if (timeSuccess == null || timeSuccess.size() == 0) return "0";
        else {
            for (int i : timeSuccess) {
                c++;
                j += i;
            }
            return String.valueOf(j / c);
        }
    }

    public static String min() {
        if (timeSuccess == null || timeSuccess.size() == 0) return "0";
        else {
            Collections.sort(timeSuccess);
            return String.valueOf(timeSuccess.get(0));
        }
    }

    public static void saveStat(Game game, int success, int fail, String level) {

        GameStat gameStat = new GameStat();
        gameStat.setApp_id("2019_2_4_4");
        gameStat.setExercise_id("T_6_31");
        gameStat.setLevel_id(level);
        gameStat.setUpdated_at(time());
        gameStat.setCreated_at(debut);
        gameStat.setSuccessful_attempts(Integer.toString(success));
        gameStat.setFailed_attempts(Integer.toString(fail));
        gameStat.setMin_time_succeed_sec(min());
        gameStat.setAvg_time_succeed_sec(avg());
        gameStat.setLongitude(String.valueOf(longitude));
        gameStat.setLatitude(String.valueOf(latitude));
        System.out.println("***********\n" + level + "***********\n" + success + "***********\n" + fail + "***********\n" + debut + "***********\nlogitude = "
                + longitude + "***********\n latitude = " + latitude + "***********\n" + min() + "***********\n" + avg());
        FoxyAuth.storeGameStat((Context) game, gameStat);

        success = 0;
        fail = 0;
        timeSuccess = null;
        timeSuccess = new ArrayList();
    }
}
