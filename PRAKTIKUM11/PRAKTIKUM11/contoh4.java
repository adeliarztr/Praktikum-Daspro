package PRAKTIKUM11;

public class contoh4 {
    public static void main(String[] args) {
        daftarPengunjung("Senin", 5, "Ali", "Budi", "Citra", "Dewi", "Eko");
    }

    public static void daftarPengunjung(String hari, int jumlah, String... namaPengunjung) {
        System.out.println("Daftar pengunjung pada hari: " + hari);
        System.out.println("Jumlah pengunjung: " + jumlah);
        System.out.println("Nama-nama pengunjung:");
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
    }
}
