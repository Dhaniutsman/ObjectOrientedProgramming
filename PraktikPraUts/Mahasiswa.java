public class Mahasiswa {
    // Atribut
    private String nama;
    private int sks;
    
    // Constructor
    public Mahasiswa(String nama, int sks) {
        this.nama = nama;
        this.sks = sks;
    }
    
    // Metode
    public void setSks(int sks) {
        this.sks = sks;
    }
    
    public int getSks() {
        return sks;
    }
    
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
    }
}