import java.util.Scanner; // untuk memanggil objek scanner

public class Nomor3 { // untuk membuat class
    public static void main(String[] args) { // untuk memulai program
        int N, nilaiSekarang = 0, nilai = 1, simpanan; // deklarasi tipe dan inisialisasi
        Scanner input = new Scanner(System.in); // untuk membuat variabel dari objek scanner
        System.out.print("Masukkan jumlah suku = "); // untuk mencetak tulisan
        N = input.nextInt(); // untuk memasukkan input user kedalam variabel

        for (int i = 0; i <= N; i++) { /* untuk membuat perintah perulangan jika i = 0, 
            dan i kurang dari sama dengan N lalu nilai i +1 setiap perulangan */
            System.out.print(nilaiSekarang +", "); // untuk mencetak variabel dan tulisan
            simpanan = nilai + nilaiSekarang; // untuk membuat perintah hitung
            nilaiSekarang = nilai;
            nilai = simpanan; 
        }
        input.close(); // untuk menutup objek scanner
    }
}

