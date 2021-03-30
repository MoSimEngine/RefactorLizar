package xppu.factory;

import xppu.Sensor;
import xppu.SensorAnalysis;

public class XppuUser {

  private SensorAnalysis sensorAnalysis;
  private Sensor sensor;

  public XppuUser(Sensor sensor, SensorAnalysis sensorAnalysis) {
    this.sensor = sensor;
    this.sensorAnalysis = sensorAnalysis;
  }
}
