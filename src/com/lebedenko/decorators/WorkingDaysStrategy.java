package com.lebedenko.decorators;

import com.lebedenko.decorators.AbstractItemDecorator;
import com.lebedenko.decorators.Item;

/**
 * Created by Roksolyana Lebedenko on 28.11.2016.
 */
public class WorkingDaysStrategy extends AbstractItemDecorator {
    public WorkingDaysStrategy(Item decoratingItem) {
        super(decoratingItem);
    }

    @Override
    public int getPass() {
        System.out.println("Ski-pass in holiday days for:");
        return this.decoratingItem.getPass();
    }
}
