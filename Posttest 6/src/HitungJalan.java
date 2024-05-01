public class HitungJalan implements Perjalanan {
    private double jarak;
    private final double kecepatanRataRata = 800;

    // Constructor
    public HitungJalan (double jarak, double kecepatanRataRata) {
        this.jarak = jarak;
    }

    // Implementasi method untuk menampilkan informasi perjalanan
    @Override
    public void tampilInfoPerjalanan() {
        System.out.println("Informasi Perjalanan:");
        System.out.println("Jarak: " + jarak + " km");
        System.out.println("Kecepatan Rata-rata: " + kecepatanRataRata + " km/jam");
    }

    // Implementasi method untuk menghitung estimasi waktu perjalanan
    @Override
    public double hitungEstimasiWaktu() {
        return jarak / kecepatanRataRata;
    }
}

