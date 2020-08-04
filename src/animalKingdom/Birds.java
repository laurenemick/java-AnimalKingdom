package animalKingdom;

public class Birds extends AbstractAnimals {
	private String name;
	private int yearNamed;

	public Birds(String name, int yearNamed) {
		super(name, yearNamed);
	}

	@Override
	public String move() {
		return "fly";
	}

	@Override
	public String breath() {
		return "lungs";
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