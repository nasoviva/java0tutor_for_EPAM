package com.java0tutor.oop.task4.bean;

import java.util.ArrayList;
import java.util.List;

public class CaveOfDragon {
	private List<Treasure> treasures;

	public CaveOfDragon() {
		treasures = new ArrayList<Treasure>();
	}

	public CaveOfDragon(List<Treasure> treasures) {
		super();
		this.treasures = treasures;
	}

	public void add(Treasure treasure) {
		treasures.add(treasure);
	}

	public List<Treasure> getTreasures() {
		return treasures;
	}

	public void setTreasures(List<Treasure> treasures) {
		this.treasures = treasures;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((treasures == null) ? 0 : treasures.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CaveOfDragon other = (CaveOfDragon) obj;
		if (treasures == null) {
			if (other.treasures != null)
				return false;
		} else if (!treasures.equals(other.treasures))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CaveOfDragon [treasures=" + treasures + "]";
	}

}
