public class Probability {
        String[] doubleToss={"HH","TT","HT","TH"};
        String[] singleToss={"H","T"};
        public double checkProbabilityValue(String inputToss){
            switch(inputToss){
                case "H":
                case "T":return Toss(inputToss,singleToss);
                case "HH":
                case "TT":
                case "HT":
                case "TH":return Toss(inputToss,doubleToss) ;
                default:throw new IllegalArgumentException("Invalid Input");
            }
        }
        public double Toss(String inputToss,String[] possibleArray){
            double count=0;
            for(int i=0;i<possibleArray.length;i++){
                if(possibleArray[i]==inputToss)
                    count++;
            }
            return count/possibleArray.length;
        }
    }