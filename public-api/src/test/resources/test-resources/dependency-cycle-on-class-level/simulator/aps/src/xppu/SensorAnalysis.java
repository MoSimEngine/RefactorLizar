package xppu;

import java.util.ArrayList;
import java.util.List;

import xppu.Sensor;
import xppu.factory.XppuUser;

public class SensorAnalysis {
	List<Sensor> sensors;
	XppuUser xppuUser;
	
	public SensorAnalysis() {
		sensors = new ArrayList<>();
		xppuUser = new XppuUser();
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
