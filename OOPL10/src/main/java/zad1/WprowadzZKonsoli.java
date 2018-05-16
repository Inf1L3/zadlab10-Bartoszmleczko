/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class WprowadzZKonsoli {

    Scanner odczyt = new Scanner(System.in);

    public void wprowadzInt() {
        int liczba;

        System.out.println("Podaj liczbe: ");
        try {
            liczba = odczyt.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Zly typ danych");

        }
    }

    public void wprowadzString() {
        String wyraz;

        System.out.println("Podaj wyraz: ");
        try {
            wyraz = odczyt.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Zly typ danych");

        }
    }

    public void wprowadzFloat() {
        float liczba;

        System.out.println("Podaj liczbe: ");
        try {
            liczba = odczyt.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("Zly typ danych");

        }
    }

   public  void wprowadzLong() {
        long liczba;

        System.out.println("Podaj liczbe: ");
        try {
            liczba = odczyt.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Zly typ danych");

        }
    }

    public void wprowadzChar() {
        char znak;

        System.out.println("Podaj znak: ");
        try {
            znak = odczyt.next().charAt(0);
        } catch (InputMismatchException e) {
            System.out.println("Zly typ danych");

        }
    }

    public void wprowadzShort() {
        short liczba;

        System.out.println("Podaj liczbe: ");
        try {
            liczba = odczyt.nextShort();
        } catch (InputMismatchException e) {
            System.out.println("Zly typ danych");

        }
    }
}