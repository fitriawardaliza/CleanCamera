package iterator;

import java.util.ArrayList;

public class PelanggarIterator implements Iterator {
    ArrayList<String> items;
    int position = 0;

    public PelanggarIterator(ArrayList<String> items) {
        this.items = items;
    }

    public String next() {
        String dataitems = (String) items.get(position);
        position = position + 1;
        return dataitems;
    }

    public boolean hasNext() {
        if (position >= items.size()) {
            return false;
        } else {
            return true;
        }
    }
}
