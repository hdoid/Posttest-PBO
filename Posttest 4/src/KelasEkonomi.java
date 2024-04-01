public class KelasEkonomi extends Tiket {
    private int nokursi;

    public KelasEkonomi(int nopesanan, String nama, String tanggal, String maskapai, String kotaasal, 
    String kotatujuan, String jam, String kelas, int nokursi) {
        super(nopesanan, nama, tanggal, maskapai, kotaasal, kotatujuan, jam, kelas);
        this.nokursi = nokursi;
    }

    public int getnokursi() {
        return nokursi;
    }
    public void setnokursi(int nokursi) {
        this.nokursi = nokursi;
    }
 
    // Implementasi Method Override
    @Override
    public void tampilDataTiket() {
        System.out.println("═══════════════════════════════════════════");
        System.out.println("Nomor Pesanan   : " + getnopesanan());
        System.out.println("Nama            : " + getnama());
        System.out.println("Tanggal         : " + gettanggal());
        System.out.println("Maskapai        : " + getmaskapai());
        System.out.println("Kota Asal       : " + getkotaasal());
        System.out.println("Kota Tujuan     : " + getkotatujuan());
        System.out.println("Jam             : " + getjam());
        System.out.println("Kelas           : " + getkelas());
        System.out.println("Bagasi          : " + getnokursi());
    }
}
