package mvc;

public class DrawingApp {

	public static void main(String[] args) {
		
		DrawingFrame drawingFrame=new DrawingFrame();
		DrawingModel drawingModel=new DrawingModel();
		DrawingControler drawingControler=new DrawingControler(drawingModel,drawingFrame);
		
		//frame obavjestavamo ko mu je kontroler
		drawingFrame.setDrawingControler(drawingControler);
		//kazemo viewu ko je njegov model
		drawingFrame.getDrawingView().setDrawingmodel(drawingModel);
		
		
	}

}
