package cz.spsmb.a3;

import java.util.Scanner;

public class Application {
    public static final int[] PAPER_MONEY = {5000, 1000, 500, 200, 100, 50, 20, 10, 5, 2};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int moneyIn = sc.nextInt();
        while (moneyIn != 0){
            for (int j : PAPER_MONEY) {
                if (moneyIn - j >= 0) {
                    moneyIn -= j;
                    System.out.println(j);
                }
            }
        }
    }
}
