package com.trendyol.toyrobot.domain;

public class North implements Compass{

    static String name = "NORTH";

    @Override
    public int[] move(int x, int y) {
        int[] position = new int[2];
        position[0] = x;
        position[1] = y + 1;
        return position;
    }

    @Override
    public West turnLeft() {
        return new West();

    }

    @Override
    public East turnRight() {
        return new East();
    }

    @Override
    public String getName() {
        return name;
    }
}
