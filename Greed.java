//package com.company;
//import com.sun.nio.sctp.SctpStandardSocketOptions;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;


public class Greed {
       static char[][] pole = new char[20][40];
    static String[][] color = new String[20][40];
       static int KorX = 10;
       static int KorY = 10;
   static Scanner sam = new Scanner(System.in);
       //цвета******************************************************
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_RESET = "\u001B[0m";
    // end color********************************************************




      // static char[] symb = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '@'};
      public static int Xod(String word){
          String w = "w";
          String a = "a";
          String d = "d";
          String s = "s";

          boolean xw = word.equals(w);
          boolean xa = word.equals(a);
          boolean xs = word.equals(s);
          boolean xd = word.equals(d);

          if(xw == true){
              return 1;
          }
          if(xs == true){
              return 2;
          }

          if(xa == true){
              return 3;
          }
          else{
              return 4;
          }
      }



        public static void main(String[] args) {
                String Str = sam.nextLine();
                Random Ra = new Random();
                pole[10][10] = '@';
                //начало заполнения*********************************************************************
                for(int i = 0; i < 20; i++){
                for(int y = 0; y < 40; y++){
                    int x = Ra.nextInt(10);
                    if(x == 10 || x == 0){
                        while(x == 10 || x == 0){
                            x = Ra.nextInt(10);
                        }

                    }

                    if(x == 1){
                        pole[i][y] = '1';
                        color[i][y] = ANSI_BLACK;
                    }

                    if(x == 2){
                        pole[i][y] = '2';
                        color[i][y] = ANSI_RED;
                    }
                    if(x == 3){
                        pole[i][y] = '3';
                        color[i][y] = ANSI_GREEN;
                    }
                    if(x == 4 ){
                        pole[i][y] = '4';
                        color[i][y] = ANSI_BLUE;
                    }
                    if(x == 5 ){
                        pole[i][y] = '5';
                        color[i][y] = ANSI_PURPLE;
                    }
                    if(x == 6){
                        pole[i][y] = '6';
                        color[i][y] = ANSI_CYAN;
                    }
                    if(x == 7){
                        pole[i][y] = '7';
                        color[i][y] = ANSI_RED;
                    }
                    if(x == 8){
                        pole[i][y] = '8';
                        color[i][y] = ANSI_CYAN;
                    }
                    if(x == 9){
                        pole[i][y] = '9';
                        color[i][y] = ANSI_PURPLE;
                    }

                    if(i == 10 && y == 10){
                        pole[i][y] = '@';
                    }
                    //
                }
            }
                //конец заполнения*********************************************************************
            for(int i = 0; i < 20; i++){
                for(int y = 0; y < 40; y++){
                    if(i == 10 && y == 10){
                        System.out.print(ANSI_YELLOW  + pole[i][y] + ANSI_RESET);
                    }
                    else{
                        System.out.print(color[i][y] + pole[i][y] + ANSI_RESET);
                    }

                }
                System.out.println();
            }


            while (true) {
                String word = sam.nextLine();
                int Step = Xod(word);



                if (Step == 2) {
                    int ko = pole[KorY][KorX + 1];
                    ko -= 48;
//                    for (int i = ko; i >= 0; i--) {
//                        pole[KorY][i] = ' ';
//                    }

                    for(int i = 0; i <= ko; i++){
                        pole[KorY + i][KorX] = ' ';
                    }
                    pole[KorY][KorX] = ' ';
                    pole[KorY+ko][KorX] = '@';
                    KorY = KorY + ko;
                }





                if (Step == 3) {
                    int ko = pole[KorY - 1][KorX];
                    ko -= 48;
//                    for (int i = ko; i >= 0; i--) {
//                        pole[KorY][i] = ' ';
//                    }

                    for(int i = ko; i >= 0; i--){
                        pole[KorY][KorX - i] = ' ';
                    }
                    pole[KorY][KorX] = ' ';
                    pole[KorY][KorX-ko] = '@';
                    KorX = KorX - ko;
                }



                if (Step == 4) {

                    int ko = pole[KorY + 1][KorX];
                    System.out.println(ko);
                    ko -= 48;
//                    for (int i = ko; i >= 0; i--) {
//                        pole[KorY][i] = ' ';
//                    }

                    if(KorX + ko >= 20 || KorX + ko < 0){
                        System.out.println("You Stuped!!!");
                        System.out.println(ko);
                    }
                    else {
                        for (int i = 0; i <= ko; i++) {
                            pole[KorY][KorX + i] = ' ';
                        }
                        pole[KorY][KorX] = ' ';
                        pole[KorY][KorX + ko] = '@';
                        KorX = KorX + ko;
                    }
                }






                if (Step == 1) {
                    int ko = pole[KorY][KorX - 1];
                    ko -= 48;
//                    for (int i = ko; i >= 0; i--) {
//                        pole[KorY][i] = ' ';
//                    }

                    for(int i = ko; i >= 0; i--){
                        pole[KorY - i][KorX] = ' ';
                    }
                    pole[KorY][KorX] = ' ';
                    pole[KorY-ko][KorX] = '@';
                    KorY = KorY - ko;
                }

                for(int i = 0; i < 20; i++){
                    for(int y = 0; y < 40; y++){
                        if(i == KorY && y == KorX){
                            System.out.print(ANSI_YELLOW  + pole[KorY][KorX] + ANSI_RESET);
                        }
                        else{
                            System.out.print(color[i][y] + pole[i][y] + ANSI_RESET);
                        }

                    }
                    System.out.println();
                }



            }



            //System.out.println(Xod(Str));
    }


    public static void Drive(String[] args) {
        while (true) {
            String word = sam.nextLine();
            int Step = Xod(word);
            if (Step == 1) {
                int ko = pole[KorY][KorX - 1];
                ko -= 48;
                for (int i = ko; i >= 0; i--) {
                    pole[KorY][i] = ' ';
                }
                pole[KorY][ko - 1] = '@';
            }

            for(int i = 0; i < 20; i++){
                for(int y = 0; y < 40; y++){
                    if(i == 10 && y == 10){
                        System.out.print(ANSI_YELLOW  + pole[i][y] + ANSI_RESET);
                    }
                    else{
                        System.out.print(color[i][y] + pole[i][y] + ANSI_RESET);
                    }

                }
                System.out.println();
            }



        }
    }



}
