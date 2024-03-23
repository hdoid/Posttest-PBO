public class KelasBisnis extends Tiket{
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

}


