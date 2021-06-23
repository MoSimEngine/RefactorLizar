// SPDX-FileCopyrightText: 2021 Martin Wittlinger <wittlinger.martin@gmail.com>
//
// SPDX-License-Identifier: MIT-Modern-Variant

package xppu.factory;

import xppu.SensorAnalysis;

public class XppuUser {

  private Sensor sensor;
  private SensorAnalysis analysis;
  public XppuUser(Sensor sensor) {
    this.sensor = sensor;
  }
}
