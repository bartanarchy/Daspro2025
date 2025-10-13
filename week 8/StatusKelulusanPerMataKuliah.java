import java.util.Scanner;

public class StatusKelulusanPerMataKuliah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama Mahasiswa: ");
        String nama = input.nextLine();

        System.out.print("NIM Mahasiswa: ");
        String nim = input.nextLine();

        System.out.println("\nMasukkan Nilai:");
        System.out.print("UTS: ");
        double uts = input.nextDouble();

        System.out.print("UAS: ");
        double uas = input.nextDouble();

        System.out.print("Tugas: ");
        double tugas = input.nextDouble();

        double nilaiAkhir = (uts * 0.3) + (uas * 0.4) + (tugas * 0.3);
        String status = "";
        String huruf = "";
        String kualifikasi = "";

        if (nilaiAkhir >= 60) {
            status = "LULUS";
        } else {
            status = "TIDAK LULUS";
        }

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            huruf = "A";
            kualifikasi = "Sangat Baik";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            huruf = "B+";
            kualifikasi = "Lebih dari Baik";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            huruf = "B";
            kualifikasi = "Baik";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            huruf = "C+";
            kualifikasi = "Lebih dari Cukup";
        } else if (nilaiAkhir > 55 && nilaiAkhir <= 60) {
            huruf = "C";
            kualifikasi = "Cukup";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 55) {
            huruf = "D";
            kualifikasi = "Kurang";
        } else if (nilaiAkhir >= 0 && nilaiAkhir <= 50) {
            huruf = "E";
            kualifikasi = "Gagal";
        }

        System.out.println("\n____________ Hasil Penilaian ____________");
        System.out.println("Nama           : " + nama);
        System.out.println("NIM            : " + nim);
        System.out.println("Nilai Akhir    : " + nilaiAkhir);
        System.out.println("Nilai Huruf    : " + huruf);
        System.out.println("Kualifikasi    : " + kualifikasi);
        System.out.println("Status         : " + status);
    }
}