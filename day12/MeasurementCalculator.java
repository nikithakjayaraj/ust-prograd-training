public class MeasurementCalculator extends Convertor{

    public double addMeter(double magnitudeMeter,double magnitudeCentimeter){
        return magnitudeMeter+unitConvertor(magnitudeCentimeter,"cm","m");
    }

    public double addCentimeter(double magnitudeCentimeter,double magnitudeKilometer){
        return magnitudeCentimeter+unitConvertor(magnitudeKilometer,"km","cm");
    }

    public double subMeter(double magnitudeMeter,double magnitudeCentimeter){
        return magnitudeMeter-unitConvertor(magnitudeCentimeter,"cm","m");
    }

    public double subCentimeter(double magnitudeCentimeter,double magnitudeMeter){
        return magnitudeCentimeter-unitConvertor(magnitudeMeter,"m","cm");
    }
}
