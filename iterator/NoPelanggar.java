package iterator;

public class NoPelanggar implements Data {
    static final int MAX_ITEMS = 1000;
    int numberOfItems = 0;
    String[] dataItems;

    public NoPelanggar() {
        dataItems = new String[MAX_ITEMS];

        addItem("No  NIK    Nama             Alamat");
        addItem("1.  12115  Ali Syahputra    Peunayong");
        addItem("2.  22116  seliana          Lamdingin");
        addItem("3.  52238  Tatan            Batoh");
        addItem("4.  59562  Intan Salmiah    Neusu");
        addItem("5.  76521  M.Kahfi          Lamnyong");
        addItem("6.  52188  Rahmad           Peurada");
        addItem("7.  40912  Yasmine          Simpang Surabaya");
    }

    public void addItem(String name)
    {
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println(" ");
        } else {
            dataItems[numberOfItems] = name;
            numberOfItems = numberOfItems + 1;
        }
    }

    public String[] getDataItems() {
        return dataItems;
    }

    public Iterator createIterator() {
        return new NoPelanggarIterator(dataItems);
    }
}
