import java.util.Scanner; // untuk memanggil objek scanner 

public class Nomor1 { // untuk membuat class
    public static void main(String[] args) { // untuk memulai program
        Scanner input = new Scanner(System.in); // untuk membuat variabel dari objek scanner
        int N, jumlah; // deklarasi tipe dan inisialisasi
        double r, total = 0;
        String jenis;

        System.out.print("masukkan jumlah tahanan yang akan dihitung = "); // untuk mencetak tulisan
        N = input.nextInt(); // untuk memasukkan input user 

        input.nextLine(); // agar dapat merubah variabel input menjadi tipe string  
        System.out.print("masukkan jenis susunan tahanan (Seri/Paralel) = ");
        jenis = input.nextLine().toUpperCase(); // toUpperCase untuk membuat huruf auto kapital

        if (jenis.equals("SERI")) { // untuk membuat kondisi jika dan input user adalah tulisan SERI
            // .equals untuk mengartikan "sama dengan" jika input berupa string / tulisan 
            for (jumlah = 1; jumlah <= N; jumlah++) { /*  untuk membuat perintah perulangan jika jumlah = 1 
                dan jumlah kurang atau sama dengan N, lalu jumlah +1 setiap perulangan */
                System.out.print("masukkan nilai resistor " + jumlah + " = ");
                r = input.nextInt();
                total += r;
            }
            System.out.println("Tahanan Total = "+total);
        }
        if (jenis.equals("PARALEL")) {
            for (jumlah = 1; jumlah <= N; jumlah++) {
                System.out.print("masukkan nilai resistor " + jumlah + " = ");
                r = input.nextInt();
                total += (1 / r); // untuk membuat perintah hitung
            }
            double rt = 1 / total;
            System.out.printf("Total Tahanan = %.4f%n", rt);
            // %.4f untuk membuat format output desimal hanya 4 angka dibelakang koma
            // %n untuk membuat baris baru
        }
        input.close(); // untuk menutup objek scanner
    }
}

