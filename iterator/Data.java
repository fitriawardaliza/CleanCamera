package iterator;

public class Data implements Objek {
    static final int MAX_DATA = 1000;
    int numberOfData = 0;
    String[] objekData;

    public Data() {
        objekData = new String[MAX_DATA];

        addData(" NIK  Nama   Alamat");
        addData("1211  ali    Jakarta");
        addData("2211  seli   Lampung");
    }

    public void addData(String name)
    {
        if (numberOfData >= MAX_DATA) {
            System.err.println(" ");
        } else {
            objekData[numberOfData] = name;
            numberOfData = numberOfData + 1;
        }
    }

    public String[] getObjekData() {
        return objekData;
    }

    public Iterator createIterator() {
        return new Tampilan(objekData);
    }

    // other menu methods here
}
