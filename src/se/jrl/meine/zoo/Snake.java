package se.jrl.meine.zoo;

import java.io.Serializable;
import java.util.Date;
 

public class Snake extends Animals implements DangerousAnimal, Serializable{
	 
	 
	/**
	 * 
	 */
	private static final long serialVersionUID = 6395238383020569441L;

	public Snake(String animalName,String id , Date birthday ) {
		this.animalName = animalName;
		this.birthday = birthday;
		this.id = id;
		 
	}

	@Override
	public void sound() {
		System.out.println("GRWARRRRR");

	}
	public String getInternalCode(){
		internalCode = animalName + id;	 	 
		return internalCode;
	}
	
	
	@Override
	public String toString() {

		return "SNAKE";
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
			Cow animal = (Cow) other;
			return this.animalName.equals(animal.animalName);
		}
		return false;
	}
 

 

}
