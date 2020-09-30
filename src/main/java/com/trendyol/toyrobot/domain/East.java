package com.trendyol.toyrobot.domain;

public class East implements Compass{

    static String name = "EAST";

    @Override
    public int[] move(int x, int y) {
        int[] position = new int[2];
        position[0] = x + 1;
        position[1] = y;
        return position;
    }

    @Override
    public North turnLeft() {
        return new North();
    }

    @Override
    public South turnRight() {
        return new South();
    }
    @Override
    public String getName() {
        return name;
    }
}
