package com.sinav.ogrencinotveharfhesapla;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OgrenciNotVeHarfHesapla {
    Scanner girdi = new Scanner(System.in);

    public void sinavNotuHesaplama(){
        List<Ogrenci> ogrenciList=new ArrayList<>();

        for (int i = 0; i <= 2; i++) {
            Ogrenci ogrenci = new Ogrenci();
            System.out.println("Lutfen Ogrencinin Vize Notunu Giriniz");
            double vizeNotu = girdi.nextDouble();
            ogrenci.setVizeNotu(vizeNotu);
            System.out.println();
            System.out.println("Lutfen Ogrencinin Final Notunu Giriniz");
            double finalNotu = girdi.nextDouble();
            ogrenci.setFinalNotu(finalNotu);
            ogrenciList.add(ogrenci);

        }
        for (Ogrenci ogrenci : ogrenciList) {
            Double vizeNotu = ogrenci.getVizeNotu();
            Double finalNotu = ogrenci.getFinalNotu();
            double ortalama = (vizeNotu * 0.4) + (finalNotu * 0.6);
            if (ortalama<50.00){
                System.out.println("Dersi gecemediniz");
            }
            else if (ortalama>=50 && ortalama<60){
                System.out.println("Harf Notunuz:CC");
            }
            else if (ortalama>=60 && ortalama<70){
                System.out.println("Harf Notunuz:BB");
            }
            else if (ortalama>=70 && ortalama<80){
                System.out.println("Harf Notunuz:BA");

            }
            else if (ortalama>=80 && ortalama<=100){
                System.out.println("Harf Notunuz:AA");

            }


        }




    }
}
