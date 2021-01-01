package observer;

public class sampahsembarangan extends Pelanggaran {
    private Cctv cctv;

    public sampahsembarangan(Cctv cctv) {
        this.cctv = cctv;
    }

    public String toString() {
        if (cctv.toString().indexOf("sampah") >= 0)
            return cctv.toString();
        else if (cctv.toString().indexOf("") >= 0)
            return "Pelanggaran : Membuang Sampah Sembarangan";
        return cctv + "";
    }
}