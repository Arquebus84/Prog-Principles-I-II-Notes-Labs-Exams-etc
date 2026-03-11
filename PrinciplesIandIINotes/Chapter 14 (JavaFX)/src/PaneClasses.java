import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class PaneClasses extends Application{
	//All of the Pane classes originate from javafx.scene.layout
	
	
	//FlowPane
	/**
			javafx.scene.layout.FlowPane
		-alignment: ObjectProperty
		-orientation: ObjectProperty
		-hgap: DoubleProperty							//Horizontal gap between nodes
		-vgap: DoubleProperty							//Vertical gap between nodes
		+FlowPane()
		+FlowPane(hgap: double, vgap: double)
		+FlowPane(orientation: ObjectProperty)
		+FlowPane(orientation: ObjectProperty, hgap: double, vgap: double)
		+setHgap(HgapSize: double): void
		+getHgap(): DoubleProperty
		+setVgap(VgapSize: double): void
		+getVgap(): DoubleProperty
	 */
	//Extra features in the FlowPane class:
	/*
			remove nodes by using the remove key:
				* node.getChildren().remove(node1);				//removes one particular node
				* node.getChildren().removeAll(node1, node2);	//removes more than one node
			add nodes:
				* node.getChildren().add(node1);
				* node.getChildren().addAll(node1, node2);
	 */
	
	
	//GridPane
	/**NOTE: when using gridPane.add() for the nodes, the column is first and the row is second. Example: pane.add(node, 1, 0) is in column 2, row 1*/
	
	/**	NOTE: some setter and getter methods are omitted from this UML

			javafx.scene.layout.GridPane
		-alignment: ObjectProperty
		-gridLinesVisible: BooleanProperty
		-hgap: DoubleProperty
		-vgap: DoubleProperty
		+GridPane()
		+add(child: Node, columnIndex: int, rowIndex: int): void
		+addColumn(columnIndex: int, children: Node...): void
		+addRow(rowIndex: int, children: Node...): void				//Can add multiple different nodes on a specified row
		+getColumnIndex(child: Node): int							(Static)
		+setColumnIndex(child: Node, columnIndex: int): void		(Static)
		+getRowIndex(child: Node): int								(Static)
		+setRowIndex(child: Node, rowIndex: int): void				(Static)
		+setHalighnment(child: Node, value: HPos): void				(Static)
		+setValighnment(child: Node, value: VPos): void				(Static)
		+setAlignment(pos: Pos): void								(Static) Useful method for realigning the entire grid using Pos class
	 */
	//Extra features in GridPane class
	/*
			add node in specified row and column (NOTE: In the case of GridPane, the column comes first instead of the row):
				* pane.add(node, 1, 0); 	//adds a node in second row, first column
	 */
	
	//BorderPane
	/**
			javafx.scene.layout.BorderPane
		-top: ObjectProperty
		-right: ObjectProperty
		-bottom: ObjectProperty
		-left: ObjectProperty
		-center: ObjectProperty
		+BorderPane()
		+BorderPane(node: Node)
		+setAlignment(child: Node, pos: Pos)
	 */
	
	
	//HBox and VBox (Note: For both of these, the setters and getter methods were omitted)
	
	//HBox places the nodes in one row, and VBox places each nodes in one column
	
	/**
			javafx.scene.layout.HBox
		-alignment: ObjectProperty
		-fillHeight: BooleanProperty
		-spacing: DoubleProperty
		+HBox()
		+HBox(spacing: double)
		+setMargin(node: Node, value: Insets): void		(Static)
	 */
	
	/**
			javafx.scene.layout.VBox
		-alignment: ObjectProperty
		-fillWidth: BooleanProperty
		-spacing: DoubleProperty
		+VBox()
		+VBox(spacing: double)
		+setMargin(node: Node, value: Insets): void		(Static)
	 */
	
	//Examples:
	public void start(Stage stage) {
		FlowPane fplane = new FlowPane();
		
		stage.setScene(new Scene(fplane, 200, 200));
		stage.show();
	}
	
	
	public static void main(String[] args) {	
		
		launch(args);
	}
}
