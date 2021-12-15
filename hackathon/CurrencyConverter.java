public class CurrencyConverter {

    public double rupeesToRupees(double amountInRupees){
        return amountInRupees;
        // 1 Indian Rupee = 1 Indian Rupee
    }
    public double rupeesToDollar(double amountInRupees){
        return round(amountInRupees*0.013);
        // 1 Indian Rupee =0.013 US Dollar
    }
    public double rupeesToEuro(double amountInRupees){
        return round(amountInRupees*0.012);
        //1 Indian Rupee =0.012 Euro
    }
    public double rupeesToJapaneseYen(double amountInRupees){
        return round(amountInRupees*1.49);
        //1 Indian Rupee =1.49 Japanese Yen
    }
    public double rupeesToPolishZloty(double amountInRupees){
        return round(amountInRupees*0.054);
        //1 Indian Rupee =0.054 Polish Zloty
    }

    public double euroToEuro(double amountInEuro) {
        return round(amountInEuro);
    }
    public double euroToRupees(double amountInEuro) {
        return round(amountInEuro*85.70);
        //1 Euro =85.70 Indian Rupee
    }
    public double euroToDollar(double amountInEuro) {
        return round(amountInEuro*1.13);
        //1 Euro =1.13 US Dollar
    }
    public double euroToJapaneseYen(double amountInEuro) {
        return round(amountInEuro*128.09);
        //1 Euro =128.09 Japanese Yen
    }
    public double euroToPolishZloty(double amountInEuro) {
        return round(amountInEuro*4.62);
        //1 Euro =4.62 Polish Zloty
    }

    public double dollarToDollar(double amountInDollar) {
        return round(amountInDollar);
    }
    public double dollarToRupees(double amountInDollar) {
        return round(amountInDollar*76.06);
        //1 US Dollar =76.06 Indian Rupee
    }
    public double dollarToEuro(double amountInDollar) {
        return round(amountInDollar*0.89);
        //1 US Dollar =0.89 Euro
    }
    public double dollarToJapaneseYen(double amountInDollar) {
        return round(amountInDollar*113.73);
        //1 US Dollar =113.73 Japanese Yen
    }
    public double dollarToPolishZloty(double amountInDollar) {
        return round(amountInDollar*4.10);
        //1 US Dollar =4.10 Polish Zloty
    }

    public double japaneseYenToJapaneseYen(double amountInJapaneseYen) {
        return round(amountInJapaneseYen);
    }
    public double japaneseYenToRupees(double amountInJapaneseYen) {
        return round(amountInJapaneseYen*0.67);
        //1 Japanese Yen =0.67 Indian Rupee
    }
    public double japaneseYenToEuro(double amountInJapaneseYen) {
        return round(amountInJapaneseYen*0.0078);
        //1 Japanese Yen =0.0078 Euro
    }
    public double japaneseYenToDollar(double amountInJapaneseYen) {
        return round(amountInJapaneseYen*0.0088);
        //1 Japanese Yen =0.0088 US Dollar
    }
    public double japaneseYenToPolishZloty(double amountInJapaneseYen) {
        return round(amountInJapaneseYen*0.036);
        //1 Japanese Yen =0.036 Polish Zloty
    }


    public double polishZlotyToPolishZloty(double amountInPolishZloty) {
        return round(amountInPolishZloty);
    }
    public double polishZlotyToRupees(double amountInPolishZloty) {
        return round(amountInPolishZloty*18.52);
        //1 Polish Zloty =18.52 Indian Rupee
    }
    public double polishZlotyToEuro(double amountInPolishZloty) {
        return round(amountInPolishZloty*0.22);
        //1 Polish Zloty =0.22 Euro
    }
    public double polishZlotyToDollar(double amountInPolishZloty) {
        return round(amountInPolishZloty*0.24);
        //1 Polish Zloty =0.24 US Dollar
    }
    public double polishZlotyToJapaneseYen(double amountInPolishZloty) {
        return round(amountInPolishZloty*27.68);
        //1 Polish Zloty =27.68 Japanese Yen
    }

    public double round(double value) {
        return (double) Math.round(value * 100) / 100;
    }
}
