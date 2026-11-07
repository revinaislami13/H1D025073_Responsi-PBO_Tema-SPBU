public class Pertalite extends BahanBakar implements CetakStruk {
    private double literTerakhir = 0;
    private double totalBiayaTerakhir = 0;

    public Pertalite(String kodeBBM, double hargaPerLiter, double stokLiter) {
        super(kodeBBM, "Pertalite", hargaPerLiter, stokLiter);
    }

    @Override
    public void prosesTransaksi(double liter) {
        System.out.println("\n--- Memproses Transaksi Pertalite ---");
        if (getStokLiter() >= liter) {
            setStokLiter(getStokLiter() - liter);
            this.literTerakhir = liter;
            this.totalBiayaTerakhir = super.hitungTotal(liter);
            System.out.println("Pembelian " + liter + " liter Pertalite BERHASIL!");
            System.out.println("Total Bayar: Rp " + this.totalBiayaTerakhir);
            System.out.println("Sisa Stok Pertalite: " + getStokLiter() + " liter");
        } else {
            System.out.println("Pembelian GAGAL! Stok Pertalite tidak cukup.");
            System.out.println("Stok tersedia saat ini: " + getStokLiter() + " liter");
        }
    }

    @Override
    public void cetakStruk() {
        System.out.println("======== STRUK SPBU PERTAMINA ========");
        System.out.println("Lokasi       : " + NAMA_SPBU);
        System.out.println("Kode BBM     : " + getKodeBBM());
        System.out.println("Jenis BBM    : " + getNamaBBM());
        System.out.println("Harga/Liter  : Rp " + getHargaPerLiter());
        System.out.println("Jumlah Liter : " + this.literTerakhir + " Liter");
        System.out.println("Total Bayar  : Rp " + this.totalBiayaTerakhir);
        System.out.println("======================================");
    }
}