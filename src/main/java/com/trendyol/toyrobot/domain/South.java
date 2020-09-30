package com.trendyol.toyrobot.domain;

public class South implements Compass{

    static String name = "SOUTH";

    @Override
    public int[] move(int x, int y) {
        int[] position = new int[2];
        position[0] = x;
        position[1] = y - 1;
        return position;
    }

    @Override
    public East turnLeft() {
        return new East();
    }

    @Override
    public West turnRight() {
        return new West();
    }

    @Override
    public String getName() {
        return name;
    }
}
