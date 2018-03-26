/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

/**
 *
 * @author student
 */
public class Ksiazka {
    
    public static void main(String[] args){
        Ksiazki ksiazka1 = new Ksiazki("Mały książe", "Antoine de Saint-Exupéry", 96, 1943, 15);
        Ksiazki ksiazka2 = new Ksiazki("Quo vadis", "Henryk Sienkiewicz", 460, 1895 , 1.69);
        Ksiazki ksiazka3 = new Ksiazki("Na polu chwały ", "Henryk Sienkiewicz", 272, 1906, 1.20);
        Ksiazki ksiazka4 = new Ksiazki("Hel 3", "Jarosław Grzędowicz", 512, 2017, 30.16);

    ksiazka1.wyswietl();
    ksiazka2.wyswietl();
    ksiazka3.wyswietl();
    ksiazka4.wyswietl();
    
    }
}
