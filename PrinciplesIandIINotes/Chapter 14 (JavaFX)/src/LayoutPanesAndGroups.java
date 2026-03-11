
public class LayoutPanesAndGroups {
	//JavaFX provides many types of panes for automatically laying out nodes in a desired location and size
	
	/**
			Class	|		Description
		Pane		|	Base class for layout panes; contains getChildren() method for returning a list of nodes in the pane
					|
		StackPane	|	Places the nodes on top of each other in the center of the pane
					|
		FlowPane	|	Places the nodes row-by-row horizontally or column-by-column vertically 
					|
		GridPane	|	Places the nodes in the cells in a 2D grid
					|
		BorderPane	|	Places the nodes in the top, right, bottom, left, and center regions
					|
		HBox		|	Places the nodes in a single row
					|
		VBox		|	Places the nodes in a single column
	 */
	
	//Example:
	/*
		* Add two buttons in a Pane object called pane:
			pane.addAll(bt1, bt2);
	 */
	
	/**
		NOTE: When adding nodes into a pane object use the statement:
			Pane.getChildren().add(nodeVariable);	//Note that the Pane object can be of any subclass of Pane
	 */
}
