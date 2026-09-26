package simulator;

import java.util.List;

public class Airspace{
	List<Aircraft> aircrafts;
	
	public Airspace(List<Aircraft> aircrafts){
		this.aircrafts = aircrafts;
	}
	
	public void addAircraft(Aircraft ac){
		aircrafts.add(ac);
	}
}