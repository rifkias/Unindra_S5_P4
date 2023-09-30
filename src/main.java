
import java.util.Scanner;

public class main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // String nama,alamat,telp,email;
        int jsAlat, jsBahan, transport;
        Pemesanan pesan = new Pemesanan();
        Transaksi order = new Transaksi();
        System.out.println(" ----- Car Cleaning.. Anda Pesan Kami Datang ----- ");
        System.out.println(" ================================================= ");
        System.out.println();
        System.out.println("  ----------------------o0o----------------------  ");
        System.out.println("*Masukan Data Pemesan*");

        System.out.print("Masukan Nama      : ");
        // nama = sc.nextLine();
        pesan.setNama(sc.nextLine());

        System.out.print("Masukan Alamat    : ");
        // alamat = sc.nextLine();
        pesan.setAlamat(sc.nextLine());

        System.out.print("Masukan No. Telp  : ");
        // telp = sc.nextLine();
        pesan.setTelpon(sc.nextLine());

        System.out.print("Masukan Email     : ");
        // email = sc.nextLine();
        pesan.setEmail(sc.nextLine());

        System.out.println(pesan.getNama());
        System.out.println();
        order.viewjasa();
        System.out.println();
        System.out.print("Pilih Jasa        : ");
        order.setJasa(sc.nextInt());
        sc.nextLine();
        System.out.println();

        order.viewteam();
        System.out.println();
        System.out.print("Pilih Team        : ");
        order.setTim(sc.nextInt());
        sc.nextLine();

        System.out.println();
        System.out.print("Berikan Keterangan Pemesanan        : ");

        order.setKeterangan(sc.nextLine());

        System.out.println("Masukan Biaya Penyedia Jasa         : Rp."+order.getBiayaJasa());

        System.out.print("Masukan Biaya Jasa Alat               : Rp.");
        jsAlat = sc.nextInt();
        sc.nextLine();

        System.out.print("Masukan Biaya Bahan Jasa              : Rp.");
        jsBahan = sc.nextInt();
        sc.nextLine();

        System.out.print("Masukan Biaya Transport           : Rp.");
        transport = sc.nextInt();
        sc.nextLine();

        System.out.println("  ----------------------o0o----------------------  ");
        System.out.println(" ================================================= ");
        System.out.println("Jasa Yang di Pesan          : "+order.getJasa());
       System.out.println("Nama Penyedia Jasa          : "+order.getTeam());
       System.out.println("Keterangan                  : "+order.getKet() );
       System.out.println();
       System.out.println("Total Biaya yang di Bayar Pemesan : Rp."+(jsAlat+jsBahan+transport+order.getBiayaJasa()));
       System.out.println();
              System.out.println("Terima kasih");

    }
}