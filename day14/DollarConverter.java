public class DollarConverter {
    public static double walletMoney;
//    public DollarConverter(double walletMoney){
//        this.walletMoney=walletMoney;
//    }


    public double rupeesToDollar(double moneyInRupees) {
        return moneyInRupees/74.85;
    }
    public double dollarToRupees(double moneyInDollar){
        return moneyInDollar*74.85;
    }

    public  void storeInWallet(double moneyInRupees,String preferredCurrency)
    {
        walletMoney += moneyInRupees;
    }
    public double totalAmountInWallet(){
        return walletMoney;
    }
    public  void takeOutMoneyFromWallet(double moneyInRupees){
        walletMoney -= moneyInRupees;
    }

}