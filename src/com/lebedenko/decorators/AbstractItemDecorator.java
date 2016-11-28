package com.lebedenko.decorators;

import com.lebedenko.decorators.Item;

/**
 * Created by Roksolyana Lebedenko on 28.11.2016.
 */
abstract class AbstractItemDecorator implements Item {
    protected Item decoratingItem;

    public AbstractItemDecorator(Item decoratingItem){
        this.decoratingItem = decoratingItem;
    }

    public double getPrice(){
        return decoratingItem.getPass();
    }
}
