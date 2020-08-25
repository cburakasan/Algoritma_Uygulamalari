package com.sinav.verilenikisayininbolunebilmesi;

import java.util.Scanner;

public class VerilenIkiSayininBolunebilmesi {
    Scanner girdi = new Scanner(System.in);

    public void dokuzuncuSoru(){
        System.out.println("Lütfen bir sayı giriniz");
        int x = girdi.nextInt();
        System.out.println("Lütfen bir sayı giriniz");
        int y = girdi.nextInt();

        if (x%y==0){
            System.out.println("x sayisi y sayisina tam bolunur");
        }
        else {
            System.out.println("x sayisi y sayisina tam bolunmez");
        }


    }
}
