public class BankBNI {

    public void sukuBunga(){
        System.out.println("Suku Bunga Bank BNI adalah 4%");
    }

    public void transferUang(int Jumlah, String rekeningTujuan, String bankTujuan) {
        String Bank = bankTujuan.isEmpty() ? "BNI" : bankTujuan;
        System.out.println("[BNI] Nominal Transfer Bank Rp :" +Jumlah+ " No rekening : "+rekeningTujuan+" ke : " +Bank);
    }

    public int HitungBiaya(String bankTujuan) {
        return bankTujuan.equalsIgnoreCase("BNI") ? 0 : 7000;
    }
}