package abstractFactory;

public class TestFactory {
	
	public static void main(String[] args) {
		
		FactoryFactory ff=new FactoryFactory();
		Factory domestic=ff.factoryfactory(FactoryFactory.DOMESTIC);
		domestic.animalFactory(DomesticAnimal.COW).voice();
		
		Factory wild=ff.factoryfactory(FactoryFactory.WILD);
		wild.animalFactory(WildAnimal.PANDA).voice();
		
		
	}

}
