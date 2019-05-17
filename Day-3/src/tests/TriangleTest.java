package tests;
import org.junit.Test;
import static org.junit.Assert.*;
import main.Triangle;

public class TriangleTest{
	
	@Test
	public void testTriangleWhichIsRightAngled(){
		Triangle triangle=new Triangle(3,4,5);
		assertTrue(triangle.isRight());
	}

	@Test
	public void testTriangleWhichIsNotRightAngled(){
		Triangle triangle=new Triangle(4,4,5);
		assertFalse(triangle.isRight());
	}

	@Test
	public void testTriangleWhichIsScalene(){
		Triangle triangle=new Triangle(3,4,5);
		assertTrue(triangle.isScalene());
	}

	@Test
	public void testTriangleWhichIsNotScalene(){
		Triangle triangle=new Triangle(4,4,4);
		assertFalse(triangle.isScalene());
	}
	
	@Test
	public void testTriangleWhichIsIsosceles(){
		Triangle triangle=new Triangle(3,3,4);
		assertTrue(triangle.isIsosceles());
	}

	@Test
	public void testTriangleWhichIsNotIsosceles(){
		Triangle triangle=new Triangle(4,4,4);
		assertFalse(triangle.isIsosceles());
	}

	@Test
	public void testTriangleWhichIsEquilateral(){
		Triangle triangle=new Triangle(3,3,3);
		assertTrue(triangle.isEquilateral());
	}

	@Test
	public void testTriangleWhichIsNotEquilateral(){
		Triangle triangle=new Triangle(4,2,4);
		assertFalse(triangle.isEquilateral());
	}				
}