package observer;

import java.util.Date;

public class Identitas implements Display, Observer {
    private long nik;
    private String name;
    private String alamat;
    private Date tanggal;

    public Identitas(Cctv cctv) {
        cctv.registerObserver(this);
    }

    public void update(long nik, String name, String alamat, Date tanggal) {
        this.nik = nik;
        this.name = name;
        this.alamat = alamat;
        this.tanggal = tanggal;
        display();
    }

    public void display() {
        System.out.println("NIK : " + this.nik + "\nNama : " + this.name + "\nAlamat : " + this.alamat + "\nTanggal : " + this.tanggal);
    }

}