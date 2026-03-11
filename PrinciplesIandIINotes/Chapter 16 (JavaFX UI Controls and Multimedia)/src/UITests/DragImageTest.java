package UITests;

import java.io.File;

import javafx.application.Application;

import javafx.scene.layout.*;
import javafx.scene.Scene;
import javafx.scene.image.*;
import javafx.stage.Stage;

public class DragImageTest extends Application{
	
	File imageFile;
	Image image;
	ImageView imageView;
	
	double initialPosX, initialPosY;

	@SuppressWarnings("exports")
	@Override
	public void start(Stage stage) {
		
		imageFile = new File("C:\\Users\\matte\\OneDrive\\Pictures\\LensFlare Images\\BlackForest_Winter.jpg");
		try {
			image = new Image(imageFile.toURI().toURL().toString());
			imageView = new ImageView(image);
		}catch(Exception ex) {
			System.out.println("Image Not Found");
		}		
				
		Pane pane = new Pane();
		pane.getChildren().add(imageView);
		
		Scene scene = new Scene(pane, 800, 400);
		stage.setTitle("Environment_Design");
		stage.setScene(scene);
		stage.show();
		
		//Initial Values for the width and height of the image
		imageView.setFitWidth(pane.getWidth() * 2);
		imageView.setFitHeight(pane.getHeight() * 2);
		
		/**Change the image size depending on the scene size*/
//		pane.widthProperty().addListener(ob ->{
//			imageView.setFitWidth(pane.getWidth() * 2);
//		});
//		pane.heightProperty().addListener(ob ->{
//			imageView.setFitHeight(pane.getHeight() * 2);
//		});
		
		
		/**Change the image position when you drag the mouse on the image*/
		pane.setOnMouseDragged(event -> {
			if(event.isPrimaryButtonDown()) {
				initialPosX = event.getX();
				imageView.setX(initialPosX);
				//imageView.setX(event.getScreenX() - initialPosX);
				initialPosY = event.getY();
				imageView.setY(initialPosY);
			}
		});
		
		//**Use the midpoint formula to get the centerX position of imageView's x position (normally, x position is on its top-Left corner)
		pane.setOnMouseReleased(event -> {
			if(!event.isPrimaryButtonDown()) {
				//imageView.setX(initialPosX);
				//initialPosX = imageView.getX();
				
				//initialPosY = imageView.getY();
				System.out.printf("X Position: %.2f Y Position: %.2f MidpointX: %.2f%n", initialPosX, initialPosY, getImageMidpointX());
			}
		});
	}
	
	//Midpoint formula: (x_m, y_m) = ((x_1 + x_2) / 2), ((y_1 + y_2) / 2)
	public double getImageMidpointX() {
		double middleX = ((imageView.getFitWidth()) * 0.25);
		return middleX;
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
