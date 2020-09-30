package com.trendyol.toyrobot.domain;

public class West implements Compass{

    static String name = "WEST";

    @Override
    public int[] move(int x, int y) {
        int[] position = new int[2];
        position[0] = x - 1;
        position[1] = y;
        return position;
    }

    @Override
    public South turnLeft() {
        return new South();
    }

    @Override
    public North turnRight() {
        return new North();
    }

    @Override
    public String getName() {
        return name;
    }
}
