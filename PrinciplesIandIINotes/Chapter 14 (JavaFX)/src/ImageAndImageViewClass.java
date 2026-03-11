
import java.io.File;
import java.net.MalformedURLException;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.*;
import javafx.scene.layout.GridPane;


public class ImageAndImageViewClass extends Application{

	/**
			javafx.scene.image.Image
		-error: ReadOnlyBooleanProperty
		-height: ReadOnlyDoubleProperty
		-width: ReadOnlyDoubleProperty
		-progress: ReadOnlyDoubleProperty
		+Image(filenameOrURL: String)		//Requires image address that you've copied from the web
		
		+Image(filenameOrURL: String, requestedWidth: double, requestedHeight: double, preserveRatio: boolean, smooth: boolean) //Resize image
	 */
	
	/**
			javafx.scene.image.ImageView
		-fitHeight: DoubleProperty
		-fitWidth: DoubleProperty
		-x: DoubleProperty
		-y: DoubleProperty
		-image: ObjectProperty
		+ImageView()
		+ImageView(image: Image)
		+ImageView(filenameOrURL: String)
	 */
	
	public void start(Stage primaryStage) {
		
		GridPane pane = new GridPane();
		
		/**Using image address for image: https://3dstudio.co/wp-content/uploads/2022/02/different-level-of-detail.jpg*/
		Image imageLOD = new Image("https://3dstudio.co/wp-content/uploads/2022/02/different-level-of-detail.jpg");
		ImageView LOD_View = new ImageView(imageLOD);
		LOD_View.setFitWidth(300);
		LOD_View.setFitHeight(200);
		LOD_View.setTranslateX(-200);
		
		//Using .png from files requires more work:
		File fileImage = new File("C:\\Users\\matte\\OneDrive\\Pictures\\LinearAlgebraVector.png");
		Image imageVector;
		ImageView imageView = new ImageView();
		
		//Surround in try/catch in case the image does not show
		try {
			imageVector = new Image(fileImage.toURI().toURL().toString()); /**Use this line of code to convert file to URL from URI*/
			
			imageView.setImage(imageVector);
			imageView.setFitWidth(300);
			imageView.setFitHeight(200);
			imageView.setTranslateX(200);
			
		} catch (MalformedURLException e) {
			System.out.println("Image not applicable");
		}
		
		pane.getChildren().add(imageView);
		pane.getChildren().add(LOD_View);
		pane.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(pane, 600, 400);
		primaryStage.setTitle("ImageAndImageView");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
