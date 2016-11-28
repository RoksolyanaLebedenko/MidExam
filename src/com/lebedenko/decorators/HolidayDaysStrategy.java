package com.lebedenko.decorators;

import com.lebedenko.decorators.AbstractItemDecorator;
import com.lebedenko.decorators.Item;

/**
 * Created by Roksolyana Lebedenko on 28.11.2016.
 */
public class HolidayDaysStrategy extends AbstractItemDecorator {

    public HolidayDaysStrategy(Item decoratingItem) {
        super(decoratingItem);
    }

    @Override
    public int getPass() {
        System.out.println("Ski-pass in working days for :");
        return this.decoratingItem.getPass();

    }
}
