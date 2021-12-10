public class Convertor {


    public double unitConvertor(double measurement, String fromUnit, String toUnit){

        if(measurement<=0){
            throw new IllegalArgumentException("measurement can't be less than or equal to zeo");
        }

        else{
            if(toUnit=="cm"){
                return convertToCentimeter(measurement,fromUnit);
            }
            else if(toUnit=="km"){
                return convertToKilometer(measurement,fromUnit);
            }
            else if(toUnit=="m"){
                return convertToMeter(measurement,fromUnit);
            }
            else{
                throw new IllegalArgumentException("Invalid unit");
            }
        }




    }

    public double convertToCentimeter(double measurement,String fromUnit){
        if(fromUnit=="cm"){
            return measurement;
        }
        else if(fromUnit=="m"){
            return measurement*100;
        }
        else if(fromUnit=="km"){
            return measurement*100000;
        }
        else{
            throw new IllegalArgumentException("Invalid unit");
        }

    }

    public double convertToKilometer(double measurement,String fromUnit){
        if(fromUnit=="cm"){
            return measurement/100000;
        }
        else{
            throw new IllegalArgumentException("Invalid unit");
        }

    }

    public double convertToMeter(double measurement,String fromUnit){

        if(fromUnit=="cm"){
            return measurement/100;
        }
        else{
            throw new IllegalArgumentException("Invalid unit");
        }

    }

}
