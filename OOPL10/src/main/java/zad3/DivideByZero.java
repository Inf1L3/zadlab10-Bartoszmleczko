/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad3;

/**
 *
 * @author student
 */
public class DivideByZero extends Exception {
    private int licznik;
    private int mianownik;

    public DivideByZero(int licznik, int mianownik) {
        this.licznik = licznik;
        this.mianownik = mianownik;
    }
    public void dzielen(){
        try{
            int wynik = licznik/mianownik;
            System.out.println(wynik);
        }
        catch(java.lang.ArithmeticException e){
            System.out.println("Nie mozna dzielic przez 0");
        }
    }
}
