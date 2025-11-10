import java.util.Scanner; // untuk memanggil objek scanner

public class Nomor4 { // untuk membuat class
    public static void main(String[] args) { // untuk memulai program
        Scanner input = new Scanner(System.in);
        int a = 0, b = 0, c = 0; // deklarasi tipe dan inisialisasi
        double x1 = 0, x2 = 0, diskriminan = 0 , x = 0, y = 0, sementara;

        while (diskriminan == 0) { // untuk membuat perintah looping jika diskriminan = 0
            System.out.print("Masukkan nilai a = "); // untuk mencetak tulisan
            a = input.nextInt(); // untuk memasukkan input user kedalam variabel

            System.out.print("Masukkan nilai b = ");
            b = input.nextInt();

            System.out.print("Masukkan nilai c = ");
            c = input.nextInt();

            System.out.println();

            diskriminan = b * b - 4 * a * c; // untuk membuat perintah hitung   
        }

        if (diskriminan > 0) { // untuk membuat kondisi jika 
            x1 = (-b + Math.sqrt(diskriminan)) / (2 * a); // Math.sqrt untuk membuat perintah hitung
            x2 = (-b - Math.sqrt(diskriminan)) / (2 * a);
        } if (x1 > x2) {
            sementara = x1; // untuk menukar nilai agar x2 tetap lebih besar dari x1
            x1 = x2;
            x2 = sementara;

        System.out.println("Dari persamaaan y = "+a+"x^2 + "+b+"x + "+c);
        System.out.println("Akar-akarnya adalah = "+x1+" dan "+x2);
        System.out.println("-------------------------------------------");
        System.out.println("\tx"+"\t    |"+"\ty = "+a+"x^2 + "+b+"x + "+c);
        System.out.println("-------------------------------------------");

        for (x = x1; x <= x2; x += 0.25) { /* untuk membuat perintah perulangan jika i = 0, 
            dan i kurang dari sama dengan N lalu nilai i +1 setiap perulangan */ 
            y = a * x * x + b * x + c;
            System.out.printf("%8.2f\t    |\t    %8.2f%n", x, y);
            /* untuk membuat format output berjumlah 8 karakter dengan ouput bilangan desimal 
            hanya 2 dibelakang koma */
            }
        } 
        
        System.out.println("-------------------------------------------");
        input.close(); // untuk menutup objek scanner
    }
}

