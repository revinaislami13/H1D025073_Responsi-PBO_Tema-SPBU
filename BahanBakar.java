public abstract class BahanBakar {
    public static final String NAMA_SPBU = "SPBU Pertamina 31.12345";
    private final String kodeBBM;
    private String namaBBM;
    private double hargaPerLiter;
    private double stokLiter;

    public BahanBakar(String kodeBBM, String namaBBM, double hargaPerLiter, double stokLiter) {
        this.kodeBBM = kodeBBM;
        this.namaBBM = namaBBM;
        this.hargaPerLiter = hargaPerLiter;
        this.stokLiter = stokLiter;
    }

    public BahanBakar(String kodeBBM, String namaBBM, double hargaPerLiter) {
        this(kodeBBM, namaBBM, hargaPerLiter, 500.0);
    }

    public void tambahStok(double liter) {
        this.stokLiter += liter;
        System.out.println("Berhasil menambah stok " + this.namaBBM + " sebanyak " + liter + " liter.");
    }

    public double hitungTotal(double liter) {
        return this.hargaPerLiter * liter;
    }

    public abstract void prosesTransaksi(double liter);

    public String getKodeBBM() { return kodeBBM; }
    public String getNamaBBM() { return namaBBM; }
    public void setNamaBBM(String namaBBM) { this.namaBBM = namaBBM; }
    public double getHargaPerLiter() { return hargaPerLiter; }
    public void setHargaPerLiter(double hargaPerLiter) { this.hargaPerLiter = hargaPerLiter; }
    public double getStokLiter() { return stokLiter; }
    public void setStokLiter(double stokLiter) { this.stokLiter = stokLiter; }
}