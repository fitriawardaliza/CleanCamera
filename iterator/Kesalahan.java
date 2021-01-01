package iterator;

import java.util.ArrayList;

public class  Kesalahan implements Objek {
    ArrayList<String> objekData;

    public Kesalahan() {
        objekData = new ArrayList<String>();

        addData(" NIK  Nama   Alamat");
        addData("1111  Lia    Jagong");
        addData("2222  fiti   Takengon");
    
    }

    public void addData(String name)
    {
        objekData.add(name);
    }

    public ArrayList<String> getObjekData() {
        return objekData;
    }

    public Iterator createIterator() {
        return new Kamera(objekData);
    }


    // other menu methods here
}