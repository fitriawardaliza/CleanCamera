import singleton.*;
import observer.*;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String args[]) throws Exception {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
        Singleton s4 = Singleton.getInstance();

        Cctv cctv = new Cctv();
        new Identitas(cctv);
        
        cctv.setSensor(10218, "Lia Rindiany", "Darussalam", new SimpleDateFormat("yyyy-MM-dd").parse("2020-12-25"));
        
        cctv = new sampahsembarangan(cctv);
        System.out.println(cctv);
        Kesalahan Kesalahan = new Kesalahan();
        Data data = new Data();
    }
}