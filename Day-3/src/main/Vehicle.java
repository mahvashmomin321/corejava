package main;

public class Vehicle{
	private double currentSpeed;
	private double currentDirection;
	private String ownerName;
	private double vehicleId;
	private static long highestVehicleId=1000;
	public static final String TURN_LEFT="left";
	public static final String TURN_RIGHT="Right";

	public Vehicle(){
	}
	

	
	public Vehicle(String ownerName){
		this.ownerName=ownerName;
	}

	public Vehicle(String ownerName,double currentSpeed,double currentDirection){
		this.ownerName=ownerName;
		this.currentSpeed=currentSpeed;
		this.currentDirection=currentDirection;
		this.vehicleId=++highestVehicleId;
		
	}


	public void setownerName(String ownerName){
		this.ownerName=ownerName;
	}

	public String getownerName(){
		return ownerName;
	}
	
	public void setCurrentSpeed(double currentSpeed){
		this.currentSpeed=currentSpeed;
	}
	
	public double getCurrentSpeed(){
		return currentSpeed;
	}

	public void setCurrentDirection(double currentDirection){
		this.currentDirection=currentDirection;
	}
	
	public double getCurrentDirection(){
		return currentDirection;
	}

	public void setVehicleId(double VehicleId){
		this.vehicleId=vehicleId;
	}

	public double setVehicleId(){
		return vehicleId;
	} 

	public double changeSpeed(double speed){
		currentSpeed=currentSpeed+speed;
		return currentSpeed;
	}
	
	public double stopSpeed(){
		currentSpeed=0;
		return currentSpeed;
	}

	
	public double changeDirection(double degree,String turn){
		if(turn.equals(TURN_LEFT)){
			degree=360-degree;
		}
		else if(turn.equals(TURN_RIGHT)) {
			degree=degree;
		}
		return degree;
	}

	public static long highestVehicleNumber(){
		return highestVehicleId;	
	}

	public String toString(){
		return getownerName() +" " +getCurrentSpeed() ; 
	}

}