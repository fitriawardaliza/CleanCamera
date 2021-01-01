package singleton;

public class Singleton {

    private static Singleton single = new Singleton();
    
    private Singleton(){
        System.out.println("Pembuang sampah terekam.....");
    }
    
    public static Singleton getInstance() {
        return single;
    }
}
