
public class Tiket {
    public String nama;
    private String tanggal; 
    private String kotaasal, kotatujuan;
    private String maskapai, jam, kelas;
    private int nopesanan, jmlhpenumpang;
    
    public Tiket(int nopesanan, String nama, String tanggal, String maskapai, String kotaasal, 
    String kotatujuan, String jam, String kelas, int jmlhpenumpang) {
        this.nopesanan = nopesanan;
        this.nama = nama;
        this.tanggal = tanggal;
        this.maskapai = maskapai;
        this.kotaasal = kotaasal;
        this.kotatujuan = kotatujuan;
        this.jam = jam;
        this.kelas = kelas;
        this.jmlhpenumpang = jmlhpenumpang;
    }


    void setnopesanan(int nopesanan) {
        this.nopesanan = nopesanan;
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

    void setjmlhpenumpang(int jmlhpenumpang) {
        this.jmlhpenumpang = jmlhpenumpang;
    }
    int getjmlhpenumpang() {
        return this.jmlhpenumpang;
    }

}