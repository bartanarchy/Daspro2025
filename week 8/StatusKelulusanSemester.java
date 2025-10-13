import java.util.Scanner;

public class StatusKelulusanSemester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // untuk menginput nama mahasiswa 
        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = input.nextLine();

        // untuk menginput NIM mahasiswa
        System.out.print("Masukkan NIM Mahasiswa: ");
        String nim = input.nextLine();

        // Mata Kuliah 1: Algoritma dan Pemrograman berisi untuk menginput niai uts,uas,dan tugas
        //double digunakan untuk inputan nilai yang bersifat decimal dan detail
        System.out.println("\nMata Kuliah 1: Algoritma dan Pemrograman");
        System.out.print("Nilai UTS : ");
        double uts1 = input.nextDouble();
        System.out.print("Nilai UAS : ");
        double uas1 = input.nextDouble();
        System.out.print("Nilai Tugas : ");
        double tugas1 = input.nextDouble();

        // setelah itu dibagi dengan 3 komponen pembgian uts 30%, uas 40%, dan tugas 30%
        double akhir1 = (uts1 * 0.3) + (uas1 * 0.4) + (tugas1 * 0.3);
        String huruf1 = "";
        String kualifikasi1 = "";
        String status1 = "";

        // setelah itu dia akan langsug menentukan apakah mahasisw lulus/tidak berdasarkan rata rata nya yaitu 60
        if (akhir1 >= 60) {
            status1 = "LULUS";
        } else {
            status1 = "TIDAK LULUS";
        }

        // Jika nilai akhir lebih dari 80 hingga maksimal 100
        // Maka mahasiswa mendapat nilai huruf A dengan kualifikasi "Sangat Baik"
        if (akhir1 > 80 && akhir1 <= 100) {
            huruf1 = "A"; kualifikasi1 = "Sangat Baik";
        // Jika nilai akhir lebih dari 73 hingga maksimal 80
        // Maka mahasiswa mendapat nilai huruf B+ dengan kualifikasi "Lebih dari Baik"
        } else if (akhir1 > 73 && akhir1 <= 80) {
            huruf1 = "B+"; kualifikasi1 = "Lebih dari Baik";
        // Jika nilai akhir lebih dari 65 hingga maksimal 73
        // Maka mahasiswa mendapat nilai huruf B dengan kualifikasi "Baik"
        } else if (akhir1 > 65 && akhir1 <= 73) {
            huruf1 = "B"; kualifikasi1 = "Baik";
        // Jika nilai akhir lebih dari 60 hingga maksimal 65
        // Maka mahasiswa mendapat nilai huruf c+ dengan kualifikasi "Lebih dari Cukup"
        } else if (akhir1 > 60 && akhir1 <= 65) {
            huruf1 = "C+"; kualifikasi1 = "Lebih dari Cukup";
        // Jika nilai akhir lebih dari 55 hingga maksimal 60
        // Maka mahasiswa mendapat nilai huruf c dengan kualifikasi "cukup"
        } else if (akhir1 > 55 && akhir1 <= 60) {
            huruf1 = "C"; kualifikasi1 = "Cukup";
        // Jika nilai akhir lebih dari 50 hingga maksimal 55
        // Maka mahasiswa mendapat nilai huruf d dengan kualifikasi "Kurang"
        } else if (akhir1 > 50 && akhir1 <= 55) {
            huruf1 = "D"; kualifikasi1 = "Kurang";
        // jika nilai lebih kecil dari nilai 50 maka mendapat kualifikasi "gagal"
        } else {
            huruf1 = "E"; kualifikasi1 = "Gagal";
        }

        // Mata Kuliah 2: Struktur Data. bagian ini untuk menginput nilai 
        System.out.println("\nMata Kuliah 2: Struktur Data");
        System.out.print("Nilai UTS : ");
        double uts2 = input.nextDouble();
        System.out.print("Nilai UAS : ");
        double uas2 = input.nextDouble();
        System.out.print("Nilai Tugas : ");
        double tugas2 = input.nextDouble();

        //logika untuk persentasi penilaian 0.3=30% tergantung angka akhir titik. dan untuk membagi nilai berdasarkan inputan di atas, lalu akan keluar hasil rata rata nya
        //String digunakan untuk menyimpan data berupa teks atau kumpulan karakter
        double akhir2 = (uts2 * 0.3) + (uas2 * 0.4) + (tugas2 * 0.3);
        String huruf2 = "";
        String kualifikasi2 = "";
        String status2 = "";

        //logika untuk rata rata jika nilai lebih atau sama dengan 60 maka hasil akan LULUS, jika sebalik nya maka hasil nya TIDAK LULUS
        if (akhir2 >= 60) {
            status2 = "LULUS";
        } else {
            status2 = "TIDAK LULUS";
        }

        if (akhir2 > 80 && akhir2 <= 100) {
            huruf2 = "A"; kualifikasi2 = "Sangat Baik";
        } else if (akhir2 > 73 && akhir2 <= 80) {
            huruf2 = "B+"; kualifikasi2 = "Lebih dari Baik";
        } else if (akhir2 > 65 && akhir2 <= 73) {
            huruf2 = "B"; kualifikasi2 = "Baik";
        } else if (akhir2 > 60 && akhir2 <= 65) {
            huruf2 = "C+"; kualifikasi2 = "Lebih dari Cukup";
        } else if (akhir2 > 55 && akhir2 <= 60) {
            huruf2 = "C"; kualifikasi2 = "Cukup";
        } else if (akhir2 > 50 && akhir2 <= 55) {
            huruf2 = "D"; kualifikasi2 = "Kurang";
        } else {
            huruf2 = "E"; kualifikasi2 = "Gagal";
        }

        // logika untuk menghitung rata rata mahasiswa. jika rata rata kurang maka status nya akan "TIDAK LULUS"
        // jika rata rata sama atau lebih besar maka status akan "LULUS"
        double rataRata = (akhir1 + akhir2) / 2;
        String statusSemester;
        if (rataRata >= 70) {
            statusSemester = "LULUS";
        } else {
            statusSemester = "TIDAK LULUS";
        }

        // Output hasil
        System.out.println("\n=== HASIL PENILAIAN AKADEMIK ===");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println();

        System.out.println("Mata Kuliah                 UTS    UAS     Tugas   Nilai Akhir   Nilai Huruf   Status");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.printf("Algoritma dan Pemrograman  %.2f  %.2f  %.2f     %.2f         %s         %s\n",
                uts1, uas1, tugas1, akhir1, huruf1, status1);
        System.out.printf("Struktur Data              %.2f  %.2f  %.2f     %.2f         %s         %s\n",
                uts2, uas2, tugas2, akhir2, huruf2, status2);

        System.out.println("\nNilai Rata-rata : " + String.format("%.2f", rataRata));
        System.out.println("Status Semester : " + statusSemester);
    }
}