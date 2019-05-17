package tests;
import org.junit.*;
import static org.junit.Assert.*;
import main.MmBank;

public class MmBankTest{

    private MmBank account1;
    private MmBank account2;
    @Before
    public void setUp(){
        account1=new MmBank("Mahvash",10000);
        account2=new MmBank("Shraddha",2000);
    }

    @Test
    public void testWithDrawWithSufficientBalance(){
        assertEquals(5000,account1.withDraw(5000),0.1);
    }

    @Test
    public void testWithDrawWithInSufficientBalance(){
        assertEquals(10000,account1.withDraw(20000),0.1);
    }

    @Test
    public void testDeposit(){
        assertEquals(15000,account1.deposit(5000),0.1);
    }

}