package se.jrl.meine.zoo;

import java.util.HashSet;

public class ZooKeeper {
	HashSet<String> zoo = new HashSet<>();

	public void animalsId(String string) {
		zoo.add(string);

	}

	public void zooJournal() {
		System.out.println();
		System.out.println("Zookeeper animals ");
		System.out.println();
		for (String output : zoo) {

			System.out.println(output);
		}
	}
}
