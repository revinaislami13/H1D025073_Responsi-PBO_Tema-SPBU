public class PertamaxTurbo extends BahanBakar implements CetakStruk, LayananTambahan {
    private int poinLoyalti;
    private double literTerakhir = 0;
    private double totalBiayaTerakhir = 0;

    public PertamaxTurbo(String kodeBBM, double hargaPerLiter, double stokLiter) {
        super(kodeBBM, "Pertamax Turbo", hargaPerLiter, stokLiter);
        this.poinLoyalti = 0;
    }

    @Override
    public void prosesTransaksi(double liter) {
        System.out.println("\n--- Memproses Transaksi Pertamax Turbo ---");
        if (getStokLiter() >= liter) {
            setStokLiter(getStokLiter() - liter);
            this.literTerakhir = liter;
            this.totalBiayaTerakhir = super.hitungTotal(liter);
            beriPoinLoyalti((int) liter * 2);
            System.out.println("Pembelian " + liter + " liter Pertamax Turbo BERHASIL!");
            System.out.println("Total Bayar: Rp " + this.totalBiayaTerakhir);
            System.out.println("Sisa Stok Pertamax Turbo: " + getStokLiter() + " liter");
        } else {
            System.out.println("Pembelian GAGAL! Stok Pertamax Turbo tidak mencukupi.");
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
        System.out.println("Poin Loyalti : " + this.poinLoyalti);
        System.out.println("======================================");
    }

    @Override
    public void beriPoinLoyalti(int poin) {
        this.poinLoyalti += poin;
        System.out.println("Selamat! Anda mendapatkan " + poin + " poin loyalti.");
    }
}