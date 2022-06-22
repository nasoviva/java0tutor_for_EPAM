package com.java0tutor.class_simpleClass.task4.logic;

import com.java0tutor.class_simpleClass.task4.entity.Depo;
import com.java0tutor.class_simpleClass.task4.entity.Time;
import com.java0tutor.class_simpleClass.task4.entity.Train;

public class DepoLogic {

	public void sortByNumOfTrain(Depo depo) {
		int tmp_num;
		String tmp_destination;
		Time tmp_time;

		for (int i = 0; i < depo.getTrain().length; i++) {

			for (int j = 0; j < depo.getTrain().length - 1; j++) {

				if (depo.getTrain()[j].getNumOfTrain() > depo.getTrain()[j + 1].getNumOfTrain()) {
					tmp_num = depo.getTrain()[j].getNumOfTrain();
					tmp_destination = depo.getTrain()[j].getDestination();
					tmp_time = depo.getTrain()[j].getTimeOfDeparture();

					depo.getTrain()[j].setNumOfTrain(depo.getTrain()[j + 1].getNumOfTrain());
					depo.getTrain()[j].setDestination(depo.getTrain()[j + 1].getDestination());
					depo.getTrain()[j].setTimeOfDeparture(depo.getTrain()[j + 1].getTimeOfDeparture());

					depo.getTrain()[j + 1].setNumOfTrain(tmp_num);
					depo.getTrain()[j + 1].setDestination(tmp_destination);
					depo.getTrain()[j + 1].setTimeOfDeparture(tmp_time);
				}
			}
		}
	}

	public void sortByDestination(Depo depo) {
		int tmp_num;
		String tmp_destination;
		Time tmp_time;

		for (int i = 0; i < depo.getTrain().length; i++) {
			for (int j = 0; j < depo.getTrain().length - 1; j++) {
				if (compareDestination(depo.getTrain()[j].getDestination(),
						depo.getTrain()[j + 1].getDestination()) > 0) {
					tmp_num = depo.getTrain()[j].getNumOfTrain();
					tmp_destination = depo.getTrain()[j].getDestination();
					tmp_time = depo.getTrain()[j].getTimeOfDeparture();

					depo.getTrain()[j].setNumOfTrain(depo.getTrain()[j + 1].getNumOfTrain());
					depo.getTrain()[j].setDestination(depo.getTrain()[j + 1].getDestination());
					depo.getTrain()[j].setTimeOfDeparture(depo.getTrain()[j + 1].getTimeOfDeparture());

					depo.getTrain()[j + 1].setNumOfTrain(tmp_num);
					depo.getTrain()[j + 1].setDestination(tmp_destination);
					depo.getTrain()[j + 1].setTimeOfDeparture(tmp_time);
				} else if (compareDestination(depo.getTrain()[j].getDestination(),
						depo.getTrain()[j + 1].getDestination()) == 0)
					sortByTimeOfDeparture(depo, j, j + 1);
			}
		}
	}

	public Train findInfoAboutTrain(Depo depo, int number) {
		for (int i = 0; i < depo.getTrain().length; i++) {
			if (depo.getTrain()[i].getNumOfTrain() == number) {
				return depo.getTrain()[i];
			}
		}
		return null;
	}

	private int compareDestination(String s1, String s2) {
		for (int i = 0; i < s1.length(); i++) {
			if (i < s2.length() && s1.charAt(i) - s2.charAt(i) > 0)
				return 1;
			else if (i < s2.length() && s1.charAt(i) - s2.charAt(i) < 0)
				return -1;
		}
		return 0;
	}

	private void sortByTimeOfDeparture(Depo depo, int a, int b) {
		int tmp_num;
		String tmp_destination;
		Time tmp_time;

		for (int i = a; i <= b; i++) {
			for (int j = a; j <= b - 1; j++) {
				if (depo.getTrain()[j].getTimeOfDeparture().getHour() > depo.getTrain()[j + 1].getTimeOfDeparture()
						.getHour()) {
					tmp_num = depo.getTrain()[j].getNumOfTrain();
					tmp_destination = depo.getTrain()[j].getDestination();
					tmp_time = depo.getTrain()[j].getTimeOfDeparture();

					depo.getTrain()[j].setNumOfTrain(depo.getTrain()[j + 1].getNumOfTrain());
					depo.getTrain()[j].setDestination(depo.getTrain()[j + 1].getDestination());
					depo.getTrain()[j].setTimeOfDeparture(depo.getTrain()[j + 1].getTimeOfDeparture());

					depo.getTrain()[j + 1].setNumOfTrain(tmp_num);
					depo.getTrain()[j + 1].setDestination(tmp_destination);
					depo.getTrain()[j + 1].setTimeOfDeparture(tmp_time);
				} else if (depo.getTrain()[j].getTimeOfDeparture().getHour() == depo.getTrain()[j + 1]
						.getTimeOfDeparture().getHour()) {
					if (depo.getTrain()[j].getTimeOfDeparture().getMin() > depo.getTrain()[j + 1].getTimeOfDeparture()
							.getMin()) {
						tmp_num = depo.getTrain()[j].getNumOfTrain();
						tmp_destination = depo.getTrain()[j].getDestination();
						tmp_time = depo.getTrain()[j].getTimeOfDeparture();

						depo.getTrain()[j].setNumOfTrain(depo.getTrain()[j + 1].getNumOfTrain());
						depo.getTrain()[j].setDestination(depo.getTrain()[j + 1].getDestination());
						depo.getTrain()[j].setTimeOfDeparture(depo.getTrain()[j + 1].getTimeOfDeparture());

						depo.getTrain()[j + 1].setNumOfTrain(tmp_num);
						depo.getTrain()[j + 1].setDestination(tmp_destination);
						depo.getTrain()[j + 1].setTimeOfDeparture(tmp_time);
					}
				}
			}
		}
	}

}
