public class BankBCA {

    public void sukuBunga(){
        System.out.println("Suku Bunga Bank BCA adalah 4.5%");
    }

    public void transferUang(int Jumlah, String rekeningTujuan, String bankTujuan) {
        String Bank = bankTujuan.isEmpty() ? "BCA" : bankTujuan;
        System.out.println("[BCA] Nominal Transfer Bank Rp :" +Jumlah+ " No rekening : "+rekeningTujuan+" ke : " +Bank);
    }

    public int HitungBiaya(String bankTujuan) {
        return bankTujuan.equalsIgnoreCase("BCA") ? 0 : 6500;
    }
}