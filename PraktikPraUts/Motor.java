public class Motor {
    // Atribut
    private String warna;
    private String merk;
    
    // Constructor
    public Motor(String warna, String merk) {
        this.warna = warna;
        this.merk = merk;
    }
    
    // Metode
    public void tampilkanInfo() {
        System.out.println("Warna: " + warna);
        System.out.println("Merk: " + merk);
    }
}