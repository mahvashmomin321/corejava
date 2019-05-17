package tests;
import org.junit.*;
import static org.junit.Assert.*;
import main.Vehicle;

public class VehicleTest{

	private Vehicle vehicle1;
	private Vehicle vehicle2;
	private Vehicle vehicle3;
	@Before
	public void setUp(){
		vehicle1=new Vehicle("ABC",20,30);
		vehicle2=new Vehicle("EDG",40,40);
		vehicle3=new Vehicle("ERC",30,50);
	}	

	@Test
	public void testChangeSpeed(){
		assertEquals(60,vehicle1.changeSpeed(40),0.2);			
	}

	@Test
	public void testSpeedZero(){
		assertEquals(0,vehicle1.stopSpeed(),0.2);
	}

	@Test
	public void testChangeDirectionLeft(){
		assertEquals(330,vehicle1.changeDirection(30,"left"),0.1);
	}

	@Test
	public void testChangeDirectionRight(){
		assertEquals(30,vehicle1.changeDirection(30,"right"),0.1);
	}

	@Test
	public void testToString(){
		assertEquals("ABC 20.0",vehicle1.toString());
	}

	
}