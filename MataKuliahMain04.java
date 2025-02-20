public class MataKuliahMain04 {
    public static void main(String[] args) {
        MataKuliah04 mk1 = new MataKuliah04();
        mk1.kodeMK = "ALSD";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 4;
        mk1.tampilInformasi();

        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);

        System.out.println();
        MataKuliah04 mk2 = new MataKuliah04("PRAKALSD", "Praktikum Algoritma dan Struktur Data", 3, 5);
        
        mk2.tampilInformasi();
        mk2.ubahSKS(2);
        mk2.tambahJam(3);
        mk2.kurangiJam(2);
    }
}
