package singleton;

public class IvoryTower {
	//Normal loading
	private static IvoryTower it = new IvoryTower();
	//Lazy loading
	private static IvoryTower itLazy;
	//Thread safe singleton
	private static IvoryTower itThreadSafe;
	
	//treba nam ovaj private jer ce java napraviti sama konstruktor public
	private IvoryTower() {
		//Do nothing
	}
	
	public void learnMagic() {
		System.out.println("New magic has been learned!");
	}
	
	public static IvoryTower getInstance() {
		return it;
		
	}
	
	public static IvoryTower getInstanceLazy() {
		if(itLazy==null) {
			itLazy=new IvoryTower();
			System.out.println("Instance was null, now instance was created!");
		}
		return itLazy;
	}
	
	public static IvoryTower getInstanceThreadSafe() {
		//ocekuje argument koji govori u cijem kontekstu tj klasi ce da izvrsava, na osnovu cega
		synchronized(IvoryTower.class) {
			if(itThreadSafe==null) {
				itThreadSafe=new IvoryTower();
				System.out.println("Instance was null, now instance was created!");
			}
			
		}
		
		return itThreadSafe;
	}

}
