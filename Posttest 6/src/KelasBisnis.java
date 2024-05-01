
// Penerapan Final Class
public final class KelasBisnis extends Tiket{
    private int bagasi;
    private String makanan;

    
    public KelasBisnis(int nopesanan, String nama, String tanggal, String maskapai, String kotaasal, 
    String kotatujuan, String jam, String kelas, int bagasi, String makanan) {
        super(nopesanan, nama, tanggal, maskapai, kotaasal, kotatujuan, jam, kelas);
        this.bagasi = bagasi;
        this.makanan = makanan;
    }


    public int getbagasi() {
        return bagasi;
    }
    public void setbagasi(int bagasi) {
        this.bagasi = bagasi;
    }

    public String getmakanan() {
        return makanan;
    }
    public void setmakanan(String makanan) {
        this.makanan = makanan;
    }

    // Implementasi Method Override
    @Override
    public void tampilDataTiket() {
        System.out.println("Nomor Pesanan   : " + getnopesanan());
        System.out.println("Nama            : " + getnama());
        System.out.println("Tanggal         : " + gettanggal());
        System.out.println("Maskapai        : " + getmaskapai());
        System.out.println("Kota Asal       : " + getkotaasal());
        System.out.println("Kota Tujuan     : " + getkotatujuan());
        System.out.println("Jam             : " + getjam());
        System.out.println("Kelas           : " + getkelas());
        System.out.println("Bagasi          : " + getbagasi());
        System.out.println("Makanan         : " + getmakanan());
    }

}


