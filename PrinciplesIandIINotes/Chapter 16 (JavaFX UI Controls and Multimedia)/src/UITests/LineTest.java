package UITests;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class LineTest extends Application{

	Slider hSlide;
	
	Line l1;
	Circle c1, c2, c3;
	//Rectangle r1;
	
	@SuppressWarnings("exports")
	@Override
	public void start(Stage stage) {
		Pane pane = new Pane();
		BorderPane b_Pane = new BorderPane();
		
		hSlide = new Slider();	//From 0 to 500, starts at 1
		hSlide.setValue(1);
		hSlide.setMin(1);
		hSlide.setMax(500);
		hSlide.setMaxWidth(500);
		
		c1 = new Circle(15);
		c1.setFill(Color.GREEN);
		c1.setCenterX(200);
		c1.setCenterY(300);
		
		l1 = new Line();
		l1.setStartX(260);
		l1.setStartY(0);
		l1.setEndX(c1.getCenterX());
		l1.setEndY(c1.getCenterY());
		
//		r1 = new Rectangle(25, 25);
//		r1.setX(((l1.getStartX() + l1.getEndX()) * 0.75) - 350);			
//		r1.setY(((l1.getStartY() + l1.getEndY()) * 0.75));
		c2 = new Circle(20); c3 = new Circle(18);
		c2.setFill(Color.RED); c3.setFill(Color.BLUE);
		c2.setCenterX(getMiddleX(1));
		c2.setCenterY(getMiddleY(1));
		
		c3.setCenterX(changeX(2));
		c3.setCenterY(changeY(2));
		
		
		pane.getChildren().add(l1);
		pane.getChildren().add(c1);
		pane.getChildren().add(c2);
		pane.getChildren().add(c3);
		
		b_Pane.setCenter(pane);
		b_Pane.setBottom(hSlide);
		
		Scene scene = new Scene(b_Pane, 800, 700);
		stage.setScene(scene);
		stage.show();
		
		
		hSlide.valueProperty().addListener(ov ->{
			c1.setCenterX(hSlide.getValue() + 200);
			
			l1.setEndX(c1.getCenterX());
			l1.setEndY(c1.getCenterY());
			
			c2.setCenterX(getMiddleX(1));
			c2.setCenterY(getMiddleY(1));
			
			c3.setCenterX(changeX(2));
			c3.setCenterY(changeY(2));
		});
		
		System.out.println("Xc2: " + c2.getCenterX());
		System.out.println("Yc2: " + c2.getCenterY());
		
		System.out.println("XChange: " + changeX(3));
		System.out.println("YChange: " + changeY(3));
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	/**Slope theory: rise/run * value: (y_2 - y_1)/(x_2 - x_1) * 0.5 to calculate middle value*/
//	public double getSlope() {
//		double slope = (getRise() / getRun());
//		return slope;
//	}
//	public double getRise() {
//		return (l1.getEndY() - l1.getStartY());
//	}
//	public double getRun() {
//		return (l1.getEndX() - l1.getStartX());
//	}	
	
	/**Method (bellow MiddleX and MiddleY) for combining MidPointX + imageFlareCenter = ((x_2 + x_1) / 2) + imageCenterX	*/
	/**
	 * 	if we want the eighth: [( {[(x_2 + x_1)/2] + x_1}/2 ) + x_1]/2
	 * 
	 * break down:	x_2/8 + x_1/8 + x_1/4 + x_1/2 
	 * there is a pattern:
	 * 						[(n-1) * x_1 + x_2] / n		n = 2^k	(math.pow(2, k)) where k is 3 for 2^3 = 8
	 * 
	 */
	
	public double getMiddleX(int value) {
		return (l1.getEndX() + (value * l1.getStartX())) * 0.5;
	}
	public double getMiddleY(int value) {
		return (l1.getEndY() + (value * l1.getStartY())) * 0.5;
	}
	
	/**Note: If you need to position it further up, use these methods in combination: */
	public double changeX(int value) {
		
		int divisor = (int)Math.pow(2, value);
		double result = 0;
		
		for(int i = 1; i < divisor; i++) {
			result = (l1.getEndX() + (l1.getStartX() * (i - 1))) / i;
		}
		return result;
	}
	public double changeY(int value) {
		
		int divisor = (int)Math.pow(2, value);
		double result = 0;
		
		for(int i = 1; i < divisor; i++) {
			result = (l1.getEndY() + (l1.getStartY() * (i - 1))) / i;
		}
		return result;
	}
	
}
