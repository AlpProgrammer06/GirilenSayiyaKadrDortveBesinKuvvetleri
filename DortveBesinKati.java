package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Java d�ng�ler ile girilen say�ya kadar olan 4 ve 5'in kuvvetlerini ekrana yazd�ran program� yaz�yoruz.
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("L�tfen s�n�r say�y� girin: ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i = i * 4) {

            System.out.println(" 4'�n Kuvvetleri = " + i);
        }

        for (int i = 1; i <= n; i = i * 5) {
            System.out.println(" 5 'in kuvvetleri = " + i);
        }
    }
}

