package main;

public class Country{
	private String countryName;
	private long area;
	private long population;
	
	public Country(){
	}
	
	public Country(String countryName,long area,long population){
		this.countryName=countryName;
		this.area=area;
		this.population=population;
	}

	public Country largestArea(Country[] countries){
		int index=0;
		long maxArea=countries[0].area;
		for(int i=1;i<countries.length;i++){
			if(maxArea<countries[i].area){
				maxArea=countries[i].area;
				index=i;
			}
		}
		return countries[index];

	}

	public Country largestPopulation(Country[] countries){
		int index=0;
		long maxPopulation=countries[0].population;
		for(int i=1;i<countries.length;i++){
			if(maxPopulation<countries[i].population){
				maxPopulation=countries[i].population;
				index=i;
			}
		}
		return countries[index];
	}

	public Country largestPopulationDensity(Country[] countries){
		int index=0;
		long density=countries[0].population/countries[0].area;
		for(int i=1;i<countries.length;i++){
			long populationDensity=countries[i].population/countries[i].area;
			if(density<populationDensity){
				density=populationDensity;
				index=i;
			}
		}
		return countries[index];
	}

	public void setCountryName(String countryName){
		this.countryName=countryName;
	}
	
	public String getCountryName(){
		return countryName;
	}

	public void setArea(long area){
		this.area=area;
	}
	
	public long getArea(){
		return area;
	}
	
	public void setPopulation(long population){
		this.population=population;
	}

	public long getPopulation(){
		return population;
	}
}