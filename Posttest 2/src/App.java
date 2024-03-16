
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class App {

    static ArrayList<Tiket> dataTiket = new ArrayList<>();
    
    static void tampiltiket() {
        int urutan = 1;
        for (Tiket tkt : dataTiket) {
            System.out.println("═══════════════════════════════════════════");
            System.out.println("Data Tiket ke-" + urutan++);
            System.out.println("No Pesanan       : " + tkt.getnopesanan());
            System.out.println("Nama             : " + tkt.getnama());
            System.out.println("Tanggal          : " + tkt.gettanggal());
            System.out.println("Makapai          : " + tkt.getmaskapai());
            System.out.println("Kota Asal        : " + tkt.getkotaasal());
            System.out.println("Kota Tujuan      : " + tkt.getkotatujuan());
            System.out.println("Jam (B/D)        : " + tkt.getjam());
            System.out.println("Kelas            : " + tkt.getkelas());
            System.out.println("Jumlah Penumpang : " + tkt.getjmlhpenumpang());
        }
            System.out.println("═══════════════════════════════════════════");
    }

    public static void main(String[] args) throws Exception {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("════════════════════════════════════════");
        System.out.println("       SELAMAT DATANG DI PROGRAM        ");
        System.out.println("  SISTEM PENDATAAN TIKET PESAWAT UDARA  ");
        System.out.println("════════════════════════════════════════");

        while (true) {

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
            String menu = br.readLine();

            if (menu.equals("1")) {
                System.out.println("");
                System.out.print("Masukkan Nomor Pesanan: ");
                int nopesanan = Integer.parseInt(br.readLine());
                
                boolean noPesananDitemukan = false;
                for (Tiket tkt : dataTiket) {
                    if (tkt.getnopesanan() == nopesanan) {
                        noPesananDitemukan = true;
                        break;
                    }
                }
                
                if (noPesananDitemukan) {
                    System.out.println("");
                    System.out.println("════════════════════");
                    System.out.println("No Pesanan Sudah Ada");
                    System.out.println("════════════════════");
                } 
                else {
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
                    System.out.print("Masukkan Jumlah Penumpang: ");
                    int jmlhpenumpang = Integer.parseInt(br.readLine());

                    Tiket tktBaru = new Tiket(nopesanan, nama, tanggal, maskapai, kotaasal, 
                    kotatujuan, jam, kelas, jmlhpenumpang);
                    dataTiket.add(tktBaru);
                    
                    System.out.println("");
                    System.out.println("═══════════════════════════════");
                    System.out.println("Data Tiket Berhasil Ditambahkan");
                    System.out.println("═══════════════════════════════");
                } 
            }


            else if (menu.equals("2")) {
                System.out.println("");
                tampiltiket();
                }
        


            else if (menu.equals("3")) {
                System.out.println("");
                tampiltiket();

                System.out.print("Masukan No Pesanan yang Ingin Diubah: ");
                int ubah = Integer.parseInt(br.readLine());

                for (Tiket tkt : dataTiket) {
                    if (tkt.getnopesanan() == ubah) {
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
                        System.out.println("║    8 ║ Ubah Data Jumlah Penumpang   ║");
                        System.out.println("║    0 ║ Ubah Data Keseluruhan        ║");
                        System.out.println("╚═════════════════════════════════════╝");
                        System.out.print("Masukan Pilihan (1/2/3/4/5/6/7/8/9/0): ");
                        String menuubah = br.readLine();
    
                        if (menuubah.equals("1")) {
                            System.out.print("Masukkan Nama: ");
                            tkt.setnama(br.readLine()) ;
                            System.out.println("══════════════════════════");
                            System.out.println("Data Tiket Berhasil Diubah");
                            System.out.println("══════════════════════════");                       
                        }
                        else if (menuubah.equals("2")) {
                            System.out.print("Masukkan Tanggal: ");
                            tkt.settanggal(br.readLine()) ;
                            System.out.println("══════════════════════════");
                            System.out.println("Data Tiket Berhasil Diubah");
                            System.out.println("══════════════════════════");
                        }
                        else if (menuubah.equals("3")) {
                            System.out.print("Masukkan Maskapai: ");
                            tkt.setmaskapai(br.readLine()) ;
                            System.out.println("══════════════════════════");
                            System.out.println("Data Tiket Berhasil Diubah");
                            System.out.println("══════════════════════════");
                        }
                        else if (menuubah.equals("4")) {
                            System.out.print("Masukkan Kota Asal: ");
                            tkt.setkotaasal(br.readLine()) ;
                            System.out.println("══════════════════════════");
                            System.out.println("Data Tiket Berhasil Diubah");
                            System.out.println("══════════════════════════");
                        }
                        else if (menuubah.equals("5")) {
                            System.out.print("Masukkan Kota Tujuan: ");
                            tkt.setkotatujuan(br.readLine()) ;
                            System.out.println("══════════════════════════");
                            System.out.println("Data Tiket Berhasil Diubah");
                            System.out.println("══════════════════════════");                     
                        }
                        else if (menuubah.equals("6")) {
                            System.out.print("Masukkan Jam (B/D): ");
                            tkt.setjam(br.readLine()) ;
                            System.out.println("══════════════════════════");
                            System.out.println("Data Tiket Berhasil Diubah");
                            System.out.println("══════════════════════════");
                        }
                        else if (menuubah.equals("7")) {
                            System.out.print("Masukkan Kelas: ");
                            tkt.setkelas(br.readLine()) ;
                            System.out.println("══════════════════════════");
                            System.out.println("Data Tiket Berhasil Diubah");
                            System.out.println("══════════════════════════");
                        }
                        else if (menuubah.equals("8")) {
                            System.out.print("Masukkan Jumlah Penumpang: ");
                            tkt.setjmlhpenumpang(Integer.parseInt(br.readLine())) ;
                            System.out.println("══════════════════════════");
                            System.out.println("Data Tiket Berhasil Diubah");
                            System.out.println("══════════════════════════");
                        }
                        else if (menuubah.equals("0")) {
                            System.out.print("Masukkan Nama: ");
                            tkt.setnama(br.readLine());
                            System.out.print("Masukkan Tanggal: ");
                            tkt.settanggal(br.readLine());
                            System.out.print("Masukkan Maskapai: ");
                            tkt.setmaskapai(br.readLine());
                            System.out.print("Masukkan Kota Asal: ");
                            tkt.setkotaasal(br.readLine());
                            System.out.print("Masukkan Kota Tujuan: ");
                            tkt.setkotatujuan(br.readLine());
                            System.out.print("Masukkan Jam (B/D): ");
                            tkt.setjam(br.readLine());
                            System.out.print("Masukkan Kelas: ");
                            tkt.setkelas(br.readLine());
                            System.out.print("Masukkan Jumlah Penumpang: ");
                            tkt.setjmlhpenumpang(Integer.parseInt(br.readLine())) ;
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


            else if (menu.equals("4")) {
                System.out.println("");
                System.out.println("╔═════════════════════════════════════╗");
                System.out.println("║        MENU HAPUS DATA TIKET        ║");
                System.out.println("╚═════════════════════════════════════╝");
                System.out.println("╔═════════════════════════════════════╗");
                System.out.println("║   1 ║ Hapus berdasarkan Urutan      ║");
                System.out.println("║   2 ║ Hapus berdasarkan No Pesanan  ║");
                System.out.println("╚═════════════════════════════════════╝");
                System.out.print("Masukkan Pilihan (1/2): ");
                String menuhapus = br.readLine();
                
                if(menuhapus.equals("1")) {
                    System.out.println("");
                    tampiltiket();

                    System.out.print("Mau Menghapus Data Tiket ke- Berapa: ");
                    int hapus = Integer.parseInt(br.readLine());

                    for (int i = 0; i < dataTiket.size(); i++) {
                        if (hapus == dataTiket.size()){
                            dataTiket.remove(hapus -1);
                            System.out.println("═══════════════════════════");
                            System.out.println("Data Tiket Berhasil Dihapus");
                            System.out.println("═══════════════════════════");
                        } 
                        else {
                            System.out.println("═════════════════════════");
                            System.out.println("Data Tiket Tidak Tersedia");
                            System.out.println("═════════════════════════");
                        }
                    }
                }

                else if(menuhapus.equals("2")) {
                    System.out.println("");
                    tampiltiket();

                    System.out.print("Masukan No Pesanan yang Ingin Dihapus: ");
                    int hapusnopesanan = Integer.parseInt(br.readLine());
                    for (int i = 0; i < dataTiket.size(); i++) {
                        if (hapusnopesanan == dataTiket.get(i).getnopesanan()) {
                            dataTiket.remove(i);
                            System.out.println("");
                            System.out.println("═══════════════════════════");
                            System.out.println("Data Tiket Berhasil Dihapus");
                            System.out.println("═══════════════════════════");
                        }
                        else {
                            System.out.println("");
                            System.out.println("═════════════════════════");
                            System.out.println("No Pesanan Tidak Tersedia");
                            System.out.println("═════════════════════════");
                        }
                    }
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
                System.out.println("═══════════════════");
                System.out.println("Menu Tidak Tersedia");
                System.out.println("═══════════════════");          
            }
        }
    }
}