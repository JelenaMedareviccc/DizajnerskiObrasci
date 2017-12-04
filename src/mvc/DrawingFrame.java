package mvc;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

import rekapitulacijaDO.DrawingPnl;
import rekapitulacijaDO.Point;

public class DrawingFrame extends JFrame {
	private DrawingView drawingView=new DrawingView(); //app ce podrazumjevati da je view instanciran i da ga imamo ... panel nam je sad view
	private DrawingControler drawingControler;
	
	public DrawingFrame() {
		setSize(640,480);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		getContentPane().add(drawingView, BorderLayout.CENTER);
		drawingView.setBackground(Color.WHITE);
		drawingView.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				drawingControler.addPoint(e);
			}
		});
	}
	
	
	//View mozemo da direktno instanciramo iz Frama
	public DrawingView getDrawingView() {
		return drawingView;
	}
	public void setDrawingView(DrawingView drawingView) {
		this.drawingView = drawingView;
	}


	public DrawingControler getDrawingControler() {
		return drawingControler;
	}


	public void setDrawingControler(DrawingControler drawingControler) {
		this.drawingControler = drawingControler;
	}
	

}
