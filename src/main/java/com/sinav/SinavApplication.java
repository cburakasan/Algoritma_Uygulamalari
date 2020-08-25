package com.sinav;

import com.sinav.verilenikisayininbolunebilmesi.VerilenIkiSayininBolunebilmesi;
import com.sinav.teksayitoplami.TekSayiToplami;
import com.sinav.ogrencinotveharfhesapla.OgrenciNotVeHarfHesapla;
import com.sinav.mutlakdeger.MutlakDeger;

public class SinavApplication {

    static OgrenciNotVeHarfHesapla yedinciSoru= new OgrenciNotVeHarfHesapla ();
    static MutlakDeger sekizinciSoru= new MutlakDeger ();
    static VerilenIkiSayininBolunebilmesi dokuzuncuSoru= new VerilenIkiSayininBolunebilmesi ();
    static TekSayiToplami onuncuSoru =new TekSayiToplami ();

    public static void main(String[] args) {

//        yedinciSoru.sinavNotuHesaplama();
//        sekizinciSoru.sekizinciSoru();
//        dokuzuncuSoru.dokuzuncuSoru();
            onuncuSoru.onuncuSoru();

    }
}
