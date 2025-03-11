import java.util.Scanner;
public class MainMobil {
    public static void main(String[] args) {
        // Membuat scanner dengan nama scan
        Scanner scan = new Scanner(System.in);

        // Instansiasi objek dengan nama m1
        System.out.println("================");
        System.out.println("masukkan informasi untuk mobil 1");
        Mobil m1 = new Mobil();

        // User diminta memberikan nilai kecepatan mobil, disimpan dalam atribut private int kecepatan pada class Mobil.java
        System.out.print("masukkan kecepatan mobil dalam km/h: ");
        m1.setKecepatan(scan.nextDouble());
        scan.nextLine();

        // User diminta memberikan merek mobil, disimpan dalam atribut private String manufaktur pada class Mobil.java
        System.out.print("masukkan merek mobil: ");
        m1.setManufaktur(scan.nextLine());

        // User diminta memberikan nomor plat mobil, disimpan dalam atribut private String noPlat pada class Mobil.java
        System.out.print("masukkan nomor plat mobil: ");
        m1.setNoPlat(scan.nextLine());

        // User diminta memberikan warna mobil, disimpan dalam atribut private String warna pada class Mobil.java
        System.out.print("masukkan warna mobil: ");
        m1.setWarna(scan.nextLine());

        // User diminta memberikan nilai waktu mobil dalam format jam, disimpan dalam atribut private double waktu pada class Mobil.java
        System.out.print("masukkan waktu yang ditempuh mobil dalam jam: ");
        m1.setWaktu(scan.nextDouble());

        // Memanggil method displayMessage() dari class Mobil.java pada objek m1
        System.out.println("================");
        m1.displayMessage();
        
        // Instansiasi objek dengan nama m2
        System.out.println("================");
        System.out.println("masukkan informasi untuk mobil 2");
        Mobil m2 = new Mobil();

        // User diminta memberikan nilai kecepatan mobil, disimpan dalam atribut private int kecepatan pada class Mobil.java
        System.out.print("masukkan kecepatan mobil dalam km/h: ");
        m2.setKecepatan(scan.nextInt());
        scan.nextLine();

        // User diminta memberikan merek mobil, disimpan dalam atribut private String manufaktur pada class Mobil.java
        System.out.print("masukkan merek mobil: ");
        m2.setManufaktur(scan.nextLine());

        // User diminta memberikan nomor plat mobil, disimpan dalam atribut private String noPlat pada class Mobil.java
        System.out.print("masukkan nomor plat mobil: ");
        m2.setNoPlat(scan.nextLine());

        // User diminta memberikan warna mobil, disimpan dalam atribut private String warna pada class Mobil.java
        System.out.print("masukkan warna mobil: ");
        m2.setWarna(scan.nextLine());

        // User diminta memberikan nilai waktu mobil dalam format jam, disimpan dalam atribut private double waktu pada class Mobil.java
        System.out.print("masukkan waktu yang ditempuh mobil dalam jam: ");
        m2.setWaktu(scan.nextDouble());

        // Memanggil method displayMessage() dari class Mobil.java pada objek m1
        System.out.println("================");
        m2.displayMessage();

        System.out.println("================");
        //menutup scanner
        scan.close();
    }
}