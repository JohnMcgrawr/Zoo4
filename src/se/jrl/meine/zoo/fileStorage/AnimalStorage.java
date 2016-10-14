package se.jrl.meine.zoo.fileStorage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;

import se.jrl.meine.zoo.Animals;

public class AnimalStorage {
	File file = new File("animals.ser");

	ArrayList<Animals> animals = new ArrayList<>();

	public AnimalStorage() throws IOException {

	}

	public void addAndSeriralize(Animals animal) throws IOException {
		File file = new File("animals.ser");

		FileOutputStream fileOutputStream = new FileOutputStream(file);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

		animals.add(animal);
		objectOutputStream.writeObject(animals);
		objectOutputStream.close();

	}

	public void deSerializeAnimals() throws IOException, ClassNotFoundException {
		File file = new File("animals.ser");

		FileInputStream fileInputStream = new FileInputStream(file);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		animals = (ArrayList<Animals>) objectInputStream.readObject();
		for (Animals output : animals) {
			System.out.println(output.getBirthday());
		}

		objectInputStream.close();
		 
	}
	 
		
		
	}


