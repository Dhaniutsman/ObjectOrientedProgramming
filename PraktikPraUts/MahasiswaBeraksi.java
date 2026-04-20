public class MahasiswaBeraksi {
    public static void main(String[] args) {
        // Objek 1 (Data Anda sendiri)
        MahasiswaTugas mhs1 = new MahasiswaTugas();
        mhs1.nama = "UtsmanDhani";
        mhs1.nim = "I.2510435";
        
        // Objek 2 (Teman 1)
        MahasiswaTugas mhs2 = new MahasiswaTugas();
        mhs2.nama = "Gatot Supriyadi";
        mhs2.nim = "L.7892781";
        
        // Objek 3 (Teman 2)
        MahasiswaTugas mhs3 = new MahasiswaTugas();
        mhs3.nama = "Gunawan Dimas Testsuya Ahli Filsafat Muda";
        mhs3.nim = "F.73898258";

        // Memanggil metode untuk setiap objek
        mhs1.tampilkanNama();
        mhs1.tampilkanNim();
        mhs1.olahraga();
        System.out.println("--------------------");
        mhs2.tampilkanNama();
        mhs2.olahraga();
        System.out.println("--------------------");
        mhs3.tampilkanNama();
        mhs3.olahraga();
    }
}