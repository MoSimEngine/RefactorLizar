package xppu;

import java.util.ArrayList;
import java.util.List;

import xppu.Sensor;

public class SensorAnalysis {
	CombinedAnalysis combinedAnalysis;
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
