/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

import java.util.Date;

/**
 *
 * @author student
 */
//public class Daata extends Date {
//    
//    public int dzien;
//    public int miesiac;
//    public int rok;
//
////    public Daata(int dzien, int miesiac, int rok) throws Exception {
//        
////        switch (miesiac){                     // 1 sposób
////            case 1:
////                this.miesiac = miesiac;
////                if(dzien > 0 && dzien < 32){
////                    this.dzien = dzien;
////                } else {
////                    System.out.print("Nie ma takiego dnia");
////                    throw new Exception();
////                }
////                break;
////            case 2:
////            case 3:
//
////        Date d = new Daata(dzien, miesiac, rok);
////        
////        }
////    
////    public void dodajTydzien(){
////        setDate(new )
////    }   
//}

public class Daata {
    
    public void aktualnaData(){
        System.out.println(new Date());
    }
}