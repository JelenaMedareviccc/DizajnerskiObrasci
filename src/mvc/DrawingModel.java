package mvc;

import java.util.ArrayList;

import rekapitulacijaDO.Shape;

public class DrawingModel {
	
	private ArrayList<Shape> shapes=new ArrayList<>();
	
	public void addShape(Shape shape) {
		shapes.add(shape);
	}
	
	public void removeShape(Shape shape) {
		shapes.remove(shapes);
	}
	

	public Shape getShape(int i) {
		return shapes.get(i);
	}
	
	public ArrayList<Shape> getShapes() {
		return shapes;
	}

	public void setShapes(ArrayList<Shape> shapes) {
		this.shapes = shapes;
	}

}
