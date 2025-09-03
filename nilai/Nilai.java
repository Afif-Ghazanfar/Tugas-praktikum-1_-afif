public class Nilai {
    String NIM;
    String Nama;
    double absen, tugas, uts, uas, nilaiAkhir;

    // Method untuk mengisi data
    void Nilai(String nim, String nama, double absen, double tugas, double uts, double uas) {
        this.NIM = nim;
        this.Nama = nama;
        this.absen = absen;
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;

        // Hitung nilai akhir
        this.nilaiAkhir = (absen * 0.1) + (tugas * 0.2) + (uts * 0.3) + (uas * 0.4);
    }

    // Method untuk mencetak data
    void CetakNilai() {
        System.out.println("NIM             : " + NIM);
        System.out.println("Nama            : " + Nama);
        System.out.println("Nilai Absen[10%]: " + absen);
        System.out.println("Nilai Tugas[20%]: " + tugas);
        System.out.println("Nilai UTS [30%] : " + uts);
        System.out.println("Nilai UAS [40%] : " + uas);
        System.out.println("Nilai Akhir     : " + nilaiAkhir);
    }
}
