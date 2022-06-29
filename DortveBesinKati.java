package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Java döngüler ile girilen sayýya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdýran programý yazýyoruz.
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen sýnýr sayýyý girin: ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i = i * 4) {

            System.out.println(" 4'ün Kuvvetleri = " + i);
        }

        for (int i = 1; i <= n; i = i * 5) {
            System.out.println(" 5 'in kuvvetleri = " + i);
        }
    }
}

