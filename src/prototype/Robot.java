package prototype;

import rekapitulacijaDO.Point;

public class Robot implements Cloneable {
	
	private int numberOfHands;
	private int softwareVersion;
	private int numberOfEyes;
	private int numberOfLegs;
	private String[] knowWords;
	private Point startPoint;
	


	public Robot clone() {
		try {
			return (Robot) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public Robot cloneDeep() {
		Robot tmp=new Robot();
		tmp.setKnowWords(getKnowWords());
		tmp.setNumberOfEyes(numberOfEyes);
		tmp.setNumberOfHands(numberOfHands);
		tmp.setNumberOfLegs(numberOfLegs);
		tmp.setSoftwareVersion(softwareVersion);
		tmp.setStartPoint(new Point(startPoint.getX(),startPoint.getY(),startPoint.getColor()));
		
		return tmp;
	}
	
	
	public int getNumberOfHands() {
		return numberOfHands;
	}
	public void setNumberOfHands(int numberOfHands) {
		this.numberOfHands = numberOfHands;
	}
	public int getSoftwareVersion() {
		return softwareVersion;
	}
	public void setSoftwareVersion(int softwareVersion) {
		this.softwareVersion = softwareVersion;
	}
	public int getNumberOfEyes() {
		return numberOfEyes;
	}
	public void setNumberOfEyes(int numberOfEyes) {
		this.numberOfEyes = numberOfEyes;
	}
	public int getNumberOfLegs() {
		return numberOfLegs;
	}
	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}
	public String[] getKnowWords() {
		return knowWords;
	}
	public void setKnowWords(String[] knowWords) {
		this.knowWords = knowWords;
	}
	
	public Point getStartPoint() {
		return startPoint;
	}


	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}


	

}
