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

		// System.out.println(animalList);

		System.out.println("\n*** List all the animals in descending order by year named ***");
		animalList.sort((a1, a2) -> a2.yearNamed - a1.yearNamed); 
        animalList.forEach((a) -> System.out.println(a));

        System.out.println();
        System.out.println("\n*** List all the animals alphabetically ***");
        animalList.sort((a1, a2) -> a1.name.compareToIgnoreCase(a2.name)); 
        animalList.forEach((a) -> System.out.println(a));

        System.out.println();
        System.out.println("\n*** List all the animals order by how they move ***");
        animalList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move())); 
        animalList.forEach((a) -> System.out.println(a + "Move Value: " + a.move() + "\n"));

        System.out.println();
        System.out.println("\n*** List only those animals the breath with lungs ***");
        List<AbstractAnimals> filteredByLungs = filterAnimals(animalList, a -> a.breath() == "lungs");
        filteredByLungs.forEach((a) -> System.out.println(a + "Breath value: " + a.breath() + "\n"));

        System.out.println();
        System.out.println("\n*** List only those animals that breath with lungs and were named in 1758 ***");
        List<AbstractAnimals> filteredByLungsAndYear = filterAnimals(filteredByLungs, a -> a.yearNamed == 1758);
        filteredByLungsAndYear.forEach((a) -> System.out.println(a + "Breath value: " + a.breath() + "\n"));

        System.out.println();
        System.out.println("\n*** List only those animals that lay eggs and breath with lungs ***");
        List<AbstractAnimals> filteredByEggsAndLungs = filterAnimals(filteredByLungs, a -> a.reproduce() == "eggs");
        filteredByEggsAndLungs.forEach((a) -> System.out.println(a + "Breath value: " + a.breath() + ", Reproduce Value: " + a.reproduce() + "\n"));

        System.out.println();
        System.out.println("\n*** List alphabetically only those animals that were named in 1758 ***");
        List<AbstractAnimals> filteredByYear = filterAnimals(animalList, a -> a.yearNamed == 1758);
        filteredByYear.forEach((a) -> System.out.println(a));
	}
}