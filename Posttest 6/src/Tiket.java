
// Penerapan Abstract Class 
public abstract class Tiket {
    public String nama;
    private final int nopesanan; // Penerapan Final pada Varibel
    private String tanggal; 
    private String kotaasal, kotatujuan;
    private String maskapai, jam, kelas;
    
    public Tiket(int nopesanan, String nama, String tanggal, String maskapai, String kotaasal, 
    String kotatujuan, String jam, String kelas) {
        this.nopesanan = nopesanan;
        this.nama = nama;
        this.tanggal = tanggal;
        this.maskapai = maskapai;
        this.kotaasal = kotaasal;
        this.kotatujuan = kotatujuan;
        this.jam = jam;
        this.kelas = kelas;
    }


    int getnopesanan() {
        return this.nopesanan;
    }

    void setnama(String nama) {
        this.nama = nama;
    }
    String getnama() {
        return this.nama;
    }

    void settanggal(String tanggal) {
        this.tanggal = tanggal;
    }
    String gettanggal() {
        return this.tanggal;
    }

    void setmaskapai(String maskapai) {
        this.maskapai = maskapai;
    }
    String getmaskapai() {
        return this.maskapai;
    }

    void setkotaasal(String kotaasal) {
        this.kotaasal = kotaasal;
    }
    String getkotaasal() {
        return this.kotaasal;
    }

    void setkotatujuan(String kotatujuan) {
        this.kotatujuan = kotatujuan;
    }
    String getkotatujuan() {
        return this.kotatujuan;
    }

    void setjam(String jam) {
        this.jam = jam;
    }
    String getjam() {
        return this.jam;
    }

    void setkelas(String kelas) {
        this.kelas = kelas;
    }
    String getkelas() {
        return this.kelas;
    }

    // Penerapan Method untuk Abstract
    public abstract void tampilDataTiket();
}