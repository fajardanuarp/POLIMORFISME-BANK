public class Main {

    public static void main(String[] args) {
        System.out.println("----- Struk Transfer Uang Bank Umum------");
        Bank myBank = new Bank();
        myBank.sukuBunga();
        myBank.transferUang(50000, "1234567890");
        myBank.transferUang(150000, "0987654321", "Bank BCA");
        myBank.transferUang(20000, "3344556677", "Bank Mandiri", "Bayar Listrik");

        System.out.println("\n------ Struk Transfer Bank BNI & Bank BCA -------");
        BankBNI BNI = new BankBNI();
        BNI.sukuBunga();
        BNI.transferUang(4300000, "3264836482487", "BRI");
        System.out.println("Biaya Transfer Bank Rp : " +BNI.HitungBiaya("BRI"));

        System.out.println("------------------------------------");
        BankBCA BCA = new BankBCA();
        BCA.sukuBunga();
        BCA.transferUang(7300000, "34627834624820", "BSI");
        System.out.println("Biaya Transfer Bank Rp : " +BCA.HitungBiaya("BSI"));
        
    }
}