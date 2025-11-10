import java.util.Scanner; // untuk memanggil objek scanner

public class Nomor2 { // untuk membuat class
    public static void main(String[] args) { // untuk memulai program
        Scanner input = new Scanner(System.in); // untuk membuat variabel dari objek scanner
        int N = 0; // deklarasi tipe dan inisialisasi
        double x ,jumlahAkar = 0, jumlahInvers = 0, jumlahKuadrat = 0;

        System.out.print("Masukkan junlah data = ");
        N = input.nextInt();

        for (int i = 1; i <= N; i++) { /* untuk membuat perintah perulangan jika i = 1, 
            dan i kurang dari sama dengan N lalu nilai i +1 setiap perulangan */
            System.out.print("Masukkan data ke-" + i + ": "); // untuk mencetak tulisan beserta variabel
            x = input.nextDouble(); // untuk memasukkan input user kedalam variabel

            jumlahKuadrat += Math.pow(x, 2); // Math.pow untuk membuat perhitungan pangkat 2
            if (x >= 0) { // untuk membuat kondisi jika
                jumlahAkar += Math.sqrt(x); // Math.sqrt untuk membuat perhitungan akar kuadrat
            } if (x != 0) {
                jumlahInvers += 1 / x;
            }
        }

        System.out.println("Jumlah kuadrat data = " + jumlahKuadrat);
        System.out.println("Jumlah akar data = " + jumlahAkar);
        System.out.println("Jumlah 1/data = " + jumlahInvers);

        input.close(); // untuk menutup objek scanner
    }
}

