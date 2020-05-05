package cc3002.MiniTarea1;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class UnitTest {
    private IUnit oneMeter;
    private IUnit twoMeter;
    private IUnit fiveMeter;
    private IUnit threeMeter;
    private IUnit thirtyNineInch;
    private IUnit tenInch;
    private IUnit threeInch;
    private double meterToInch;
    private double inchToMeter;

    @Before
    public void setUp(){
        meterToInch=39.37;
        inchToMeter=0.0254;
        oneMeter=new Meter(1);
        twoMeter=new Meter(2);
        fiveMeter=new Meter(5);
        threeMeter=new Meter(3);
        thirtyNineInch=new Inch(39);
        tenInch=new Inch(10);
        threeInch=new Inch(3);
    }

    @Test
    public void constructorTest(){
        assertEquals(oneMeter,oneMeter);
        assertEquals(tenInch,tenInch);
        assertNotEquals(oneMeter,new Object());
        assertNotEquals(oneMeter,tenInch);

        assertTrue(1==oneMeter.getNumber());
        assertNotEquals("Inch",oneMeter.getType());
        assertEquals("Meter",oneMeter.getType());
        assertTrue(10==tenInch.getNumber());
        assertNotEquals("Meter",tenInch.getType());


        assertTrue(oneMeter.equals(oneMeter));
        assertFalse(oneMeter.equals(null));
        assertFalse(threeMeter.equals(threeInch));

    }

    @Test
    public void sumaTest(){
        Meter testingNumber1=new Meter(1.9906);
        assertNotEquals(thirtyNineInch.sum(oneMeter),oneMeter.sum(thirtyNineInch));
        assertEquals(testingNumber1,oneMeter.sum(thirtyNineInch));

        Inch testingNumber2=new Inch(88.74);
        assertNotEquals( twoMeter.sum(tenInch),tenInch.sum(twoMeter));
        assertEquals( testingNumber2,tenInch.sum(twoMeter));


        Meter testingNumber3=new Meter(8);
        assertEquals(threeMeter.sum(fiveMeter),fiveMeter.sum(threeMeter));
        assertEquals(testingNumber3,fiveMeter.sum(threeMeter));

        Inch testingNumber4=new Inch(13);
        assertEquals(tenInch.sum(threeInch),threeInch.sum(tenInch));
        assertEquals(testingNumber4,threeInch.sum(tenInch));

        
        Meter testingNumber5=new Meter(9.9906);
        assertEquals(testingNumber5,testingNumber1.sum(testingNumber3));

        Inch testingNumber6=new Inch(101.74);
        assertEquals(testingNumber6,testingNumber2.sum(testingNumber4));

    }

}
