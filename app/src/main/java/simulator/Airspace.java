package simulator;

import java.util.*;

public class Airspace{
	ArrayList<Aircraft> aircrafts = new ArrayList<>();
	
	public Airspace(){}
	
	public void addAircraft(Aircraft ac){
		aircrafts.add(ac);
	}
	
	public ArrayList<Aircraft> getAircraft(){
		return aircrafts;	
	}
}