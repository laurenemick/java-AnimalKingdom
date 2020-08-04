package animalKingdom;

import java.util.ArrayList;
import java.util.List;

public class Main {
	private static List<AbstractAnimals> filterAnimals(List<AbstractAnimals> animals, CheckAnimals tester) {
		List<AbstractAnimals> tempList = new ArrayList <>();

		// for each loop
		// if it doesn't pass, it'll send an empty list created above
		for (AbstractAnimals a : animals) {
			if (tester.test(a)) {
				tempList.add(a);
			}
		}
		return tempList;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the Animal Kingdom!!");

		// data
		Mammals panda = new Mammals("Panda", 1869);
		Mammals zebra = new Mammals("Zebra", 1778);
		Mammals koala = new Mammals("Koala", 1816);
		Mammals sloth = new Mammals("Sloth", 1804);
		Mammals armadillo = new Mammals("Armadillo", 1758);
		Mammals raccoon = new Mammals("Raccoon", 1758);
		Mammals bigfoot = new Mammals("Bigfoot", 2021);

		Birds pigeon = new Birds("Pigeon", 1837);
		Birds peacock = new Birds("Peacock", 1821);
		Birds toucan = new Birds("Toucan", 1758);
		Birds parrot = new Birds("Parrot", 1824);
		Birds swan = new Birds("Swan", 1758);

		Fish salmon = new Fish("Salmon", 1758);
		Fish catfish = new Fish("Catfish", 1817);
		Fish perch = new Fish("Perch", 1758);

		// collection for animals
		List<AbstractAnimals> animalList = new ArrayList<>();
		animalList.add(panda);
		animalList.add(zebra);
		animalList.add(koala);
		animalList.add(sloth);
		animalList.add(armadillo);
		animalList.add(raccoon);
		animalList.add(bigfoot);
		animalList.add(pigeon);
		animalList.add(peacock);
		animalList.add(toucan);
		animalList.add(parrot);
		animalList.add(swan);
		animalList.add(salmon);
		animalList.add(catfish);
		animalList.add(perch);

        System.out.println("\n*** List all the animals alphabetically ***");
        animalList.sort((a1, a2) -> a1.getYearNamed().compareToIgnoreCase(a2.getYearNamed())); 
        animalList.forEach((a) -> System.out.println(a.getYearNamed()));

	}
}