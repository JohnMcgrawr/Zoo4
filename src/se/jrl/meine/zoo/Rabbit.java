package se.jrl.meine.zoo;

import java.io.Serializable;
import java.util.Date;
 
public class Rabbit extends Animals implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1874002647273977643L;

	public Rabbit(String animalName, String id , Date birthday  ) {
		
		this.animalName = animalName;
		this.id = id;
		this.birthday = birthday;
		 
	
	}

	@Override
	public void sound() {
		System.out.println("Boink boink boink");

	}

	@Override
	public String toString() {

		return "Rabbit";
	}
	 public String getName(){
		 return animalName;
	 }
		public String getInternalCode(){
			internalCode = animalName + id;	 
			 
			return internalCode;
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
