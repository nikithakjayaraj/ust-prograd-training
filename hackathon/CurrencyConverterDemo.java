
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

class InvalidCurrencyException extends Exception{
    public InvalidCurrencyException(String message){
        super(message);
    }
}
public class CurrencyConverterDemo extends Exception{
    public static void main(String[] args) throws InvalidCurrencyException, IOException {

        CurrencyConverter currencyConverter=new CurrencyConverter();
        double amount;
        String toCurrency;
        String fromCurrency;
        int choice;


        Scanner scanner=new Scanner(System.in);
        Scanner scanner1=new Scanner(System.in);
        Logger logger = Logger.getLogger("MyLog");
        FileHandler fh;

        fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);
        logger.info("Program Started...");

        do{
            System.out.println("Available Currencies");
            System.out.println("1.USD");
            System.out.println("2.INR");
            System.out.println("3.EUR");
            System.out.println("4.JPY");
            System.out.println("5.PLN");

            try{

                System.out.println("Convert From");
                fromCurrency=scanner1.nextLine();
                fromCurrency=fromCurrency.toUpperCase();
                logger.info("User selected  "+ fromCurrency);
                System.out.println("Convert To");
                toCurrency=scanner1.nextLine();
                toCurrency=toCurrency.toUpperCase();
                logger.info("User selected  "+ toCurrency);
                System.out.println("Enter the amount:");
                amount=scanner.nextDouble();
                logger.info("User entered amount "+amount);
                if(amount<=0){
                    throw new IllegalArgumentException("Please enter a valid amount");
                }

                if(fromCurrency.equals("INR")){

                    if(toCurrency.equals("INR")){System.out.println(currencyConverter.rupeesToRupees(amount));}
                    else if(toCurrency.equals("USD")){ System.out.println(currencyConverter.rupeesToDollar(amount)); }
                    else if(toCurrency.equals("EUR")){System.out.println(currencyConverter.rupeesToEuro(amount));}
                    else if(toCurrency.equals("JPY")){ System.out.println(currencyConverter.rupeesToJapaneseYen(amount));}
                    else if(toCurrency.equals("PLN")){System.out.println(currencyConverter.rupeesToPolishZloty(amount));}
                    else throw new InvalidCurrencyException("Enter a valid currency");
                }
                else if(fromCurrency.equals("EUR")){

                    if(toCurrency.equals("EUR")){ System.out.println(currencyConverter.euroToEuro(amount));}
                    else if(toCurrency.equals("INR")){System.out.println(currencyConverter.euroToRupees(amount));}
                    else if(toCurrency.equals("USD")){System.out.println(currencyConverter.euroToDollar(amount));}
                    else if(toCurrency.equals("JPY")){ System.out.println(currencyConverter.euroToJapaneseYen(amount));}
                    else if(toCurrency.equals("PLN")){ System.out.println(currencyConverter.euroToPolishZloty(amount));}
                    else throw new InvalidCurrencyException("Enter a valid currency");
                }
                else if(fromCurrency.equals("USD")){

                    if(toCurrency.equals("USD")){System.out.println(currencyConverter.dollarToDollar(amount));}
                    else if(toCurrency.equals("INR")){System.out.println(currencyConverter.dollarToRupees(amount));}
                    else if(toCurrency.equals("EUR")){System.out.println(currencyConverter.dollarToEuro(amount));}
                    else if(toCurrency.equals("JPY")){System.out.println(currencyConverter.dollarToJapaneseYen(amount));}
                    else if(toCurrency.equals("PLN")){System.out.println(currencyConverter.dollarToPolishZloty(amount));}
                    else throw new InvalidCurrencyException("Enter a valid currency");
                }

                else if(fromCurrency.equals("JPY")) {

                    if (toCurrency.equals("JPY")) { System.out.println(currencyConverter.japaneseYenToJapaneseYen(amount));}
                    else if (toCurrency.equals("INR")) {System.out.println(currencyConverter.japaneseYenToRupees(amount));}
                    else if (toCurrency.equals("USD")) { System.out.println(currencyConverter.japaneseYenToDollar(amount));}
                    else if (toCurrency.equals("EUR")) {System.out.println(currencyConverter.japaneseYenToEuro(amount));}
                    else if (toCurrency.equals("PLN")) {System.out.println(currencyConverter.japaneseYenToPolishZloty(amount));}
                    else throw new InvalidCurrencyException("Enter a valid currency");
                }
                else if(fromCurrency.equals("PLN")){

                    if(toCurrency.equals("PLN")){ System.out.println(currencyConverter.polishZlotyToPolishZloty(amount));}
                    else if(toCurrency.equals("INR")){System.out.println(currencyConverter.polishZlotyToRupees(amount));}
                    else if(toCurrency.equals("USD")){System.out.println(currencyConverter.polishZlotyToDollar(amount));}
                    else if(toCurrency.equals("EUR")){System.out.println(currencyConverter.polishZlotyToEuro(amount));}
                    else if(toCurrency.equals("JPY")){ System.out.println(currencyConverter.polishZlotyToJapaneseYen(amount));}
                    else throw new InvalidCurrencyException("Enter a valid currency");
                }
                else {
                    throw new InvalidCurrencyException("Enter a valid currency");
                }

            }catch(IllegalArgumentException iae){
                System.out.println("Please enter a valid amount");
            }
            catch(InvalidCurrencyException ice){
                System.out.println("Enter a valid currency");
            }
            finally{
                System.out.println("Do you want to continue- 1 for YES 0 for No");
                choice=scanner.nextInt();
                if(choice==1){logger.info("User selected continue ");}
                else{logger.info("User selected exit ");}

            }


        }while(choice==1);

        logger.info("Program Stopped...");

    }
}


