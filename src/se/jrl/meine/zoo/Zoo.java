package se.jrl.meine.zoo;

import java.io.IOException;
import java.util.ArrayList;

import java.util.Collections;

import se.jrl.meine.zoo.fileStorage.AnimalStorage;

public class Zoo {
	ZooKeeper zooKeeper = new ZooKeeper();

	ArrayList<Animals> animals = new ArrayList<>();
	CompareAnimals compareAnimals = new CompareAnimals();
	private AnimalStorage animalStorage = new AnimalStorage();

	public Zoo() throws IOException {
		// TODO Auto-generated constructor stub
	}

	public void myFarm() {
		System.out.println("Theese animals will not kill your customers of the petting zoo");
		for (Animals myFarm : animals) {
			System.out.println(myFarm);
			//
			//
			zooKeeper.animalsId(myFarm.animalName + " " + myFarm.getInternalCode());

		}

	}

	public void addAnimal(Animals animal) throws IOException, ClassNotFoundException {

		try {
			if (animal instanceof DangerousAnimal) {

				throw new ZooException("To dangerous to store in the petting zoo " + animal + "\n");
			} else {

				Collections.sort(animals, compareAnimals);
				animals.add(animal);
				animalStorage.addAndSeriralize(animal);
			}

		} catch (ZooException e) {
			// TODO: handle exception
			System.err.println(e);
		}

	}

	public void getOldStuff() throws ClassNotFoundException, IOException {
		animalStorage.deSerializeAnimals();
	}

	public void removeAnimal(String id) {

		for (int i = 0; i < animals.size(); i++) {
 
			if (id.equals(animals.get(i).getId())) {
				
				animals.remove(i);
			}
		}

	}
}
