package com.lebedenko;

/**
 * Created by Roksolyana Lebedenko on 28.11.2016.
 */
public class SkiPass {


    protected PassSpec spec;
    public SkiPass(PassSpec spec){
        this.spec = spec;
    }

    public int getId() {
        return spec.getId();
    }

    public String getType() {
        return spec.getType();
    }

    public int getDays() {
        return spec.getDays();
    }

    public String getUps() {
        return spec.getUps();
    }


    public String toString() {
        return  " ID:" + String.valueOf(getId())
                + "Type:" + getType() + "Days: " + String.valueOf(getDays())
                + "Ups:" + String.valueOf(getUps());
    }
}
