package xppu;

import java.util.ArrayList;
import java.util.List;

import aps.Sensor;
import identifier.Entity;

public class SensorAnalysis {
	List<Sensor> sensors;
	Entity entity;
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
