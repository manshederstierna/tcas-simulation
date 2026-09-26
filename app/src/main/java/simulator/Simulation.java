package simulator;


public class Simulation{
	Airspace as;
	
	
	public Simulation(Airspace as){
		this.as = as;	
	}
	
	
	public void addAircraft(Aircraft ac){
		as.addAircraft(ac);
	}
}