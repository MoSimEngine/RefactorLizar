// SPDX-FileCopyrightText: 2021 Martin Wittlinger <wittlinger.martin@gmail.com>
//
// SPDX-License-Identifier: MIT-Modern-Variant

package xppu;

import java.util.ArrayList;
import java.util.List;

import aps.ConveyorBelt;

public class ConveyorBeltAnalysis {
	List<ConveyorBelt> belts;
	
	public ConveyorBeltAnalysis() {
		belts = new ArrayList<>();
	}
	
	public void addBelt(ConveyorBelt belt) {
		belts.add(belt);
	}
	
	public String showBelts() {
		String out = "";
		for(ConveyorBelt belt : belts) {
			out = out + " " + belt;
		}
		return out;
	}
}
