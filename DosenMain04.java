public class DosenMain04 {
    public static void main(String[] args) {
        Dosen04 dosen1 = new Dosen04();
        dosen1.idDosen = "ROW";
        dosen1.nama = "Rokhimatul Wakhidah, S.Pd., M.T.";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2013;
        dosen1.bidangKeahlian = "Critical thinking";
        dosen1.tampilInformasi();

        dosen1.setStatusAktif(false);
        System.out.println("Masa kerja: " + dosen1.hitungMasaKerja(2025) + " tahun");
        dosen1.ubahKeahlian("Machine Learning");

        System.out.println();

        Dosen04 dosen2 = new Dosen04("WIS", "Wilda Imama Sabilla, S.kom., M.Kom.", true, 2015, "Data Science");
        dosen2.tampilInformasi();

        dosen2.setStatusAktif(true);
        System.out.println("Masa kerja: " + dosen2.hitungMasaKerja(2025) + " tahun");
        dosen2.ubahKeahlian("Big Data Analytics");
    }
}
