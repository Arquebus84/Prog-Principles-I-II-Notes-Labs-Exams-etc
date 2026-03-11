package DefaultNotes;

import javafx.application.Application;
import javafx.geometry.Pos;

import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LabelLabeledButtons extends Application{

	/**
				javafx.scene.Node		
						△
						|
						|															extends Labeled
			javafx.scene.control.Labeled◁--------------------------------------javafx.scene.control.Label
		-alignment: ObjectProperty<Pos>										+Label()
		-contentDisplay: ObjectProperty<ContentDisplay>						+Label(text: String)
		-graphic: ObjectProperty<Node>										+Label(text: String, graphic: Node)
		-graphicTextGap: DoubleProperty								//graphic Node can be any property such as a shape, and image, or control
		-textFill: ObjectProperty<Paint>
		-text: StringProperty
		-underline: BooleanProperty
		-wrapText: BooleanProperty
				
	 */
	
	/*
	 * underline: Indicates whether text should be underlined.
	 * wrapText: Indicates whether text should be wrapped if the text exceeds the width.
	 * alignment: Specifies the alignment of the text and node in the labeled.
	 * contentDisplay: Specifies the position of the node relative to the text using the constants TOP, BOTTOM, 
		LEFT, and RIGHT defined in ContentDisplay is a text for the labeled.
	 * text: A graphic for the labeled.
	 * graphicTextGap: The gap between the graphic and the text.
	 * textFill: The paint used to fill the text.
	 */
	
	/**
				extends Labeled
			java.scene.control.ButtonBase------------▷javafx.scene.control.Labeled--------▷javafx.scene.control
						△
						|
			javafx.scene.control.Button		extends ButtonBase
		+Button()
		+Button(text: String)
		+Button(text: String, graphic: Node)
	 */
	
	
	@SuppressWarnings("exports")
	@Override
	public void start(Stage stage) {
		Text txt = new Text("TextExample");
		txt.setStyle("-fx-font: 25px \"Times New Roman\";");
		
		Label label = new Label("Times New Roman");
		label.setStyle("-fx-font: 25px \"Times New Roman\";");
		
		Button leftButton = new Button("Move Left");	
		leftButton.setStyle("-fx-font: 30px \"Times New Roman\";");
		Button rightButton = new Button("Move Right");
		rightButton.setStyle("-fx-font: 30px \"Times New Roman\";");
		
		HBox hBox = new HBox();
		hBox.getChildren().addAll(leftButton, rightButton);
		hBox.setSpacing(200);
		hBox.setAlignment(Pos.CENTER);
		
		Pane pane = new Pane();
		pane.getChildren().addAll(txt, hBox);
		
		BorderPane bPane = new BorderPane();
		
		//pane.setCenter(label);
		bPane.setCenter(txt);
		bPane.setBottom(hBox);
		
		Scene scene = new Scene(bPane, 600, 400);
		
		stage.setScene(scene);
		stage.setTitle("LabelAndButtons");
		stage.show();
		
		leftButton.setOnAction(e ->{
			//label.setTranslateX(label.getTranslateX() - 10);
			txt.setTranslateX(txt.getX() - 10);
			txt.setX(txt.getX() - 10);
		});
		
		rightButton.setOnAction(e ->{
			//label.setTranslateX(label.getTranslateX() + 10);
			txt.setX(txt.getX() + 10);
			txt.setTranslateX(txt.getX() + 10);
		});
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
