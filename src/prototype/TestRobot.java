package prototype;

import java.awt.Color;

import rekapitulacijaDO.Point;

public class TestRobot {

	public static void main(String[] args) {
		
		Robot robot=new Robot();
		robot.setStartPoint(new Point(10,10, Color.BLACK));
		System.out.println("Memory location of original: "+robot.getStartPoint());
		robot.setNumberOfEyes(3);
		robot.setKnowWords(new String[] {"Hey", "hi"});
		robot.setNumberOfHands(4);
		robot.setSoftwareVersion(101);
	
		
		System.out.println("Basic info:\n" +"Eyes: " +String.valueOf(robot.getNumberOfEyes())+"\nHands: "+String.valueOf(robot.getNumberOfHands())+"\nLegs: "+String.valueOf(robot.getNumberOfLegs())+"\nSoftware:  "+String.valueOf(robot.getSoftwareVersion()));
		System.out.println("Known words: ");
		for(String s : robot.getKnowWords()) {
			System.out.println(s);
		}
		
		Robot robotClone=robot.clone();
		System.out.println("Memory location of clone: "+robotClone.getStartPoint());
		System.out.println("Basic info:\n" +"Eyes: " +String.valueOf(robotClone.getNumberOfEyes())+"\nHands: "
		+String.valueOf(robotClone.getNumberOfHands())+"\nLegs: "+String.valueOf(robotClone.getNumberOfLegs())
		+"\nSoftware:  "+String.valueOf(robotClone.getSoftwareVersion()));
		System.out.println("Known words: ");
		for(String s : robotClone.getKnowWords()) {
			System.out.println(s);
		}
		
		Robot robotCloneDeep=robot.cloneDeep();
		System.out.println("Memory location of clone: "+robotCloneDeep.getStartPoint());
		System.out.println("Basic info:\n" +"Eyes: " +String.valueOf(robotCloneDeep.getNumberOfEyes())+"\nHands: "
		+String.valueOf(robotCloneDeep.getNumberOfHands())+"\nLegs: "+String.valueOf(robotCloneDeep.getNumberOfLegs())
		+"\nSoftware:  "+String.valueOf(robotCloneDeep.getSoftwareVersion()));
		System.out.println("Known words: ");
		for(String s : robotCloneDeep.getKnowWords()) {
			System.out.println(s);
		}

	}

}
