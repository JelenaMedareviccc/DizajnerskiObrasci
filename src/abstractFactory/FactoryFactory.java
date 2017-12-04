package abstractFactory;

public class FactoryFactory {
	
	public static final int DOMESTIC=1;
	public static final int WILD=2;
	
	public Factory factoryfactory(int ID) {
		if(ID==1) return new DomesticAnimal();
		if(ID==2) return new WildAnimal();
		return null;
		
	}

}
