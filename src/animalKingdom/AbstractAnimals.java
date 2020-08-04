package animalKingdom;

abstract class AbstractAnimals {
	protected static int maxId = 0;

	int id;
	String name;
	int yearNamed;

	// constructor
	public AbstractAnimals(String name, int yearNamed) {
		maxId++;
		id = maxId;
		this.name = name;
		this.yearNamed = yearNamed;
	}

	// each animal is assigned a unique number, a name, and year discovered regardless of classification
	// all animals consume food the same way
	int getId() {
		return id;
	} 

	String getName() {
		return name;
	}

	int getYearNamed() {
		return yearNamed;
	}

	String consumeFood() {
		return "mouth";
	}

	abstract String move();
	abstract String breath();
	abstract String reproduce();

	public String toString() {
        return "Animals{" + "id = " + id + ", name = " + name + ", yearNamed = " + yearNamed + "}\n";
    }
}