// SPDX-FileCopyrightText: 2021 Martin Wittlinger <wittlinger.martin@gmail.com>
//
// SPDX-License-Identifier: MIT-Modern-Variant

package xppu;

import aps.ConveyorBelt;
import aps.Sensor;

public class CombinedAnalysis {
	
	private ConveyorBelt belt;
	private Sensor sensor;
	
	public CombinedAnalysis(ConveyorBelt belt, Sensor sensor) {
		this.belt = belt;
		this.sensor = sensor;		
	}
}
