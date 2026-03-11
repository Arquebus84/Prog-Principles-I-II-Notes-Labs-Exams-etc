package TestAnimation;

import javafx.application.Application;
import javafx.scene.shape.*;
import javafx.scene.input.*;

import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.Scene;
import javafx.stage.Stage;

//TODO: Add something to control a cube in an occupying space
public class GameController extends Application{
	
	@SuppressWarnings("exports")
	@Override
	public void start(Stage stage) {
		Rectangle player = new Rectangle(20, 20);
		player.setFill(Color.RED);
		player.setStroke(Color.BLACK);
		
		Rectangle obst1 = new Rectangle(45, 50);
		obst1.setFill(Color.BLACK);
				
		Pane pane = new Pane();
		pane.getChildren().add(player);
		pane.getChildren().add(obst1);
				
						
		Scene scene = new Scene(pane, 600, 500);
		player.setX(scene.getWidth() / 2);
		player.setY(scene.getHeight() / 2);
		obst1.setX(240);
		obst1.setY(150);
		
		stage.setTitle("Game_Test");
		stage.setScene(scene);
		stage.show();
		
		
		player.setOnKeyPressed(e ->{
			//System.out.println("Key Pressed: " + e.getCode());
			if(e.getCode() == KeyCode.W) {
				player.setY( (player.getY() > 0)? player.getY() - 10 : player.getY());
			}else if(e.getCode() == KeyCode.S) {
				player.setY( (player.getY() < scene.getHeight() - 20)? player.getY() + 10 : player.getY());
			}
			
			if(e.getCode() == KeyCode.D) {
				player.setX( (player.getX() < scene.getWidth() - 20)? player.getX() + 10 : player.getX());
			}else if(e.getCode() == KeyCode.A) {
				player.setX( (player.getX() > 0)? player.getX() - 10 : player.getX());
			}
			
			System.out.println("X: " + player.getX() + " Y: " + player.getY());
		});
		
		//Keep this here to allow the program to work
		player.requestFocus();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
