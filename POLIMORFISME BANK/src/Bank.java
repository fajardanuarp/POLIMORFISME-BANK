public class Bank {

    public void transferUang(int jumlah, String rekeningTujuan) {
        System.out.print("--- Transfer Sesama Bank ---");
        System.out.print(" Jumlah              : Rp" + jumlah);
        System.out.print("Rekening Tujuan     : " + rekeningTujuan);
        System.out.print("Status              : Berhasil\n");
    }

    public void transferUang(int Jumlah, String rekeningTujuan, String bankTujuan) {
        System.out.print("--- Transfer Antar Bank ---");
        System.out.print("Bank Tujuan         : " + bankTujuan);
        System.out.print("Rekening Tujuan     : " + rekeningTujuan);
        System.out.println("Jumlah              : Rp" + Jumlah);
        System.out.print("Status              : Berhasil\n");
    }

    public void transferUang(int Jumlah, String rekeningTujuan, String bankTujuan, String Berita) {
        System.out.print("--- Transfer Antar Bank ---");
        System.out.print("Bank Tujuan         : " + bankTujuan);
        System.out.print("Rekening Tujuan     : " + rekeningTujuan);
        System.out.println("Jumlah              : Rp" + Jumlah);
        System.out.println("Berita              : " + Berita);
        System.out.print("Status              : Berhasil\n");
    }

    public void sukuBunga() {
        System.out.println("INFO: Suku Bunga standar adalah 3%\n");
    }
}
