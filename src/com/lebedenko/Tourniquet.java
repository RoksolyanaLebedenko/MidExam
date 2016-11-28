package com.lebedenko;

import com.lebedenko.decorators.Item;

import java.text.MessageFormat;

/**
 * Created by Roksolyana Lebedenko on 28.11.2016.
 */
public class Tourniquet implements Item {

    @Override
    public int getPass() {
        System.out.println("Ups:");
        return 0;
    }
}
