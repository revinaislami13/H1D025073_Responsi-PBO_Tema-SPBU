public class Main {
    public static void main(String[] args) {
        // Instansiasi objek subclass
        Pertalite pertalite = new Pertalite("BBM01", 10000, 50);
        PertamaxTurbo turbo = new PertamaxTurbo("BBM02", 14400, 30);

        // Uji transaksi (berhasil & gagal stok)
        pertalite.prosesTransaksi(20);
        turbo.prosesTransaksi(40);

        // Uji tambah stok
        turbo.tambahStok(50);
        turbo.prosesTransaksi(40);

        // Syarat 9: Polimorfisme Interface
        System.out.println("\n--- Struk Pembayaran ---");
        CetakStruk s1 = pertalite;
        CetakStruk s2 = turbo;

        s1.cetakStruk();
        s2.cetakStruk();
    }
}