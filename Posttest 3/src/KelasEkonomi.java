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
 
}
