package CesarAlgoritmasi;

import java.util.Scanner;

public class CesarAlgoritmasi {
    static Scanner girdi = new Scanner(System.in);
    public static void main(String[] args) {
        cesarAlgoritmasi();
    }
    private static void cesarAlgoritmasi() {
        System.out.println("Lütfen kripto islemi için ileri ötelenecek harf adedini giriniz");
        int kriptoOteleme = girdi.nextInt();
        String alfabe = "";
        StringBuilder yeniMetin = new StringBuilder();
        for (char i = 'a'; i <= 'z'; i++) {
            alfabe += i;
        }
        System.out.println("Lütfen kriptolanacak metni giriniz");
        String kriptolanacakMetin = girdi.next();
        for (int i = 0; i < kriptolanacakMetin.length(); i++) {
            char metinChar = kriptolanacakMetin.charAt(i);
            for (int charAlfa = 0; charAlfa < alfabe.length(); charAlfa++) {
                char afabechar = alfabe.charAt(charAlfa);
                if(metinChar == afabechar){
                    int indexOf = alfabe.indexOf(afabechar);
                    int newIndex = (indexOf + kriptoOteleme) ;
                    char newChar = alfabe.charAt(newIndex);
                    yeniMetin.append(newChar);
                }
        }
        }
        System.out.println(yeniMetin.toString());
    }
}
