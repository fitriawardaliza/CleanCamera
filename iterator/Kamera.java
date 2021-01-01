package iterator;

import java.util.ArrayList;

public class Kamera implements Iterator {
    ArrayList<String> data;
    int position = 0;

    public Kamera(ArrayList<String> data) {
        this.data = data;
    }

    public String next() {
        String objekData= (String) data.get(position);
        position = position + 1;
        return objekData;
    }

    public boolean hasNext() {
        if (position >= data.size()) {
            return false;
        } else {
            return true;
        }
    }
}
