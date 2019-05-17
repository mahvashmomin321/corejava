package tests;
import org.junit.*;
import static org.junit.Assert.*;
import main.Country;


public class CountryTest{
	
	private Country[] countries;
	@Before
	public void setUp(){
		
		countries=new Country[4];
		countries[0]=new Country("India",12000078,656564);
		countries[1]=new Country("US",56757256,256564);
		countries[2]=new Country("Australia",27878654,356564);
		countries[3]=new Country("UK",878787832,5656564);
		
	}
	@Test
	public void testCountryWithLargestArea(){
		
		Country expectedCountry=new Country("UK",878787832,5656564);
		Country actualCountry=new Country().largestArea(countries);
		assertEquals(expectedCountry.getCountryName(),actualCountry.getCountryName());
		assertEquals(expectedCountry.getArea(),actualCountry.getArea());
		assertEquals(expectedCountry.getPopulation(),actualCountry.getPopulation());
	}

	@Test
	public void testCountryWithLargestPopulation(){
		Country expectedCountry= new Country("UK",878787832,5656564);
		Country actualCountry=new Country().largestPopulation(countries);
		assertEquals(expectedCountry.getCountryName(),actualCountry.getCountryName());
		assertEquals(expectedCountry.getArea(),actualCountry.getArea());
		assertEquals(expectedCountry.getPopulation(),actualCountry.getPopulation());
	}

	@Test
	public void testCountryWithLargestPopulationDensity(){
		Country expectedCountry= new Country("India",12000078,656564);
		Country actualCountry=new Country().largestPopulationDensity(countries);
		assertEquals(expectedCountry.getCountryName(),actualCountry.getCountryName());
		assertEquals(expectedCountry.getArea(),actualCountry.getArea());
		assertEquals(expectedCountry.getPopulation(),actualCountry.getPopulation());
	}
}