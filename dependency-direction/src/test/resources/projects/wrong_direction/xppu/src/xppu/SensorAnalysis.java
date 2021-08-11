package xppu;

import java.util.ArrayList;
import java.util.List;

import aps.Sensor;

public class SensorAnalysis {
	List<Sensor> sensors;
	
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
