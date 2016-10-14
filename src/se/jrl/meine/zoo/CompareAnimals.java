package se.jrl.meine.zoo;

import java.util.Comparator;

public class CompareAnimals implements Comparator<Animals> {

	@Override
	public int compare(Animals o1, Animals o2) {

		return o1.animalName.compareTo(o2.animalName);
	}

}
