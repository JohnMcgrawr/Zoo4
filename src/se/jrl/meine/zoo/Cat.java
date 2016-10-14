package se.jrl.meine.zoo;

import java.io.Serializable;
import java.util.Date;

public class Cat extends Animals implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2932212073290063604L;

	public Cat(String animalName, String id, Date birthday ) {
		this.animalName = animalName;
		this.birthday = birthday;
		this.id = id;
	 

	}

	@Override
	public String getInternalCode() {
  	internalCode = animalName + id;	 
		return  super.internalCode;
	}

	@Override
	public void sound() {
		System.out.println("Mjaoooo");

	}

	@Override
	public String toString() {

		return "Cat";
	}

	public String getName() {
		return animalName;
	}

	@Override
	public int hashcode() {
		int result = 1;
		result = 37 * result + animalName.hashCode();
		return result;
	}

	@Override
	public boolean equals(Object other) {
		if (this.getClass().equals(other.getClass())) {
			Cat animal = (Cat) other;
			return this.animalName.equals(animal.animalName);
		}
		return false;
	}
}
