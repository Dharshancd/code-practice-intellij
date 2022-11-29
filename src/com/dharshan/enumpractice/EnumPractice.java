package com.dharshan.enumpractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EnumPractice {

    public static void main(String[] args) throws IOException {

//        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
//        BufferedReader br = new BufferedReader(inputStreamReader);
//
//        System.out.println("Please enter the day");
//        String userEnteredDay = br.readLine();
//
//        Days[] days = Days.values();
//        boolean isValidDay = false;
//        for (Days d:days) {
//            if(d.name().equalsIgnoreCase(userEnteredDay)) {
//                isValidDay = true;
//            }
//        }
//
//        if(!isValidDay) {
//            System.out.println("You have entered a invalid day");
//            return;
//        }
//
//        System.out.println(Days.valueOf("MONDAY"));
//        switchMethod(Days.valueOf(userEnteredDay));


        System.out.println(Planets.EARTH.getDiameter());
        System.out.println(Planets.EARTH.getDistance());

        System.out.println(Planets.MERCURY.ordinal());

    }

    public static void switchMethod(Days day) {
        switch (day) {
            case SUNDAY:
                System.out.println("it's sunday");
                break;
            case MONDAY:
                System.out.println("it's monday");
        }
    }
}


    enum Days {
        SUNDAY,
        MONDAY;
    }


    enum Planets {
        EARTH(4324234, 443),
        MERCURY(42342, 43);

    private int distance;
    private int diameter;

    Planets(int distance, int diameter) {
        this.distance = distance;
        this.diameter = diameter;
    }

    int getDistance() {
        return this.distance;
    }

    int getDiameter() {
        return this.diameter;
    }


    }