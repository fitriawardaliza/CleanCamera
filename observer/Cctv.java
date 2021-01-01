package observer;

import java.util.ArrayList;
import java.util.Date;

public class Cctv implements Subject {
    private ArrayList<Observer> observers;
    private long nik;
    private String name;
    private String alamat;
    private Date tanggal;
    

    public Cctv() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        if (observers.indexOf(o) >= 0)
            observers.remove(observers.indexOf(o));

    }

    public void notifyObservers() {
        for (Observer ob : observers)
            ob.update(nik, name, alamat, tanggal);
    }

    public void sensorChanged() {
        notifyObservers();
    }

    public void setSensor(long nik, String name, String alamat, Date tanggal) {
        this.nik = nik;
        this.name = name;
        this.alamat = alamat;
        this.tanggal = tanggal;
        sensorChanged();
    }
}