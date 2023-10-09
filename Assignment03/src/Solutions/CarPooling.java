package Solutions;

public class CarPooling {
	
	private double totalMiles;
	
	private double costPerGallon;
	
	private double vehicleAvg;
	
	private double parkingFee;
	
	private double toolsPerDay;
		
	
	
	public CarPooling(double totalMiles, double costPerGallon, double vehicleAvg, double parkingFee,
			double toolsPerDay) {
		this.totalMiles = totalMiles;
		this.costPerGallon = costPerGallon;
		this.vehicleAvg = vehicleAvg;
		this.parkingFee = parkingFee;
		this.toolsPerDay = toolsPerDay;
	}



	public double calculateDrivingCost() {
		double totalFuelCost = (costPerGallon/vehicleAvg)*totalMiles;
		
		return totalFuelCost+parkingFee+toolsPerDay;
	}
	
}
