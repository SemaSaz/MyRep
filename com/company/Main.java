package com.company;
//import com.sun.nio.sctp.SctpStandardSocketOptions;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sam = new Scanner(System.in);
        Random Ra = new Random();
        //int n = sam.nextInt();
        //int s = sam.nextInt();
        int num = 0;
        int[][] Array; // объявление массив
        Array = new int[12][18];

        int[] Ing; // объявление массив
        Ing = new int[12];

        for (int i = 0; i < 12; i++) {
                int sum = 0;
            for (int y = 0; y < 18; y++) {
                Array[i][y] = Ra.nextInt(10);
                sum += Array[i][y];
            }
            sum /= 18;
            Ing[i] = sum;

        }

        for(int i = 0; i < 12; i++){
            System.out.println(Ing[i]);
        }

    }
}