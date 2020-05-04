package cc3002.MiniTarea1;

public class Inch extends AbstractUnit{
    public Inch(int number){
        super(number);
    }

    @Override
    public String getType() {
        return getNumber()==1?"inch":"inches";
    }

    @Override
    public String sum(final IUnit unit) {
        return unit.sumInch(this);
    }

    public String sumInch(IUnit unit) {
        return unit.getNumber()+" "+unit.getType()+" + "+this.getNumber()+" "+this.getType()+" = "+(this.getNumber()+unit.getNumber())+" inches";
    }

    public String sumMeter(final IUnit unit) {
        return unit.getNumber()+" "+unit.getType()+" + "+this.getNumber()+" "+this.getType()+" = "+(this.getNumber()*0.0254+unit.getNumber())+" meters";
    }


}
