package singleton;

public class IvoryTest {

	public static void main(String[] args) {
		//Normal
		IvoryTower it=IvoryTower.getInstance();
		it.learnMagic();
		System.out.println(it);
		IvoryTower it1=IvoryTower.getInstance();
		it.learnMagic();
		System.out.println(it1);
		//sve iste lokacije
		IvoryTower it2=IvoryTower.getInstance();
		it.learnMagic();
		System.out.println(it2);
		//IvoryTower.getInstance().learnMagic();

		//Lazy
		IvoryTower itLazy=IvoryTower.getInstanceLazy();
		itLazy.learnMagic();
		System.out.println(itLazy);
		IvoryTower it1Lazy=IvoryTower.getInstanceLazy();
		itLazy.learnMagic();
		System.out.println(it1Lazy);
		//sve iste lokacije
		IvoryTower it2Lazy=IvoryTower.getInstanceLazy();
		itLazy.learnMagic();
		System.out.println(it2Lazy);
		//IvoryTower.getInstanceLazy().learnMagic();
		
		//Lazy
		IvoryTower itThreadSafe=IvoryTower.getInstanceThreadSafe();
		itThreadSafe.learnMagic();
		System.out.println(itThreadSafe);
		IvoryTower it1ThreadSafe=IvoryTower.getInstanceThreadSafe();
		itThreadSafe.learnMagic();
		System.out.println(it1ThreadSafe);
		//sve iste lokacije
		IvoryTower it2ThreadSafe=IvoryTower.getInstanceThreadSafe();
		itThreadSafe.learnMagic();
		System.out.println(it2ThreadSafe);
		//IvoryTower.getInstanceLazy().learnMagic();
		
		

	}

}
