package simulator;

import java.util.*;

public class Simulation{
	Airspace as;
	int tickrate = 0;
	
	public Simulation(Airspace as){
		this.as = as;	
	}
	
	
	public void addAircraft(Aircraft ac){
		as.addAircraft(ac);
	}
	
	public void setTickrate(int n){
		tickrate = n;
	}
	
	public List<Aircraft> getAircraft(){
		return as.getAircraft();
	}

    public void update(double dt) {
        for(var airplane : as.getAircraft()){
			airplane.update(dt);
		}
    }
	
	
	
}