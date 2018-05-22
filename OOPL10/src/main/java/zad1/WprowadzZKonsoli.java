/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class WprowadzZKonsoli {

    Scanner odczyt = new Scanner(System.in);

    public WprowadzZKonsoli() {
    }

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
       public void ToFileText() throws IOException {
        String nazwaplik;
        System.out.println("Podaj nazwę pliku: ");
        nazwaplik = odczyt.nextLine();

        try {
            FileWriter nadpisz = new FileWriter(nazwaplik + ".txt");
            BufferedWriter bufor = new BufferedWriter(nadpisz);
            String text;
            System.out.println("Wpisz tekst do pliku: ");
            text = odczyt.nextLine();
            bufor.write(text);
            bufor.newLine();
            bufor.close();

        } catch (IOException e) {
            System.out.println("Błąd zapisu do pliku");
        }

    }

    public void FromFileText() throws FileNotFoundException, IOException {
        String nazwapliku;
        System.out.println("Z jakiego pliku chcesz odczytać: ");
        nazwapliku = odczyt.nextLine();
        try {
            FileReader odczyt = new FileReader(nazwapliku + ".txt");
            BufferedReader bufor = new BufferedReader(odczyt);

            String text = bufor.readLine();

            do {
                System.out.println(text);
                text = bufor.readLine();

            } while (text != null);

        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku");
        }

    }

}