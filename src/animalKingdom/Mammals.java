package animalKingdom;

public class Mammals extends AbstractAnimals {
	private String name;
	private int yearNamed;

	public Mammals(String name, int yearNamed) {
		super(name, yearNamed);
	}

	@Override
	public String move() {
		return "walk";
	}

	@Override
	public String breath() {
		return "lungs";
	}

	@Override
	public String reproduce() {
		return "live birth";
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getYearNamed() {
		return yearNamed;
	}

}