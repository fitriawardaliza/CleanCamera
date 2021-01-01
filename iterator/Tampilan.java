package iterator;

public class Tampilan implements Iterator {
    String[] data;
    int position = 0;

    public Tampilan(String[] data) {
        this.data = data;
    }

    public String next() {
        String objekData = data[position];
        position = position + 1;
        return objekData;
    }

    public boolean hasNext() {
        if (position >= data.length || data[position] == null) {
            return false;
        } else {
            return true;
        }
    }
}