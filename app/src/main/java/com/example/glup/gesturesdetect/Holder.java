package com.example.glup.gesturesdetect;

import android.graphics.Color;
import android.widget.ImageView;

import java.util.Random;

/**
 * Created by Glup on 7/01/16.
 */
public class Holder {
    private String title;
    private int color;

    public Holder(String title, int color) {
        this.title = title;
        this.color = color;
    }
    public static Holder[] ITEMS={
        new Holder("Click Simple",randomColor()),
        new Holder("Doble click",randomColor()),
        new Holder("Long click",randomColor())
    };
    public static int randomColor(){
        Random rnd = new Random();
        return Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
    }

    public String getTitle() {
        return title;
    }

    public int getColor() {
        return color;
    }
}
