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
        assertNotEquals("inch",oneMeter.getType());
        assertEquals("meter",oneMeter.getType());
        assertTrue(10==tenInch.getNumber());
        assertNotEquals("meters",tenInch.getType());
        assertEquals("inches",tenInch.getType());


        assertTrue(oneMeter.equals(oneMeter));
        assertFalse(oneMeter.equals(null));
        assertFalse(threeMeter.equals(threeInch));

    }

    @Test
    public void sumaTest(){
        String testingNumber1="1.0 meter + 39.0 inches = 1.9906 meters";
        assertEquals(testingNumber1,oneMeter.sum(thirtyNineInch));
        String testingNumber2="10.0 inches + 2.0 meters = 88.74 inches";
        assertEquals( testingNumber2,tenInch.sum(twoMeter));
        String testingNumber3="5.0 meters + 3.0 meters = 8.0 meters";
        assertEquals(testingNumber3,fiveMeter.sum(threeMeter));
        String testingNumber4="3.0 inches + 10.0 inches = 13.0 inches";
        assertEquals(testingNumber4,threeInch.sum(tenInch));
    }

}
