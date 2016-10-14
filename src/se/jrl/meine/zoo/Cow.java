package se.jrl.meine.zoo;

import java.io.Serializable;
import java.util.Date;
 
public class Cow extends Animals implements Serializable {
 
	private static final long serialVersionUID = -9088736083738337753L;

	public Cow(String animalName, String id, Date birthday ) {
		this.animalName = animalName;
		this.id = id;
		this.birthday = birthday;
	 
	}

	@Override
	public void sound() {
		System.out.println("Moooo");

	}

	@Override
	public String toString() {

		return "Cow";
	}
	public String getInternalCode(){
		internalCode = animalName + id;	 
		return super.internalCode;
	}

	@Override
	public int hashcode() {
		int result = 1;
		result = 37 * result + animalName.hashCode();
		return result;
	}
	 public String getName(){
		 return animalName;
	 }

	@Override
	public boolean equals(Object other) {
		if (this.getClass().equals(other.getClass())) {
			Cow animal = (Cow) other;
			return this.animalName.equals(animal.animalName);
		}
		return false;
	}
 
}
