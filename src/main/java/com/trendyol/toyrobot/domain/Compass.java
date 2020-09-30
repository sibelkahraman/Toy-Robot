package com.trendyol.toyrobot.domain;

public interface Compass {
    int[] move(int x, int y);
    Compass turnLeft();
    Compass turnRight();
    String getName();

}
