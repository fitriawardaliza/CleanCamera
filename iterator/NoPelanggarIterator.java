package iterator;

public class NoPelanggarIterator implements Iterator {
    String[] items;
    int position = 0;

    public NoPelanggarIterator(String[] items) {
        this.items = items;
    }

    public String next() {
        String dataitems = items[position];
        position = position + 1;
        return dataitems;
    }

    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }
}