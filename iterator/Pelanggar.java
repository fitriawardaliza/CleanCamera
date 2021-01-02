package iterator;

import java.util.ArrayList;

public class  Pelanggar implements Data {
    ArrayList<String> dataItems;

    public Pelanggar() {
        dataItems = new ArrayList<String>();

        addItem("No. NIK    Nama              Alamat");
        addItem("1.  58196  Selfiana          Darussalam");
        addItem("2.  76502  Fitria Wardaliza  Peulanggahan");
        addItem("3.  65821  Jamal Udin        Lambaro");
        addItem("4.  10218  Lia Rindiany      Darussalam");
    
    }

    public void addItem(String name)
    {
        dataItems.add(name);
    }

    public ArrayList<String> getDataItems() {
        return dataItems;
    }

    public Iterator createIterator() {
        return new PelanggarIterator(dataItems);
    }
}