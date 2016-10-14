package se.jrl.meine.zoo;

import java.io.IOException;
import java.util.Date;

import se.jrl.meine.zoo.fileStorage.AnimalStorage;

public class Main {
public static void main(String[] args) throws IOException, ZooException, ClassNotFoundException   {
	 Zoo zoo = new Zoo();
	
	 
	try {
		zoo.addAnimal(new Cow("ZUrban" , "1001", new Date (1454998096000L)));
		zoo.addAnimal(new Cat("ZAlbert" ,"1002342", new Date (2343225L)));
		zoo.addAnimal(new Rabbit("ZStampe", "1003", new Date (325325L)));
		zoo.addAnimal(new Snake("ZSneeek", "1004", new Date (123535135L)));
		 
		
//		zoo.removeAnimal("1001");
		zoo.myFarm();
		zoo.zooKeeper.zooJournal();
		zoo.getOldStuff();
	} catch (IOException e) {

		System.err.println(e);
	}
	
}
}
