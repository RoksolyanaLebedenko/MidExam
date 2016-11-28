package com.lebedenko;

import com.lebedenko.decorators.*;

public class Main {

    public static void main(String[] args) {
	    Tourniquet t = new Tourniquet();
        PassSpec pass1 = new PassSpec(1, "For working days", 2, "unlimited");
        Item dec = new HolidayDaysStrategy(t);
        System.out.println(dec.getPass());
    }
}

