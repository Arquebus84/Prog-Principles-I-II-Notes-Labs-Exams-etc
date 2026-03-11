
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class AJavaFXStructureSwingAWT extends Application{
	//Swing and AWT are replaced by the JavaFX platform for developing GUI applications
	
	/**
		(AWT) Abstract Windows Toolkit: GUI class were bundled in a library called AWT; which is the set of components for developing
			simple graphics applications that was in use before the introduction of Swing components
	 */
	
	/**
	 	Swing: Replaces the AWT user-interface components b/c Swing is a more robust, versatile, and flexible library. It is
	 		a platform for developing GUI platforms, but will be replaced by JavaFX.
	 */
	
	/**
		JavaFX: A platform for creating GUI programming in Java; incorporates modern GUI technology to create rich Internet applications
			- Provides multi-touch support for touch-enabled devices such as smart phones
			- Provides built-in 2D, 3D, animation support, and video and audio playback.
	 */
	
	/**
		Important NOTE: When implementing the javafx application and creating a new scene window, you'll get a runtime error stating:
			"Error: JavaFX runtime components are missing, and are required to run this application"
			
			**In order to prevent this go under Run>>Run Configurations>>Arguments>>VM Arguments	paste this:
			
			--module-path "C:\Users\matte\Eclipse-JavaFX-SDK\javafx-sdk-24\lib" --add-modules=javafx.controls,javafx.fxml
			
			This will allow the program to run and open the application
	 */
	
	/***
		EXTRA-IMPORTANT NOTE:
			*To avoid implementing the module-path statement in VM Args, you can create a new project, and check the box for 
				creating a info-module.java file. Give the module file a name, and write something similar:
				
						module moduleJavaFX {				//The name you give to your module-info.java file
							requires javafx.base;
							requires javafx.controls;
							requires javafx.graphics;
							requires javafx.media;
							exports Chapter15Test;			//exports the package name that you create (Doesn't work on default package)
						}
}
	 */
	
	
	
	//Example with only one Stage
	/**public void start(Stage primaryStage1) {
		Button button = new Button("Click Here");
		Scene scene = new Scene(button, 400, 200);
		primaryStage1.setScene(scene);
		primaryStage1.setTitle("JavaFXStructureSwingAWT");
		primaryStage1.show();
	}*/
	
	//Example 2 with multiple stages
	public void start(Stage primaryStage1) {
		Button button = new Button("Click Here");
		Scene scene = new Scene(button, 400, 200);
		primaryStage1.setScene(scene);
		primaryStage1.setTitle("JavaFXStructureSwingAWT");
		primaryStage1.show();
		
		Stage stage2 = new Stage();
		stage2.setTitle("New Stage");
		stage2.setScene(new Scene(new Button("Click Right Here"), 400, 200));
		stage2.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
