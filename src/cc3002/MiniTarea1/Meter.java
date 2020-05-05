package cc3002.MiniTarea1;

public class Meter extends AbstractUnit{
    public Meter(double number){
        super(number);
    }

    @Override
    public String getType() {
        return "Meter";
    }

    @Override
    public IUnit sum(IUnit unit) {
        return unit.sumMeter(this) ;
    }

    public Inch sumInch(final IUnit unit) {
        Inch I=new Inch(this.getNumber()*39.37+unit.getNumber());
        return I;

    }

    public IUnit sumMeter(final IUnit unit) {
        Meter M=new Meter(this.getNumber()+unit.getNumber());
        return M;
    }
}
