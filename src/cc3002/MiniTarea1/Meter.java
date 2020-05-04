package cc3002.MiniTarea1;

public class Meter extends AbstractUnit{
    public Meter(int number){
        super(number);
    }

    @Override
    public String getType() {
        return getNumber()==1?"meter":"meters";
    }

    @Override
    public String sum(IUnit unit) {
        return unit.sumMeter(this) ;
    }

    public String sumInch(final IUnit unit) {
        return unit.getNumber()+" "+unit.getType()+" + "+this.getNumber()+" "+this.getType()+" = "+(this.getNumber()*39.37+unit.getNumber())+" inches";

    }

    public String sumMeter(final IUnit unit) {
        return unit.getNumber()+" "+unit.getType()+" + "+this.getNumber()+" "+this.getType()+" = "+(this.getNumber()+unit.getNumber())+" meters";
    }
}
