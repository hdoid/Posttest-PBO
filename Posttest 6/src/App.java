
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class App {

    static ArrayList<Tiket> dataTiket = new ArrayList<>();
    static ArrayList<KelasBisnis> dataKelasBisnis = new ArrayList<>();
    static ArrayList<KelasEkonomi> dataKelasEkonomi = new ArrayList<>();
    
    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(isr);

    // Penerapan Final Method
    static public final void tampilanMenuUtama() {
        System.out.println("");
        System.out.println("╔════════════════════════════════╗");
        System.out.println("║           MENU UTAMA           ║");
        System.out.println("╚════════════════════════════════╝");
        System.out.println("╔════════════════════════════════╗");
        System.out.println("║    1 ║ Menambah Data Tiket     ║");
        System.out.println("║    2 ║ Melihat Data Tiket      ║");
        System.out.println("║    3 ║ Mengubah Data Tiket     ║");
        System.out.println("║    4 ║ Menghapus Data Tiket    ║");
        System.out.println("║    0 ║ Keluar Program          ║");
        System.out.println("╚════════════════════════════════╝");
        System.out.print("Silahkan Masukan Pilihan (1/2/3/4/0): ");
    }

    // Penerapan Static pada Method
    static void tampiltiket() throws Exception {
        System.out.println("╔══════════════════════════╗");
        System.out.println("║        MENU LIHAT        ║");
        System.out.println("╔══════════════════════════╗");
        System.out.println("║  1. Data Tiket Bisnis    ║");
        System.out.println("║  2. Data Tiket Ekonomi   ║");
        System.out.println("║  3. Jumlah Tiket Bisnis  ║");
        System.out.println("║  4. Jumlah Tiket Ekonomi ║");
        System.out.println("╚══════════════════════════╝");
        System.out.print("Silahkan Masukkan Pilihan (1/2/3/4): ");
        String pilihlihat = br.readLine();
        
        if (pilihlihat.equals("1")) {
            System.out.println("");
            System.out.println("══════════════════");
            System.out.println("Data Kelas Bisnis");
            System.out.println("══════════════════");
            if (dataKelasBisnis.size() < 1) {
                System.out.println("════════════════════════");
                System.out.println("Mohon Maaf, Data Kosong");
                System.out.println("════════════════════════");
            }
            else {
                int urutan = 1;
                for (int i = 0; i < dataKelasBisnis.size(); i++) {
                    System.out.println("═══════════════════════════════════════════");
                    System.out.println("Data Tiket ke- " + urutan++);
                    dataKelasBisnis.get(i).tampilDataTiket();
                }
                    System.out.println("═══════════════════════════════════════════");
            }
        }
        else if (pilihlihat.equals("2")) {
            System.out.println("");
            System.out.println("══════════════════");
            System.out.println("Data Kelas Ekonomi");
            System.out.println("══════════════════");
            if (dataKelasEkonomi.size() < 1) {
                System.out.println("════════════════════════");
                System.out.println("Mohon Maaf, Data Kosong");
                System.out.println("════════════════════════");
            }
            else {
                int urutan = 1;
                for (int i = 0; i < dataKelasEkonomi.size(); i++){
                    System.out.println("═══════════════════════════════════════════");
                    System.out.println("Data Tiket ke- " + urutan++);
                    dataKelasEkonomi.get(i).tampilDataTiket();
                }
                    System.out.println("═══════════════════════════════════════════");
            }
        }
        else if (pilihlihat.equals("3")){
            int countBisnis = HitungTiketBisnis(dataKelasBisnis, "Bisnis");
            System.out.println("");
            System.out.println("═══════════════════════════════════════");
            System.out.println("Jumlah Tiket Kelas Bisnis: " + countBisnis);
            System.out.println("═══════════════════════════════════════");
        }
        else if (pilihlihat.equals("4")){
            int countEkomomi = HitungTiketEkonomi(dataKelasEkonomi, "Bisnis");
            System.out.println("");
            System.out.println("═════════════════════════════════════════");
            System.out.println("Jumlah Tiket Kelas Ekomomi: " + countEkomomi);
            System.out.println("═════════════════════════════════════════");
        }
        else {
            System.out.println("═══════════════════");
            System.out.println("Menu Tidak Tersedia");
            System.out.println("═══════════════════");
        }
    }


    public static void main(String[] args) throws Exception {

        System.out.println("════════════════════════════════════════");
        System.out.println("       SELAMAT DATANG DI PROGRAM        ");
        System.out.println("  SISTEM PENDATAAN TIKET PESAWAT UDARA  ");
        System.out.println("════════════════════════════════════════");

        while (true) {
            tampilanMenuUtama();
            String menu = br.readLine();

    
            if (menu.equals("1")) {
                System.out.println("");
                System.out.println("╔════════════════════╗");
                System.out.println("║    MENU TAMBAH     ║");
                System.out.println("╔════════════════════╗");
                System.out.println("║  1. Tiket Bisnis   ║");
                System.out.println("║  2. Tiket Ekonomi  ║");
                System.out.println("╚════════════════════╝");
                System.out.print("Silahkan Masukkan Pilihan (1/2): ");
                String pilihtambah = br.readLine();
                
                // Implementasi Error Handling
                try {
                    if (pilihtambah.equals("1")) {
                        System.out.println("");
                        System.out.print("Masukkan Nomor Pesanan: ");
                        int nopesanan = Integer.parseInt(br.readLine());
                        System.out.print("Masukkan Nama: ");
                        String nama = br.readLine();
                        System.out.print("Masukkan Tanggal: ");
                        String tanggal = br.readLine();
                        System.out.print("Masukkan Maskapai: ");
                        String maskapai = br.readLine();
                        System.out.print("Masukkan Kota Asal: ");
                        String kotaasal = br.readLine();
                        System.out.print("Masukkan Kota Tujuan: ");
                        String kotatujuan = br.readLine();
                        System.out.print("Masukkan Jam (B/D): ");
                        String jam = br.readLine();
                        System.out.print("Masukkan Kelas: ");
                        String kelas = br.readLine();
                        System.out.print("Masukkan Berat Bagasi: ");
                        int bagasi = Integer.parseInt(br.readLine());
                        System.out.print("Masukkan Makanan: ");
                        String makanan = br.readLine();

                        KelasBisnis bisnisbaru = new KelasBisnis(nopesanan, nama, tanggal, maskapai, 
                        kotaasal, kotatujuan, jam, kelas, bagasi, makanan);
                        dataKelasBisnis.add(bisnisbaru);
                        
                        System.out.println("");
                        System.out.println("══════════════════════════════════════");
                        System.out.println("Data Tiket Bisnis Berhasil Ditambahkan");
                        System.out.println("══════════════════════════════════════");
                        } 
                    

                    else if (pilihtambah.equals("2")){
                        System.out.println("");
                        System.out.print("Masukkan Nomor Pesanan: ");
                        int nopesanan = Integer.parseInt(br.readLine());
                        System.out.print("Masukkan Nama: ");
                        String nama = br.readLine();
                        System.out.print("Masukkan Tanggal: ");
                        String tanggal = br.readLine();
                        System.out.print("Masukkan Maskapai: ");
                        String maskapai = br.readLine();
                        System.out.print("Masukkan Kota Asal: ");
                        String kotaasal = br.readLine();
                        System.out.print("Masukkan Kota Tujuan: ");
                        String kotatujuan = br.readLine();
                        System.out.print("Masukkan Jam (B/D): ");
                        String jam = br.readLine();
                        System.out.print("Masukkan Kelas: ");
                        String kelas = br.readLine();
                        System.out.print("Masukkan No Kursi: ");
                        int nokursi  = Integer.parseInt(br.readLine());

                        KelasEkonomi ekonomibaru = new KelasEkonomi(nopesanan, nama, tanggal, maskapai, 
                        kotaasal, kotatujuan, jam, kelas, nokursi);
                        dataKelasEkonomi.add(ekonomibaru);
                        
                        System.out.println("");
                        System.out.println("═══════════════════════════════════════");
                        System.out.println("Data Tiket Ekonomi Berhasil Ditambahkan");
                        System.out.println("═══════════════════════════════════════");  
                    }
                    else {
                        System.out.println("═══════════════════");
                        System.out.println("Menu Tidak Tersedia");
                        System.out.println("═══════════════════");
                    }
                } catch (IOException e) {
                    System.out.println("═════════════════════════════════════");
                    System.out.println("Terjadi kesalahan saat membaca input.");
                    System.out.println("═════════════════════════════════════");
                    e.printStackTrace();
                } catch (NumberFormatException e) {
                    System.out.println("═════════════════════════════════════════════════════");
                    System.out.println("Masukan tidak valid. Harap masukkan nomor yang benar.");
                    System.out.println("═════════════════════════════════════════════════════");
                    e.printStackTrace();
                }
            } 
            

            else if (menu.equals("2")) {
                System.out.println("");
                tampiltiket();
                }
        

            else if (menu.equals("3")) {
                System.out.println("");
                System.out.println("");
                System.out.println("╔════════════════════╗");
                System.out.println("║      MENU UBAH     ║");
                System.out.println("╔════════════════════╗");
                System.out.println("║  1. Tiket Bisnis   ║");
                System.out.println("║  2. Tiket Ekonomi  ║");
                System.out.println("╚════════════════════╝");
                System.out.print("Silahkan Masukkan Pilihan (1/2): ");
                String pilihubah = br.readLine();
                
                // Implementasi Error Handling
                try {
                    if (pilihubah.equals("1")) {
                        System.out.println("");
                        System.out.println("══════════════════");
                        System.out.println("Data Kelas Bisnis");
                        System.out.println("══════════════════");
                        if (dataKelasBisnis.size() < 1) {
                            System.out.println("════════════════════════");
                            System.out.println("Mohon Maaf, Data Kosong");
                            System.out.println("════════════════════════");
                        }
                        else {
                            int urutan = 1;
                            for (int i = 0; i < dataKelasBisnis.size(); i++) {
                                System.out.println("═══════════════════════════════════════════");
                                System.out.println("Data Tiket ke- " + urutan++);
                                dataKelasBisnis.get(i).tampilDataTiket();
                            }
                                System.out.println("═══════════════════════════════════════════");
                        }

                        System.out.print("Masukan No Pesanan yang Ingin Diubah: ");
                        int ubah = Integer.parseInt(br.readLine());

                        for (int i = 0; i < dataKelasBisnis.size(); i++) {
                            if (dataKelasBisnis.get(i).getnopesanan() == ubah) {
                                System.out.println("");
                                System.out.println("╔═════════════════════════════════════╗");
                                System.out.println("║       MENU MENGUBAH DATA TIKET      ║");
                                System.out.println("╚═════════════════════════════════════╝");
                                System.out.println("╔═════════════════════════════════════╗");
                                System.out.println("║    1 ║ Ubah Data Nama               ║");
                                System.out.println("║    2 ║ Ubah Data Tanggal            ║");
                                System.out.println("║    3 ║ Ubah Data Maskapai           ║");
                                System.out.println("║    4 ║ Ubah Data Kota Asal          ║");
                                System.out.println("║    5 ║ Ubah Data Kota Tujuan        ║");
                                System.out.println("║    6 ║ Ubah Data Jam                ║");
                                System.out.println("║    7 ║ Ubah Data Kelas              ║");
                                System.out.println("║    8 ║ Ubah Data Bagasi             ║");
                                System.out.println("║    9 ║ Ubah Data Makanan            ║");
                                System.out.println("║    0 ║ Ubah Data Keseluruhan        ║");
                                System.out.println("╚═════════════════════════════════════╝");
                                System.out.print("Masukan Pilihan (1/2/3/4/5/6/7/8/9/0): ");
                                String menuubah = br.readLine();
            
                                if (menuubah.equals("1")) {
                                    System.out.print("Masukkan Nama: ");
                                    dataKelasBisnis.get(i).setnama(br.readLine()) ;
                                    System.out.println("══════════════════════════");
                                    System.out.println("Data Tiket Berhasil Diubah");
                                    System.out.println("══════════════════════════");                       
                                }
                                else if (menuubah.equals("2")) {
                                    System.out.print("Masukkan Tanggal: ");
                                    dataKelasBisnis.get(i).settanggal(br.readLine()) ;
                                    System.out.println("══════════════════════════");
                                    System.out.println("Data Tiket Berhasil Diubah");
                                    System.out.println("══════════════════════════");
                                }
                                else if (menuubah.equals("3")) {
                                    System.out.print("Masukkan Maskapai: ");
                                    dataKelasBisnis.get(i).setmaskapai(br.readLine());
                                    System.out.println("══════════════════════════");
                                    System.out.println("Data Tiket Berhasil Diubah");
                                    System.out.println("══════════════════════════");
                                }
                                else if (menuubah.equals("4")) {
                                    System.out.print("Masukkan Kota Asal: ");
                                    dataKelasBisnis.get(i).setkotaasal(br.readLine());
                                    System.out.println("══════════════════════════");
                                    System.out.println("Data Tiket Berhasil Diubah");
                                    System.out.println("══════════════════════════");
                                }
                                else if (menuubah.equals("5")) {
                                    System.out.print("Masukkan Kota Tujuan: ");
                                    dataKelasBisnis.get(i).setkotatujuan(br.readLine());
                                    System.out.println("══════════════════════════");
                                    System.out.println("Data Tiket Berhasil Diubah");
                                    System.out.println("══════════════════════════");                     
                                }
                                else if (menuubah.equals("6")) {
                                    System.out.print("Masukkan Jam (B/D): ");
                                    dataKelasBisnis.get(i).setjam(br.readLine()) ;
                                    System.out.println("══════════════════════════");
                                    System.out.println("Data Tiket Berhasil Diubah");
                                    System.out.println("══════════════════════════");
                                }
                                else if (menuubah.equals("7")) {
                                    System.out.print("Masukkan Kelas: ");
                                    dataKelasBisnis.get(i).setkelas(br.readLine()) ;
                                    System.out.println("══════════════════════════");
                                    System.out.println("Data Tiket Berhasil Diubah");
                                    System.out.println("══════════════════════════");
                                }
                                else if (menuubah.equals("8")) {
                                    System.out.print("Masukkan Bagasi: ");
                                    dataKelasBisnis.get(i).setbagasi(Integer.parseInt(br.readLine())) ;
                                    System.out.println("══════════════════════════");
                                    System.out.println("Data Tiket Berhasil Diubah");
                                    System.out.println("══════════════════════════");
                                }
                                else if (menuubah.equals("9")) {
                                    System.out.print("Masukkan Makanan: ");
                                    dataKelasBisnis.get(i).setmakanan(br.readLine()) ;
                                    System.out.println("══════════════════════════");
                                    System.out.println("Data Tiket Berhasil Diubah");
                                    System.out.println("══════════════════════════");
                                }
                                else if (menuubah.equals("0")) {
                                    System.out.print("Masukkan Nama: ");
                                    dataKelasBisnis.get(i).setnama(br.readLine());
                                    System.out.print("Masukkan Tanggal: ");
                                    dataKelasBisnis.get(i).settanggal(br.readLine());
                                    System.out.print("Masukkan Maskapai: ");
                                    dataKelasBisnis.get(i).setmaskapai(br.readLine());
                                    System.out.print("Masukkan Kota Asal: ");
                                    dataKelasBisnis.get(i).setkotaasal(br.readLine());
                                    System.out.print("Masukkan Kota Tujuan: ");
                                    dataKelasBisnis.get(i).setkotatujuan(br.readLine());
                                    System.out.print("Masukkan Jam (B/D): ");
                                    dataKelasBisnis.get(i).setjam(br.readLine());
                                    System.out.print("Masukkan Kelas: ");
                                    dataKelasBisnis.get(i).setkelas(br.readLine());
                                    System.out.print("Masukkan Bagasi: ");
                                    dataKelasBisnis.get(i).setbagasi(Integer.parseInt(br.readLine())) ;
                                    System.out.print("Masukkan Makanan: ");
                                    dataKelasBisnis.get(i).setmakanan(br.readLine()) ;
                                    System.out.println("══════════════════════════");
                                    System.out.println("Data Tiket Berhasil Diubah");
                                    System.out.println("══════════════════════════");
                                }
                                else {
                                    System.out.println("═══════════════════");
                                    System.out.println("Menu Tidak Tersedia");
                                    System.out.println("═══════════════════");
                                }
                                break;
                            }
                            else {
                                System.out.println("════════════════════");
                                System.out.println("No Pesanan Tidak Ada");
                                System.out.println("════════════════════");
                            }
                        } 
                    }

                    else if (pilihubah.equals("2")) {
                        System.out.println("");
                        System.out.println("══════════════════");
                        System.out.println("Data Kelas Ekonomi");
                        System.out.println("══════════════════");
                        if (dataKelasEkonomi.size() < 1) {
                            System.out.println("════════════════════════");
                            System.out.println("Mohon Maaf, Data Kosong");
                            System.out.println("════════════════════════");
                        }
                        else {
                            int urutan = 1;
                            for (int i = 0; i < dataKelasEkonomi.size(); i++) {
                                System.out.println("═══════════════════════════════════════════");
                                System.out.println("Data Tiket ke- " + urutan++);
                                dataKelasEkonomi.get(i).tampilDataTiket();
                            }
                                System.out.println("═══════════════════════════════════════════");
                        }

                        System.out.print("Masukan No Pesanan yang Ingin Diubah: ");
                        int ubah = Integer.parseInt(br.readLine());

                        for (int i = 0; i < dataKelasEkonomi.size(); i++) {
                            if (dataKelasEkonomi.get(i).getnopesanan() == ubah) {
                                System.out.println("");
                                System.out.println("╔═════════════════════════════════════╗");
                                System.out.println("║       MENU MENGUBAH DATA TIKET      ║");
                                System.out.println("╚═════════════════════════════════════╝");
                                System.out.println("╔═════════════════════════════════════╗");
                                System.out.println("║    1 ║ Ubah Data Nama               ║");
                                System.out.println("║    2 ║ Ubah Data Tanggal            ║");
                                System.out.println("║    3 ║ Ubah Data Maskapai           ║");
                                System.out.println("║    4 ║ Ubah Data Kota Asal          ║");
                                System.out.println("║    5 ║ Ubah Data Kota Tujuan        ║");
                                System.out.println("║    6 ║ Ubah Data Jam                ║");
                                System.out.println("║    7 ║ Ubah Data Kelas              ║");
                                System.out.println("║    8 ║ Ubah Data No Kursi           ║");
                                System.out.println("║    0 ║ Ubah Data Keseluruhan        ║");
                                System.out.println("╚═════════════════════════════════════╝");
                                System.out.print("Masukan Pilihan (1/2/3/4/5/6/7/8/0): ");
                                String menuubah = br.readLine();
            
                                if (menuubah.equals("1")) {
                                    System.out.print("Masukkan Nama: ");
                                    dataKelasEkonomi.get(i).setnama(br.readLine()) ;
                                    System.out.println("══════════════════════════");
                                    System.out.println("Data Tiket Berhasil Diubah");
                                    System.out.println("══════════════════════════");                       
                                }
                                else if (menuubah.equals("2")) {
                                    System.out.print("Masukkan Tanggal: ");
                                    dataKelasEkonomi.get(i).settanggal(br.readLine()) ;
                                    System.out.println("══════════════════════════");
                                    System.out.println("Data Tiket Berhasil Diubah");
                                    System.out.println("══════════════════════════");
                                }
                                else if (menuubah.equals("3")) {
                                    System.out.print("Masukkan Maskapai: ");
                                    dataKelasEkonomi.get(i).setmaskapai(br.readLine());
                                    System.out.println("══════════════════════════");
                                    System.out.println("Data Tiket Berhasil Diubah");
                                    System.out.println("══════════════════════════");
                                }
                                else if (menuubah.equals("4")) {
                                    System.out.print("Masukkan Kota Asal: ");
                                    dataKelasEkonomi.get(i).setkotaasal(br.readLine());
                                    System.out.println("══════════════════════════");
                                    System.out.println("Data Tiket Berhasil Diubah");
                                    System.out.println("══════════════════════════");
                                }
                                else if (menuubah.equals("5")) {
                                    System.out.print("Masukkan Kota Tujuan: ");
                                    dataKelasEkonomi.get(i).setkotatujuan(br.readLine());
                                    System.out.println("══════════════════════════");
                                    System.out.println("Data Tiket Berhasil Diubah");
                                    System.out.println("══════════════════════════");                     
                                }
                                else if (menuubah.equals("6")) {
                                    System.out.print("Masukkan Jam (B/D): ");
                                    dataKelasEkonomi.get(i).setjam(br.readLine()) ;
                                    System.out.println("══════════════════════════");
                                    System.out.println("Data Tiket Berhasil Diubah");
                                    System.out.println("══════════════════════════");
                                }
                                else if (menuubah.equals("7")) {
                                    System.out.print("Masukkan Kelas: ");
                                    dataKelasEkonomi.get(i).setkelas(br.readLine()) ;
                                    System.out.println("══════════════════════════");
                                    System.out.println("Data Tiket Berhasil Diubah");
                                    System.out.println("══════════════════════════");
                                }
                                else if (menuubah.equals("8")) {
                                    System.out.print("Masukkan No Kursi: ");
                                    dataKelasEkonomi.get(i).setnokursi(Integer.parseInt(br.readLine()));
                                    System.out.println("══════════════════════════");
                                    System.out.println("Data Tiket Berhasil Diubah");
                                    System.out.println("══════════════════════════");
                                }
                                else if (menuubah.equals("0")) {
                                    System.out.print("Masukkan Nama: ");
                                    dataKelasEkonomi.get(i).setnama(br.readLine());
                                    System.out.print("Masukkan Tanggal: ");
                                    dataKelasEkonomi.get(i).settanggal(br.readLine());
                                    System.out.print("Masukkan Maskapai: ");
                                    dataKelasEkonomi.get(i).setmaskapai(br.readLine());
                                    System.out.print("Masukkan Kota Asal: ");
                                    dataKelasEkonomi.get(i).setkotaasal(br.readLine());
                                    System.out.print("Masukkan Kota Tujuan: ");
                                    dataKelasEkonomi.get(i).setkotatujuan(br.readLine());
                                    System.out.print("Masukkan Jam (B/D): ");
                                    dataKelasEkonomi.get(i).setjam(br.readLine());
                                    System.out.print("Masukkan Kelas: ");
                                    dataKelasEkonomi.get(i).setkelas(br.readLine());
                                    System.out.print("Masukkan No Kursi: ");
                                    dataKelasEkonomi.get(i).setnokursi(Integer.parseInt(br.readLine()));
                                    System.out.println("══════════════════════════");
                                    System.out.println("Data Tiket Berhasil Diubah");
                                    System.out.println("══════════════════════════");
                                }
                                else {
                                    System.out.println("═══════════════════");
                                    System.out.println("Menu Tidak Tersedia");
                                    System.out.println("═══════════════════");
                                }
                                break;
                            }
                            
                            else {
                                System.out.println("════════════════════");
                                System.out.println("No Pesanan Tidak Ada");
                                System.out.println("════════════════════");
                            }
                        } 
                    }
                } catch (IOException e) {
                    System.out.println("═════════════════════════════════════");
                    System.out.println("Terjadi kesalahan saat membaca input.");
                    System.out.println("═════════════════════════════════════");
                    e.printStackTrace();
                } catch (NumberFormatException e) {
                    System.out.println("═════════════════════════════════════════════════════");
                    System.out.println("Masukan tidak valid. Harap masukkan nomor yang benar.");
                    System.out.println("═════════════════════════════════════════════════════");
                    e.printStackTrace();
                }
            }


            else if (menu.equals("4")) {
                System.out.println("");
                System.out.println("╔════════════════════╗");
                System.out.println("║     MENU HAPUS     ║");
                System.out.println("╔════════════════════╗");
                System.out.println("║  1. Tiket Bisnis   ║");
                System.out.println("║  2. Tiket Ekonomi  ║");
                System.out.println("╚════════════════════╝");
                System.out.print("Silahkan Masukkan Pilihan (1/2): ");
                String pilihhapus = br.readLine();
                
                if (pilihhapus.equals("1")) {
                    System.out.println("");
                    System.out.println("══════════════════");
                    System.out.println("Data Kelas Bisnis");
                    System.out.println("══════════════════");
                    if (dataKelasBisnis.size() < 1) {
                        System.out.println("════════════════════════");
                        System.out.println("Mohon Maaf, Data Kosong");
                        System.out.println("════════════════════════");
                    }
                    else {
                        int urutan = 1;
                        for (int i = 0; i < dataKelasBisnis.size(); i++) {
                            System.out.println("═══════════════════════════════════════════");
                            System.out.println("Data Tiket ke- " + urutan++);
                            dataKelasBisnis.get(i).tampilDataTiket();
                        }
                            System.out.println("═══════════════════════════════════════════");
                    }
                    System.out.print("Pilih Nomor Data Yang Ingin Dihapus: ");
                    int hapusbisnis = Integer.parseInt(br.readLine());
                    dataKelasBisnis.remove(hapusbisnis -1);

                    System.out.println("");
                    System.out.println("═══════════════════════════════════");
                    System.out.println("Data Tiket Bisnis Berhasil Dihapus");
                    System.out.println("═══════════════════════════════════");
                }
                else if (pilihhapus.equals("2")) {
                    System.out.println("");
                    System.out.println("══════════════════");
                    System.out.println("Data Kelas Ekonomi");
                    System.out.println("══════════════════");
                    if (dataKelasEkonomi.size() < 1) {
                        System.out.println("════════════════════════");
                        System.out.println("Mohon Maaf, Data Kosong");
                        System.out.println("════════════════════════");
                    }
                    else {
                        int urutan = 1;
                        for (int i = 0; i < dataKelasEkonomi.size(); i++){
                            System.out.println("═══════════════════════════════════════════");
                            System.out.println("Data Tiket ke- " + urutan++);
                            dataKelasEkonomi.get(i).tampilDataTiket();
                        }
                            System.out.println("═══════════════════════════════════════════");
                    }
                    System.out.print("Pilih Nomor Data Yang Ingin Dihapus: ");
                    int hapusekonomi = Integer.parseInt(br.readLine());
                    dataKelasBisnis.remove(hapusekonomi -1);
                }
                else {
                    System.out.println("═══════════════════");
                    System.out.println("Menu Tidak Tersedia");
                    System.out.println("═══════════════════");
                }
            }

            else if (menu.equals("0")) {
                System.out.println("");
                System.out.println("Terima Kasih telah Menggunakan Program");
                System.out.println("by Dio Dharmaesa - 2209106053");
                break;   
            } 

            else {
                System.out.println("");
                System.out.println("═══════════════════");
                System.out.println("Menu Tidak Tersedia");
                System.out.println("═══════════════════");          
            }
        }
    }

    // Implementasi Method Overloading
    public static int HitungTiketBisnis(ArrayList<KelasBisnis> dataKelasBisnis, String kelas) {
        int count = 0;
        for (int i = 0; i < dataKelasBisnis.size(); i++) {
            if (kelas.equals("Bisnis")) {
                count++;
            }
        }
        return count;
    }

    // Implementasi Method Overloading
    public static int HitungTiketEkonomi(ArrayList<KelasEkonomi> dataKelasEkonomi, String kelas) {
        int count = 0;
        for (int i = 0; i < dataKelasEkonomi.size(); i++) {
            if (kelas.equals("Ekonomi")) {
                count++;
            }
        }
        return count;
    }
}