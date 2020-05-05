package cc3002.MiniTarea1;

public class Inch extends AbstractUnit{
    public Inch(double number){
        super(number);
    }

    @Override
    public String getType() {
        return "Inch";
    }

    @Override
    public IUnit sum(final IUnit unit) {
        return unit.sumInch(this);
    }

    public IUnit sumInch(IUnit unit) {
        Inch I=new Inch(this.getNumber()+unit.getNumber());
        return I;
    }

    public IUnit sumMeter(final IUnit unit) {
        Meter M=new Meter(this.getNumber()*0.0254+unit.getNumber());
        return M;
    }


}
