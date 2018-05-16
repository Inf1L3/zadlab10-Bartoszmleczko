package pl.edu.ur.oopl10;

import zad1.WprowadzZKonsoli;
import zad3.DivideByZero;

/**
 *
 * @author mchla
 */
public class Main {

    public static void main(String[] args) {
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
}
}