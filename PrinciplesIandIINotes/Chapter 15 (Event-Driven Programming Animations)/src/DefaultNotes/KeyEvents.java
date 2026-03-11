package DefaultNotes;

import javafx.application.Application;

import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class KeyEvents extends Application{

	/**
			javafx.scene.input.KeyEvent
		+getCharacter(): String
		+getCode(): KeyCode
		+getText(): String
		+isAltDown(): boolean
		+isControlDown(): boolean
		+isMetaDown(): boolean
		+isShiftDown(): boolean
	 */
	
	/**
		KeyCode constants for when you use +getCode(). For example:		input.getCode(KeyCode.W)	//returns KeyCode W
		
		Constant		|	Description
			HOME		|		Home key
			END			|		End key
			PAGE_UP		|		PgUp key
			PAGE_DOWN	|		PgDn key
			UP			|		Up-arrow key
			DOWN		|		Down-arrow key
			LEFT		|		Left-arrow key
			RIGHT		|		Right-arrow key
			ESCAPE		|		Esc key
			TAB			|		Tab key
			CONTROL		|		Ctrl key
			SHIFT		|		Shift key
			BACK_SPACE	|		Backspace key
			CAPS		|		CapsLk key
			NUM_LOCK	|		Num Lock key
			ENTER		|		Enter key
			UNDEFINED	|		Keycode unknown
			F1-F12		|		F1 to F12 function keys
			0-9			|		0 to 9 number keys
			A-Z			|		A to Z keyboard keys
		
	 */
	
	@SuppressWarnings("exports")
	@Override
	public void start(Stage stage) {
		 // Code to create and display pane omitted
	    BorderPane pane = new BorderPane();
	    Scene scene = new Scene(pane, 200, 250);
	    
	    
	    pane.setOnKeyPressed(e ->
	      System.out.println("Key pressed " + e.getCode() + " "));
//	    pane.setOnKeyTyped(e ->
//	      System.out.println("Key typed " + e.getCode()));
	    
	    //Example: Moving text up/down/left/right depending on the arrow keys
	    Text txt = new Text("TEXT NODE");
	    
	    txt.setOnKeyPressed(e ->{
	    	switch(e.getCode()) {
	    		case UP: txt.setTranslateY(txt.getTranslateY() - 10); break;		//Up is negative similar to godot
	    		case DOWN: txt.setTranslateY(txt.getTranslateY() + 10); break;
	    		case RIGHT: txt.setTranslateX(txt.getTranslateX() + 10); break;
	    		case LEFT: txt.setTranslateX(txt.getTranslateX() - 10); break;
	    		default:
	    			if((e.getText()).length() > 0) {	//Changes the written text into any of the other keys (except for arrow keys)
	    				txt.setText(e.getText());
	    			}
	    	}
	    });
	    
	    //pane.getChildren().add(txt);
	    pane.setCenter(txt);
	    
	    stage.setTitle("TestFX"); // Set the stage title
	    stage.setScene(scene); // Place the scene in the stage
	    stage.show(); // Display the stage
	    
	    //pane is focused to receive any key input
	    //pane.requestFocus();	/**NOTE: keep this requestFocus() method after stage.show in order for the KeyEvents to work*/
	    txt.requestFocus();
	
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
