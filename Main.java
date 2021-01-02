import observer.*;
import iterator.*;
import singleton.*;
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
         
        Pelanggar pelanggar = new Pelanggar();
        NoPelanggar noPelanggar = new NoPelanggar();

        // with iterators
        Iterator pelanggarIterator = pelanggar.createIterator();
        Iterator noPelanggarIterator = noPelanggar.createIterator();

        System.out.println("\n\n\n--------------------Data Pembuang Sampah Sembarangan--------------------");
        printData(pelanggarIterator);
        System.out.println("\n\n--------------------Data Tidak Membuang Sampah--------------------");
        printData(noPelanggarIterator);
    }

    private static void printData(Iterator iterator) {
        while (iterator.hasNext()) {
            String dataItems = (String)iterator.next();
            System.out.println(dataItems);

        }
       
    }
}