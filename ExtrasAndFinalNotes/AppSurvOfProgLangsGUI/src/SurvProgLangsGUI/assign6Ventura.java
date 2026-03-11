package SurvProgLangsGUI;

import javafx.animation.Interpolator;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.NodeOrientation;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.Scene;

public class assign6Ventura extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	static final int WIDTH = 600;
	static final int HEIGHT = 1000;
	
	Scene scene;
	Pane animPane;
	Label nameHeader, planetLabel_0, planetLabel_1, planetLabel_2, playLabel, speedHeader;
	TextField planetField_0, planetField_1, planetField_2;
	Circle planet_0, planet_1, planet_2;
	Ellipse earth_path, moon_path;
	Slider slider;
	PathTransition earth_transition, moon_transition, sizePlanet_0;
	
	@SuppressWarnings("exports")
	@Override
	public void start(Stage stage){		
		BorderPane BPane = new BorderPane();
		animPane = new StackPane();
		StackPane earthPane = new StackPane();
		StackPane moonPane = new StackPane();
		
		VBox v_PaneMain = new VBox(), v_PaneName = new VBox(), v_playButtonPane = new VBox();
		HBox slider_Pane = new HBox();
		GridPane name_Pane = new GridPane();
		v_PaneMain.setAlignment(Pos.CENTER);
		v_playButtonPane.setAlignment(Pos.CENTER);
		
		//Animation
		earth_transition = new PathTransition();
		moon_transition = new PathTransition();
		
		//Fonts
		Font labelFont = Font.font("Times New Roman", 25);
		Font planetFont = Font.font("Times New Roman", 18);
		
		nameHeader = new Label("Enter Planet Name Here"); nameHeader.setFont(labelFont);
		planetLabel_0 = new Label("Planet 1"); planetLabel_0.setFont(planetFont);
		planetLabel_1 = new Label("Planet 2"); planetLabel_1.setFont(planetFont);
		planetLabel_2 = new Label("Planet 3"); planetLabel_2.setFont(planetFont);
		playLabel = new Label("Planet Gravitational Field Simulator"); playLabel.setFont(labelFont);
		speedHeader = new Label("Field Size"); speedHeader.setFont(Font.font("Times New Roman", 20));
		
		//Text Field contains name and button to add name on the ball
		planetField_0 = new TextField();
		planetField_1 = new TextField();
		planetField_2 = new TextField();	
		Button planetButton_0 = new Button("Add Name"), planetButton_1 = new Button("Add Name"), planetButton_2 = new Button("Add Name");
		
		name_Pane.add(planetField_0, 0, 0); name_Pane.add(planetField_1, 0, 1); name_Pane.add(planetField_2, 0, 2);
		name_Pane.add(planetButton_0, 1, 0); name_Pane.add(planetButton_1, 1, 1); name_Pane.add(planetButton_2, 1, 2);
		
		planetButton_0.setOnAction(e->{	planetLabel_0.setText(planetField_0.getCharacters().toString()); });
		planetButton_1.setOnAction(e->{	planetLabel_1.setText(planetField_1.getCharacters().toString()); });
		planetButton_2.setOnAction(e->{	planetLabel_2.setText(planetField_2.getCharacters().toString()); });
		
		slider = new Slider();
		//slide.setDisable(true);
		slider.setMaxWidth(200);
		slider.valueProperty().addListener((obs, oldVal, newVal)->{
			planet_0.setRadius(newVal.doubleValue());
		});
		
		slider_Pane.getChildren().addAll(speedHeader, slider);
		slider_Pane.setAlignment(Pos.CENTER);
		
		planet_0 = new Circle(); planet_1 = new Circle(); planet_2 = new Circle();
		planet_0.setFill(Color.YELLOW); planet_1.setFill(Color.LIGHTSKYBLUE); planet_2.setFill(Color.LIGHTGREY);
		planet_0.setRadius(2); planet_1.setRadius(24); planet_2.setRadius(16);
		planet_0.setAccessibleText(planetLabel_0.toString()); 
		planet_1.setAccessibleText(planetLabel_1.toString()); 
		planet_2.setAccessibleText(planetLabel_2.toString());
		
		earth_path = new Ellipse(planet_0.getCenterX(), planet_0.getCenterY(), 220, 100);
		earth_path.setFill(Color.TRANSPARENT);
		//earth_path.setStroke(Color.BLACK);
		earth_path.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
		
		moon_path = new Ellipse(planet_1.getCenterX(), planet_1.getCenterY(), 80, 50);
		moon_path.setFill(Color.TRANSPARENT);
		//moon_path.setStroke(Color.BLACK);
		moon_path.setNodeOrientation(NodeOrientation.LEFT_TO_RIGHT);
		
		//Set the Sun to the Center
		planet_0.setCenterX(earth_path.getCenterX()); planet_0.setCenterY(earth_path.getCenterY());
		
		//Set up the StackPanes
		moonPane.getChildren().addAll(planet_2, planetLabel_2);
		earthPane.getChildren().addAll(planet_1, moonPane, moon_path, planetLabel_1);
		
		moonPane.setTranslateX(moon_path.getCenterX() + moon_path.getRadiusX());
		moonPane.setTranslateY(moon_path.getCenterY());
		earthPane.setTranslateX(earth_path.getCenterX() - earth_path.getRadiusX());
		earthPane.setTranslateY(earth_path.getCenterY());
		
		//Make button to control the pause/play animation
		Button play_Button = new Button(">");
		
		v_playButtonPane.getChildren().addAll(playLabel, play_Button);
		
		IncreaseRate();
		
		play_Button.setOnAction(e->{
			if(play_Button.getText() == ">") {
				play_Button.setText("||");
				earth_transition.play();
				moon_transition.play();
			}else if(play_Button.getText() == "||") {
				play_Button.setText(">");
				earth_transition.pause();
				moon_transition.pause();
			}
		});
		
		play_Button.setPrefSize(125, 46);
		play_Button.setAlignment(Pos.CENTER);
		
		//Set the vertical pane
		v_PaneName.getChildren().addAll(nameHeader, name_Pane);
		v_PaneMain.getChildren().addAll(v_PaneName, v_playButtonPane, slider_Pane);
		
		//Add circle pane to the Animation Pane
		animPane.getChildren().addAll(earth_path, planet_0, planetLabel_0, earthPane);
		
		//Setup the BorderPane
		BPane.setCenter(animPane);
		BPane.setTop(v_PaneMain);
		
		scene = new Scene(BPane, HEIGHT, WIDTH);
		
		stage.setScene(scene);
		stage.setResizable(false);
		stage.setTitle("Assign6Ventura");
		stage.show();
		
		//Earth transition
		earth_transition.setDuration(Duration.millis(100000));
		earth_transition.setCycleCount(Timeline.INDEFINITE); // Loop
		earth_transition.setInterpolator(Interpolator.LINEAR); // Loop smoothly
		earth_transition.setNode(earthPane);
		earth_transition.setPath(earth_path);
		//Moon transition
		moon_transition.setDuration(Duration.millis(100000));
		moon_transition.setCycleCount(Timeline.INDEFINITE); // Loop
		moon_transition.setInterpolator(Interpolator.LINEAR); // Loop smoothly
		moon_transition.setNode(moonPane);
		moon_transition.setPath(moon_path);
		
		sizePlanet_0 = new PathTransition();
		sizePlanet_0.setInterpolator(Interpolator.LINEAR);
		
	}
	
	public void IncreaseRate() {
		slider.setOnMouseClicked(e->{
			earth_transition.setRate(slider.getValue());
			moon_transition.setRate(slider.getValue());
			System.out.println(slider.getValue());
		});
		slider.setOnMouseDragged(ex->{
			earth_transition.setRate(slider.getValue());
			moon_transition.setRate(slider.getValue());
		});
	}

}
