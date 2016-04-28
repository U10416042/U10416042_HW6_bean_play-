import javafx.application.Application; 
import javafx.scene.Scene; 
import javafx.stage.Stage; 
import javafx.scene.shape.*; 
import javafx.scene.paint.*; 
import javafx.scene.layout.*; 
import javafx.scene.control.*; 
import javafx.scene.Group; 
 
public class BeanGame extends Application{ 
	public void start(Stage primaryStage){ 
		//Pane
 		Group group = new Group(); 
 		 
 		//Trigger Start
 		Button start = new Button("Start"); 
 		 
 		//Button Status
 		start.setMinSize(25, 25); 
 		start.setTranslateX(231); 
 		start.setTranslateY(0); 
 		group.getChildren().add(start); 

		Line l1 = new Line(235, 30, 235, 80); 
 		group.getChildren().add(l1); 

		Line l2 = new Line(265, 30, 265, 80); 
 		group.getChildren().add(l2); 

		Line l3 = new Line(235, 80, 50, 250); 
 		group.getChildren().add(l3);

		Line l4 = new Line(265, 80, 450, 250); 
 		group.getChildren().add(l4);  

		Line l5 = new Line(50, 250, 50, 400); 
 		group.getChildren().add(l5); 
 		 
 		Line l6 = new Line(450, 250, 450, 400); 
 		group.getChildren().add(l6); 

		Line l7 = new Line(50, 400, 450, 400); 
 		group.getChildren().add(l7);

		Line l8 = new Line(130, 350, 130, 400); 
 		group.getChildren().add(l8); 
 		 
 		Line l9 = new Line(210, 350, 210, 400); 
 		group.getChildren().add(l9); 
 		 
 		Line l10 = new Line(290, 350, 290, 400); 
		group.getChildren().add(l10); 
 		 
 		Line l11 = new Line(370, 350, 370, 400); 
 		group.getChildren().add(l11);  

		Circle c1 = new Circle(250, 157, 8); 
 		group.getChildren().add(c1); 
 		 
 		Circle c2 = new Circle(210, 212, 8); 
 		group.getChildren().add(c2); 
 		 
		Circle c3 = new Circle(290, 212, 8); 
 		group.getChildren().add(c3); 
 		 
 		Circle c4 = new Circle(170, 267, 8); 
 		group.getChildren().add(c4); 
 		 
 		Circle c5 = new Circle(250, 267, 8); 
 		group.getChildren().add(c5); 
 		 
 		Circle c6 = new Circle(330, 267, 8); 
 		group.getChildren().add(c6); 

		Circle c7 = new Circle(130, 322, 8); 
 		group.getChildren().add(c7); 
 		 
		Circle c8 = new Circle(210, 322, 8); 
 		group.getChildren().add(c8); 
 		 
 		Circle c9 = new Circle(290, 322, 8); 
 		group.getChildren().add(c9); 
 		 
 		Circle c10 = new Circle(370, 322, 8); 
 		group.getChildren().add(c10);

 		Circle c11 = new Circle(250, 60, 10); 
 		group.getChildren().add(c11);

 		//Pane size 
 		Scene scene = new Scene(group, 500, 500); 
 		 
 		//Basic
 		primaryStage.setTitle("Bean Game"); 
 		primaryStage.setScene(scene); 
 		primaryStage.setResizable(false); 
 		primaryStage.show(); 
 	} 
} 
