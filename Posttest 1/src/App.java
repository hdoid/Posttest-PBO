
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Tiket> dataTiket = new ArrayList<>();

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

                System.out.println("═══════════════════════════════");
                System.out.println("Data Tiket Berhasil Ditambahkan");
                System.out.println("═══════════════════════════════");
            } 


            else if (menu.equals("2")) {
                System.out.println("");
                    System.out.println("════════════════════");
                for (int i = 0; i < dataTiket.size(); i++) {
                    System.out.println("Data Tiket ke-" + i);
                    dataTiket.get(i).tampil();
                    System.out.println("════════════════════");
                }
            } 


            else if (menu.equals("3")) {
                System.out.println("");
                    System.out.println("════════════════════");
                for (int i = 0; i < dataTiket.size(); i++) {
                    System.out.println("Data Tiket ke-" + i);
                    dataTiket.get(i).tampil();
                    System.out.println("════════════════════");
                }
                System.out.print("Mau Mengubah Data Tiket ke- Berapa: ");
                int ubah = Integer.parseInt(br.readLine());

                if (ubah <= dataTiket.size()) {
                    System.out.println("");
                    System.out.println("╔═════════════════════════════════════╗");
                    System.out.println("║       MENU MENGUBAH DATA TIKET      ║");
                    System.out.println("╚═════════════════════════════════════╝");
                    System.out.println("╔═════════════════════════════════════╗");
                    System.out.println("║    1 ║ Ubah Data No Pesanan         ║");
                    System.out.println("║    2 ║ Ubah Data Nama               ║");
                    System.out.println("║    3 ║ Ubah Data Tanggal            ║");
                    System.out.println("║    4 ║ Ubah Data Maskapai           ║");
                    System.out.println("║    5 ║ Ubah Data Kota Asal          ║");
                    System.out.println("║    6 ║ Ubah Data Kota Tujuan        ║");
                    System.out.println("║    7 ║ Ubah Data Jam                ║");
                    System.out.println("║    8 ║ Ubah Data Kelas              ║");
                    System.out.println("║    9 ║ Ubah Data Jumlah Penumpang   ║");
                    System.out.println("║    0 ║ Ubah Data Keseluruhan        ║");
                    System.out.println("╚═════════════════════════════════════╝");
                    System.out.print("Masukan Pilihan (1/2/3/4/5/6/7/8/9/0): ");
                    String menuubah = br.readLine();

                    if (menuubah.equals("1")) {
                        System.out.print("Masukkan No Pesanan: ");
                        dataTiket.get(ubah).nopesanan = Integer.parseInt(br.readLine());
                        System.out.println("══════════════════════════");
                        System.out.println("Data Tiket Berhasil Diubah");
                        System.out.println("══════════════════════════");
                    }
                    else if (menuubah.equals("2")) {
                        System.out.print("Masukkan Nama: ");
                        dataTiket.get(ubah).nama = br.readLine();
                        System.out.println("══════════════════════════");
                        System.out.println("Data Tiket Berhasil Diubah");
                        System.out.println("══════════════════════════");                       
                    }
                    else if (menuubah.equals("3")) {
                        System.out.print("Masukkan Tanggal: ");
                        dataTiket.get(ubah).tanggal = br.readLine();
                        System.out.println("══════════════════════════");
                        System.out.println("Data Tiket Berhasil Diubah");
                        System.out.println("══════════════════════════");
                    }
                    else if (menuubah.equals("4")) {
                        System.out.print("Masukkan Maskapai: ");
                        dataTiket.get(ubah).maskapai = br.readLine();
                        System.out.println("══════════════════════════");
                        System.out.println("Data Tiket Berhasil Diubah");
                        System.out.println("══════════════════════════");
                    }
                    else if (menuubah.equals("5")) {
                        System.out.print("Masukkan Kota Asal: ");
                        dataTiket.get(ubah).kotaasal = br.readLine();
                        System.out.println("══════════════════════════");
                        System.out.println("Data Tiket Berhasil Diubah");
                        System.out.println("══════════════════════════");
                    }
                    else if (menuubah.equals("6")) {
                        System.out.print("Masukkan Kota Tujuan: ");
                        dataTiket.get(ubah).kotatujuan = br.readLine();  
                        System.out.println("══════════════════════════");
                        System.out.println("Data Tiket Berhasil Diubah");
                        System.out.println("══════════════════════════");                     
                    }
                    else if (menuubah.equals("7")) {
                        System.out.print("Masukkan Jam (B/D): ");
                        dataTiket.get(ubah).jam = br.readLine();
                        System.out.println("══════════════════════════");
                        System.out.println("Data Tiket Berhasil Diubah");
                        System.out.println("══════════════════════════");
                    }
                    else if (menuubah.equals("8")) {
                        System.out.print("Masukkan Kelas: ");
                        dataTiket.get(ubah).kelas = br.readLine();
                        System.out.println("══════════════════════════");
                        System.out.println("Data Tiket Berhasil Diubah");
                        System.out.println("══════════════════════════");
                    }
                    else if (menuubah.equals("9")) {
                        System.out.print("Masukkan Jumlah Penumpang: ");
                        dataTiket.get(ubah).jmlhpenumpang = Integer.parseInt(br.readLine());
                        System.out.println("══════════════════════════");
                        System.out.println("Data Tiket Berhasil Diubah");
                        System.out.println("══════════════════════════");
                    }
                    else if (menuubah.equals("0")) {
                        System.out.print("Masukkan Nama: ");
                        dataTiket.get(ubah).nama = br.readLine();
                        System.out.print("Masukkan Tanggal: ");
                        dataTiket.get(ubah).tanggal = br.readLine();
                        System.out.print("Masukkan Maskapai: ");
                        dataTiket.get(ubah).maskapai = br.readLine();
                        System.out.print("Masukkan Kota Asal: ");
                        dataTiket.get(ubah).kotaasal = br.readLine();
                        System.out.print("Masukkan Kota Tujuan: ");
                        dataTiket.get(ubah).kotatujuan = br.readLine();
                        System.out.print("Masukkan Jam (B/D): ");
                        dataTiket.get(ubah).jam = br.readLine();
                        System.out.print("Masukkan Kelas: ");
                        dataTiket.get(ubah).kelas = br.readLine();
                        System.out.print("Masukkan Jumlah Penumpang: ");
                        dataTiket.get(ubah).jmlhpenumpang = Integer.parseInt(br.readLine());
                        System.out.println("══════════════════════════");
                        System.out.println("Data Tiket Berhasil Diubah");
                        System.out.println("══════════════════════════");
                    }
                    else {
                        System.out.println("═══════════════════");
                        System.out.println("Menu Tidak Tersedia");
                        System.out.println("═══════════════════");
                    }
                }
                
                else {
                    System.out.println("════════════════════");
                    System.out.println("Data Tiket Tidak Ada");
                    System.out.println("════════════════════");
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
                        System.out.println("════════════════════");
                    for (int i = 0 ; i < dataTiket.size() ; i++){
                        System.out.println("Data Tiket ke-"+ i);
                        dataTiket.get(i).tampil();
                        System.out.println("════════════════════");
                    }
                    System.out.print("Mau Menghapus Data Tiket ke- Berapa: ");
                    int hapus = Integer.parseInt(br.readLine());

                    if (hapus <= dataTiket.size()){
                        dataTiket.remove(hapus);
                        System.out.println("═══════════════════════════");
                        System.out.println("Data Tiket Berhasil Dihapus");
                        System.out.println("═══════════════════════════");
                    } else {
                        System.out.println("═════════════════════════");
                        System.out.println("Data Tiket Tidak Tersedia");
                        System.out.println("═════════════════════════");
                    }
                }

                else if(menuhapus.equals("2")) {
                    System.out.println("");
                        System.out.println("════════════════════");
                    for (int i = 0; i < dataTiket.size(); i++) {
                        System.out.println("Data Tiket ke-" + i);
                        dataTiket.get(i).tampil();
                        System.out.println("════════════════════");
                    }
                    System.out.print("Mau Hapus Data dengan Nomor Pesanan: ");
                    int hapusnopesanan = Integer.parseInt(br.readLine());
                    for (int i = 0; i < dataTiket.size(); i++) {
                        if (hapusnopesanan == dataTiket.get(i).nopesanan) {
                            dataTiket.remove(i);
                            System.out.println("═══════════════════════════");
                            System.out.println("Data Tiket Berhasil Dihapus");
                            System.out.println("═══════════════════════════");
                        }
                        else {
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
