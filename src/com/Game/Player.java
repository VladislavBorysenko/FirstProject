package com.Game;

import java.util.Random;

public class Player {
    Random rand = new Random();
    int max = 50, min = 1;
    int rand_num = rand.nextInt(max - min + 1) + min;
}
