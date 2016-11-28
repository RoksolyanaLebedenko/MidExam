package com.lebedenko;

/**
 * Created by Roksolyana Lebedenko on 28.11.2016.
 */
public class PassSpec {
    protected int id;
    protected String type;
    protected int days;
    protected String ups;


    public PassSpec(int id, String type, int days, String ups) {
        this.id = id;
        this.type = type;
        this.days = days;
        this.ups = ups;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
    public String getUps() {
        return ups;
    }

    public void setUps(String ups) {
        this.ups = ups;
    }
}

