package abstractFactory;

public class DomesticAnimal extends Factory {
	
	public static final int DOG=1;
	public static final int COW=2;
	public static final int SHEEP=3;

	@Override
	public Animal animalFactory(int ID) {
		if (ID==1) return new Dog();
		if(ID==2) return new Cow();
		if(ID==3) return new Sheep();
		return null;
	}

}
