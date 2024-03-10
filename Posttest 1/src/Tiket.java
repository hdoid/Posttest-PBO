
public class Tiket {
    String nama;
    String tanggal; 
    String kotaasal, kotatujuan;
    String maskapai, jam, kelas;
    int nopesanan, jmlhpenumpang;
    
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

    void tampil(){
        System.out.println("No Pesanan   : "+ this.nopesanan);
        System.out.println("Nama         : "+ this.nama);
        System.out.println("Tanggal      : "+ this.tanggal);
        System.out.println("Maskapai     : "+ this.maskapai);
        System.out.println("Kota Asal    : "+ this.kotaasal);
        System.out.println("Kota Tujuan  : "+ this.kotatujuan);
        System.out.println("Jam (B/D)    : "+ this.jam);
        System.out.println("Kelas        : "+ this.kelas);
        System.out.println("Jumlah Tiket : "+ this.jmlhpenumpang);
    }
}
