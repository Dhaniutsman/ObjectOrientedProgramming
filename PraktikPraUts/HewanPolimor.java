// Kelas Induk
class Hewan {
    void bersuara() {
        System.out.println("Suara hewan");
    }
}

// Subclass pertama
class Herbivora extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Suara herbivora");
    }
}

// Subclass kedua
class Karnivora extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Suara karnivora");
    }
}

// Subclass dari Herbivora
class Kelinci extends Herbivora {
    @Override
    void bersuara() {
        System.out.println("Suara kelinci");
    }
}

// Class Utama untuk menjalankan program
public class HewanPolimor {
    public static void main(String[] args) {
        // Membuat objek-objek dengan konsep Polimorfisme
        Hewan hewanKu = new Hewan();
        Hewan herbivoraKu = new Herbivora();
        Hewan karnivoraKu = new Karnivora();
        Hewan kelinciKu = new Kelinci();

        // Memanggil metode yang sama dari berbagai objek
        hewanKu.bersuara();      // Output: Suara hewan
        herbivoraKu.bersuara();  // Output: Suara herbivora
        karnivoraKu.bersuara();  // Output: Suara karnivora
        kelinciKu.bersuara();    // Output: Suara kelinci
    }
}