package aps;

import java.util.ArrayList;
import java.util.List;

import aps.Sensor;
import aps2.ConveyorBelt;

public class SensorAnalysis {
	List<Sensor> sensors;
	ConveyorBelt conveyorBelt;

	public SensorAnalysis() {
		sensors = new ArrayList<>();
	}
	
	public void addBelt(Sensor belt) {
		sensors.add(belt);
	}
	
	public String showsensors() {
		String out = "";
		for(Sensor belt : sensors) {
			out = out + " " + belt;
		}
		return out;
	}
}
