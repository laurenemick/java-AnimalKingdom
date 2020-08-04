package animalKingdom;

public class Fish extends AbstractAnimals {
	private String name;
	private int yearNamed;

	public Fish(String name, int yearNamed) {
		super(name, yearNamed);
	}

	@Override
	public String move() {
		return "swim";
	}

	@Override
	public String breath() {
		return "gills";
	}

	@Override
	public String reproduce() {
		return "eggs";
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