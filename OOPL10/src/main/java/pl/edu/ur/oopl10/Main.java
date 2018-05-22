package pl.edu.ur.oopl10;

import java.io.IOException;
import zad1.WprowadzZKonsoli;
import zad3.DivideByZero;
import java.util.*;
/**
 *
 * @author mchla
 */
public class Main {

    public static void main(String[] args) throws IOException {
        WprowadzZKonsoli wprowadz = new WprowadzZKonsoli();
        wprowadz.wprowadzInt();
               int liczby[] = { 1, 2, 3 };
 
    try
    {
      int wyswietl = liczby[3];                          
      System.out.println("Liczba to: " + wyswietl);
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
      System.out.println("Poza tablica "  );
    }
    DivideByZero dziel = new DivideByZero(2, 0);
    dziel.dzielen();   
   try{
       dziel.dzielen();
   }
    catch (ArithmeticException e) {
            System.out.println("Dzielenie przez 0");
        }
   Random r = new Random();                 //zad4
   int a = r.nextInt(21)-10;
   int b = r.nextInt(21)-10;
   try{
       int wynik = a/b;
       System.out.println(wynik);
   }
   catch(ArithmeticException e ){
       System.out.println("Dzielenie przez 0");
   }
    WprowadzZKonsoli plik = new WprowadzZKonsoli();
              plik.ToFileText();
              plik.FromFileText();
}
}