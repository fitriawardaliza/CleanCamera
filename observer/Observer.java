package observer;

import java.util.Date;

public interface Observer {
    public void update(long nik, String name, String alamat, Date tanggal);
}
