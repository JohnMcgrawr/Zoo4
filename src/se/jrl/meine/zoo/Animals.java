package se.jrl.meine.zoo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

import javax.transaction.TransactionRequiredException;

import org.omg.CORBA.PUBLIC_MEMBER;

public abstract class Animals implements Serializable {

	private static final long serialVersionUID = -8294771616623806095L;

	protected String animalName;
	protected String id;

	protected transient String internalCode = animalName + id;
	protected transient Date birthday;

	abstract void sound();

	public String toString() {
		return "";
	}

	public Date getBirthday() {
		return birthday;
	}

	public String getInternalCode() {
		return internalCode;

	}
	public String getId(){
		return id;
	}

	public int hashcode() {
		int result = 1;
		result = 37 * result + animalName.hashCode();
		return result;
	}

	@Override
	public boolean equals(Object other) {
		if (this.getClass().equals(other.getClass())) {
			Animals animal = (Animals) other;
			return this.animalName.equals(animal.animalName);
		}
		return false;
	}

	private void writeObject(ObjectOutputStream out) throws IOException {

		out.defaultWriteObject();
		out.writeLong(birthday.getTime());

	}

	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {

		in.defaultReadObject();
		birthday = new Date(in.readLong());

	}

}
