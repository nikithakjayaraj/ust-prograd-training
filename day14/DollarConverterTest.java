import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DollarConverterTest {
    DollarConverter dollarConverter = new DollarConverter();
    @Nested
    class RupeesToDollarTest{
        @Test
        public void verifySeventyFourPointEightFiveRupeesIsEqualOneDollar() {
            double actualMoney = dollarConverter.rupeesToDollar(74.85);
            double expectedMoney = 1;
            assertEquals(expectedMoney, actualMoney);
        }

    }
    @Nested
    class AdditionOfRupeesAndDollarGivesRupees{
        @Test
        public void verifyAdditionOfFiftyRupeesAndOneDollarGivesOneHundredAndTwentyFourPointEightFive(){
            double actualMoney = 50+dollarConverter.dollarToRupees(1);
            double expectedMoney=124.85;
            assertEquals(expectedMoney,actualMoney);
        }
    }
    @Nested
    class AdditionOfRupeesAndDollarGivesDollar{
        @Test
        public void verifyAdditionOfSeventyFourPointEightFiveAndOneDollarAndOneHundredAndFourtyNinePointSevenIsEqualToFourDolar(){
            double actualMoney=1+dollarConverter.rupeesToDollar(74.85)+dollarConverter.rupeesToDollar(149.7);
            double expectedMoney=4;
            assertEquals(expectedMoney,actualMoney);
        }
    }
    @Nested
    class TakeOutFromWallet{
        @Test
        public void takingOneDollarFromWallet(){
            System.out.println("withdraw");
//            dollarConverter.walletMoney=400;
            dollarConverter.takeOutMoneyFromWallet(200);
            double actualMoney=dollarConverter.totalAmountInWallet();
            double expectedMoney=200;
            assertEquals(expectedMoney,actualMoney);
        }
        @Test
        public void takingTwoDollarFromWallet(){
            dollarConverter.takeOutMoneyFromWallet(50);
            double actualMoney=dollarConverter.totalAmountInWallet();
            double expectedMoney=150;
            assertEquals(expectedMoney,actualMoney);
        }
    }

    @Nested
    class WalletInfo {
        @Test
        public void addingOneDollarToWallet() {
            System.out.println("deposit");
            dollarConverter.storeInWallet(100,"INR");
            double actualMoney = dollarConverter.totalAmountInWallet();
            double expectedMoney = 100;
            assertEquals(expectedMoney, actualMoney);
        }

        @Test
        public void addingThreeDollarsToWallet() {
            dollarConverter.storeInWallet(300,"INR");
            double actualMoney = dollarConverter.totalAmountInWallet();
            double expectedMoney = 400;
            assertEquals(expectedMoney, actualMoney);
        }
    }

}
//    As a wallet owner, I would like to be able to know that 74.85 rupees is equal to 1 dollar.
//    As a wallet owner I would like to be able to put money into my wallet so that I can take it out later.
//    As a wallet owner, I want to know the total money my wallet has for the preferred currency. When Rs.50 &
//    $1 added to my wallet, Then the sum of money in the wallet is Rs.124.85, (Given preferred currency is Rs.)

//    As a wallet owner, I want to know the total money my wallet has for the preferred currency.
//    When Rs.74.85, $1, Rs.149.7 added to my wallet, Then sum of money in the wallet is $4, (Given preferred currency is $)
//     As a wallet owner I would like to be able to take a specified amount of money out of the wallet.