﻿package org.test.towerdefense;

public enum MonsterType {
	Peasant, Peon, Berserker, Chicken, Doctor, Chieftain;

	public int getValue() {
		return this.ordinal();
	}

	public static MonsterType forValue(int value) {
		return values()[value];
	}
}