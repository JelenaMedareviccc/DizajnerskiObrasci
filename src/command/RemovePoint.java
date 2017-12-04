package command;

import mvc.DrawingModel;
import rekapitulacijaDO.Point;

public class RemovePoint implements Command {

	private DrawingModel model;
	private Point point;
	
	public RemovePoint(DrawingModel model, Point point) {
		this.model=model;
		this.point=point;
	}
	
	
	@Override
	public void execute() {
		model.removeShape(point);	
	}

	@Override
	public void unexecute() {
		model.addShape(point);
	}

}
