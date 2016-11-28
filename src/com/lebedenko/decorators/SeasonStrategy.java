package com.lebedenko.decorators;

import com.lebedenko.UpsNumber;
import com.lebedenko.decorators.AbstractItemDecorator;
import com.lebedenko.decorators.Item;

/**
 * Created by Roksolyana Lebedenko on 28.11.2016.
 */
public class SeasonStrategy extends AbstractItemDecorator {
    public SeasonStrategy(Item decoratingItem) {
        super(decoratingItem);
    }

    @Override
    public int getPass() {
        System.out.println("Ski-pass for season");
        return this.decoratingItem.getPass();
    }
}
