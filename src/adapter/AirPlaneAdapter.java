package adapter;

public class AirPlaneAdapter extends Vehicle {

	private AirPlane airPlane;
	
	public AirPlaneAdapter(AirPlane airPlane) {
		this.airPlane=airPlane;
		
	}
	
	@Override
	public void goFaster() {
		airPlane.flyFaster();
		
	}
	

}
