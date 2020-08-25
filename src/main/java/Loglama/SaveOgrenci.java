package Loglama;

import com.sinav.ogrencinotveharfhesapla.Ogrenci;
import org.apache.log4j.Logger;

public class SaveOgrenci {
    private static Logger log  = Logger.getLogger(SaveOgrenci.class);

    public static void main(String[] args) {
        log.info("save methodu calısıyopr");
        try {
            saveOgrenci();

        }catch (Exception e){
            log.error(e, new Throwable());
            throw new RuntimeException();
        }
        log.info("throw geçildi..");

    }

    private static void saveOgrenci() {
        Ogrenci ogrenci =null;
        ogrenci.setFinalNotu(45d);
        log.info("dskjfbkjsdbfjksbf"+ogrenci.getFinalNotu());
    }

}
