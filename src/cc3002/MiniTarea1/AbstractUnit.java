package cc3002.MiniTarea1;

public abstract class AbstractUnit implements IUnit{
    private final double number;

    public AbstractUnit(double Number){
        this.number=Number;
    }

    public double getNumber() {
        return number;
    }

    public boolean equals(final Object o){
        if (this == o){
            return true;
        }
        if (!(o instanceof IUnit)){
            return false;
        }
        final IUnit u= (IUnit) o;
        return this.getNumber()==u.getNumber() && this.getType()==u.getType();

    }

    public abstract String getType ();
    public abstract String sum(IUnit u);
    public abstract String sumInch(IUnit u);
    public abstract String sumMeter(IUnit u);


}
