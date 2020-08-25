package com.sinav.teksayitoplami;

import java.util.ArrayList;
import java.util.List;

public class TekSayiToplami {

    public void onuncuSoru(){

        Integer n =10;
        List<Integer> tekSayilar = new ArrayList<>();
        Integer toplam=null;
        for (int i = 0; i < n; i++) {
            if (i%2==1){
                tekSayilar.add(i);
            }
        }
        for (Integer tekSayilarToplama : tekSayilar) {
            toplam=tekSayilarToplama+1;
        }
        System.out.println("1'den n' e kadar olan tek sayilarin toplami=" + " "+toplam);
    }
}
