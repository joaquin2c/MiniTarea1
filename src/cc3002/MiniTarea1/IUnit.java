package cc3002.MiniTarea1;

public interface IUnit {
    public double getNumber();
    public boolean equals(final Object o);
    public String getType();
    public String sum(IUnit unit);
    public String sumInch(IUnit unit);
    public String sumMeter(IUnit unit);
}
