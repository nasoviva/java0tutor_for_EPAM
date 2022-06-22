package com.java0tutor.class_simpleClass.task6.logic;

import com.java0tutor.class_simpleClass.task6.entity.Time;

public class TimeLogic {

	public void increaseCurrentTime(Time time, int changeHour, int changeMin, int changeSec) {
		if (time.getHour() + changeHour < 24)
			time.setHour(time.getHour() + changeHour);
		else {
			while (time.getHour() + changeHour >= 24) {
				changeHour = changeHour - 24;
			}
			time.setHour(time.getHour() + changeHour);
		}
		if (time.getMin() + changeMin < 60)
			time.setMin(time.getMin() + changeMin);
		else {
			while (time.getMin() + changeMin >= 60) {
				changeMin = changeMin - 60;
				if (time.getHour() + 1 < 24)
					time.setHour(time.getHour() + 1);
				else
					time.setHour(time.getHour() - 23);
			}
			time.setMin(time.getMin() + changeMin);
		}
		if (time.getSec() + changeSec < 60)
			time.setSec(time.getSec() + changeSec);
		else {
			while (time.getSec() + changeSec >= 60) {
				changeSec = changeSec - 60;
				if (time.getMin() + 1 < 60)
					time.setMin(time.getMin() + 1);
				else {
					time.setMin(time.getMin() - 59);
					if (time.getHour() + 1 < 24)
						time.setHour(time.getHour() + 1);
					else
						time.setHour(time.getHour() - 23);
				}
			}
			time.setSec(time.getSec() + changeSec);
		}
	}

	public void decreaseCurrentTime(Time time, int changeHour, int changeMin, int changeSec) {
		if (time.getHour() - changeHour >= 0)
			time.setHour(time.getHour() - changeHour);
		else {
			while (time.getHour() - changeHour < 0) {
				changeHour = changeHour - 24;
			}
			time.setHour(time.getHour() - changeHour);
		}
		if (time.getMin() - changeMin >= 0)
			time.setMin(time.getMin() - changeMin);
		else {
			while (time.getMin() - changeMin < 0) {
				changeMin = changeMin - 60;
				if (time.getHour() - 1 >= 0) {
					time.setHour(time.getHour() - 1);
				} else
					time.setHour(23 - time.getHour());
			}
			time.setMin(time.getMin() - changeMin);
		}
		if (time.getSec() - changeSec >= 0)
			time.setSec(time.getSec() - changeSec);
		else {
			while (time.getSec() - changeSec < 0) {
				changeSec = changeSec - 60;
				if (time.getMin() - 1 >= 0)
					time.setMin(time.getMin() - 1);
				else {
					time.setMin(59 - time.getMin());
					if (time.getHour() - 1 >= 0)
						time.setHour(time.getHour() - 1);
					else
						time.setHour(23 - time.getHour());
				}
			}
			time.setSec(time.getSec() - changeSec);
		}
	}

}
