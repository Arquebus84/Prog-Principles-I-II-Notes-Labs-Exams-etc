package PaneClassesExamples;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
public class HBoxandVBox extends Application{

	@Override
	public void start(Stage primaryStage) {
		// Create a border pane 
	    BorderPane pane = new BorderPane();

	    // Place nodes in the pane
	    pane.setTop(getHBox()); 
	    pane.setLeft(getVBox());
	    
	    // Create a scene and place it in the stage
	    Scene scene = new Scene(pane);
	    primaryStage.setTitle("ShowHBoxVBox"); // Set the stage title
	    primaryStage.setScene(scene); // Place the scene in the stage
	    primaryStage.show(); // Display the stage
	}
	
	private HBox getHBox() {
	    HBox hBox = new HBox(15); // Create an HBox with 15px spacing
	    hBox.setPadding(new Insets(15, 15, 15, 15));
	    hBox.setStyle("-fx-background-color: gold");
	    hBox.getChildren().add(new Button("Computer Science"));
	    hBox.getChildren().add(new Button("Chemistry"));
	    
	    /**NOTE: This is a copied image address from the web from the HTML file path: "C:\Users\matte\HTML_Projects\WebTest.html"*/
	    ImageView imageView = new ImageView(new Image("file:///C:/Users/matte/OneDrive/Pictures/CubeWireFrame.png", 400, 250, false, false));
	    //Change the image size
	    imageView.resize(10, 20);
	    
	    hBox.getChildren().add(imageView);
	    return hBox;
	  }
	  
	  private VBox getVBox() {
	    VBox vBox = new VBox(15); // Create a VBox with 15px spacing
	    vBox.setPadding(new Insets(15, 5, 5, 5));
	    vBox.getChildren().add(new Label("Courses"));
	    
	    Label[] courses = {new Label("CSCI 1301"), new Label("CSCI 1302"), 
	        new Label("CSCI 2410"), new Label("CSCI 3720")};

	    for (Label course: courses) {
	      VBox.setMargin(course, new Insets(0, 0, 0, 15));
	      vBox.getChildren().add(course);
	    }
	    
	    return vBox;
	  }
	
	public static void main(String[] args) {
		launch(args);
	}
}
