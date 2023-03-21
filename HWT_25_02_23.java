package Tasks;
import java.util.LinkedList;
import java.util.List;

import java.util.Random;

public class HWT_25_02_23 {
    public static void main(String[] args) {
        int a = 8;
        getPiramid(a);
        // getDZ ();
        // getIslandNumber();
    }

    public static void getPiramid(int a) {

        int[][] piramid = new int[a][];

        for (int i = 0; i < piramid.length; i++) {

            piramid[i] = new int[i + 1];
            for (int k = a -1; k >= i; k--) {
                System.out.print(" ");}
            for (int j = 0; j < piramid[i].length; j++) {
                if (j == 0) {
                    piramid[i][0] = 1;
                }
                if (j == piramid[i].length - 1) {
                    piramid[i][piramid[i].length - 1] = 1;
                } else if (j > 0) {
                    piramid[i][j] = piramid[i - 1][j - 1] + piramid[i - 1][j];
                }
                System.out.print(piramid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void getDZ() {
        int h = 10;
        int[][] dzArr = new int[h][h];
        for (int i = 0; i < h - 1; i++) {
            for (int j = 0; j < h - 1; j++) {
                if (j > i) {
                    dzArr[i][j] = 1;
                }
                System.out.print(dzArr[i][j]);
            }
            System.out.println();

        }
    }

}

