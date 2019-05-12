package com.sda.algorytmy;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj n liczb w ciagu: ");
        int n = scan.nextInt();
        int wynik = 0;
        System.out.println("Podaj "+ n + " liczb ciagu");
        for (int i = 0; i < n; i++) {
            int a = scan.nextInt();
            wynik = wynik + a;
        }
        System.out.println(wynik/n);
    }
}

