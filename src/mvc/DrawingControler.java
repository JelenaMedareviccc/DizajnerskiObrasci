package mvc;

import java.awt.Color;
import java.awt.event.MouseEvent;

import rekapitulacijaDO.Point;

public class DrawingControler {

	private DrawingModel drawingModel;
	private DrawingFrame drawingFrame;
	
	public DrawingControler(DrawingModel drawingModel, DrawingFrame drawingFrame) {
		this.drawingModel=drawingModel;
		this.drawingFrame=drawingFrame;
	}
	
	public void addPoint(MouseEvent e) {
		drawingModel.addShape(new Point(e.getX(),e.getY(), Color.CYAN));
	}

}
