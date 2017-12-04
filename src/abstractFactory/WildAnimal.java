package abstractFactory;

public class WildAnimal extends Factory{
	
	public static final int BEAR=1;
	public static final int FOX=2;
	public static final int PANDA=3;

	@Override
	public Animal animalFactory(int ID) {
		if(ID==1) return new Bear();
		if(ID==2) return new Fox();
		if(ID==3) return new Panda();
		return null;
	}
	

}
