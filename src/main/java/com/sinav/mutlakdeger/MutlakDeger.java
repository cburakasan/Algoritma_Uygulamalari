package com.sinav.mutlakdeger;

import java.util.Scanner;

public class MutlakDeger {
    Scanner girdi = new Scanner(System.in);

    public void sekizinciSoru(){
        System.out.println("Lütfen mutlak değeri hesaplanacak tam sayiyi giriniz");
        int girilenSayi = girdi.nextInt();
        if (girilenSayi<0){
            int mutlakDeger = girilenSayi * (-1);
            System.out.println("Mutlak Değer:"+ " "+mutlakDeger);
        }
        else {
            System.out.println("Mutlak Değer:"+ " "+girilenSayi);
        }
    }
}
