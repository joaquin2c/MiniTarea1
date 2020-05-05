package cc3002.MiniTarea1;

public interface IUnit {
    public double getNumber();
    public boolean equals(final Object o);
    public String getType();
    public IUnit sum(IUnit unit);
    public IUnit sumInch(IUnit unit);
    public IUnit sumMeter(IUnit unit);
}
