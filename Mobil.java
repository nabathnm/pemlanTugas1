public class Mobil {
    private String noPlat;
    private String warna;
    public String manufaktur;
    // Modifikasi atribut kecepatan dari int menjadi double karena atribut waktu bertipe double untuk menghitung jarak
    private double kecepatan;
    private double waktu;
    private double jarak;

    // Setter untuk memberi nilai atribut noPlat
    public void setNoPlat(String s) {
        noPlat = s;
    }
    // Setter untuk memberi nilai atribut warna
    public void setWarna(String s) {
        warna = s;
    }
    // Setter untuk memberi nilai atribut manufaktur
    public void setManufaktur(String s) {
        manufaktur = s;
    }
    // Setter untuk memberi nilai atribut kecepatan
    public void setKecepatan(double i) {
        rubahKecepatan(i);
    }
    // Setter untuk memeberi nilai atribut waktu
    public void setWaktu(double d) {
        rubahSekon(d);
    }
    // Method untuk merubah waktu dalam jam menjadi detik
    public void rubahSekon(double d) {
        waktu = d*3600;
    }
    // Method untuk merubah kecepatan dalam km/h menjadi m/s
    public void rubahKecepatan(double d) {
        kecepatan = d*1000/3600;
    }
    // Method untuk menghitung jarak dalam meter kemudian diubah menjadi kilometer
    public void hitungJarak() {
        jarak = kecepatan*waktu;
        jarak /= 1000;
    }
    // Method untuk menampilkan
    public void displayMessage() {
        System.out.println("Mobil anda adalah bermerek " + manufaktur);
        System.out.println("mempunyai nomor plat " + noPlat);
        System.out.println("serta memiliki wana " + warna);
        System.out.printf("dan mampu menempuh kecepatan %.2f m/s\n", kecepatan);
        // Menghitung jarak yang ditempuh sebelum di tampilkan
        hitungJarak();
        System.out.printf("jarak yang dapat ditempuh dalam %.0f jam adalah %.2f km\n", waktu/3600, jarak);
    }
}