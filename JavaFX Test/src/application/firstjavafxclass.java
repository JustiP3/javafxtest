package application;



import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;

import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class firstjavafxclass extends Application {
	Label lb_text;
	Button btn_click;



	@Override
	public void start(Stage arg0) throws Exception {
		lb_text = new Label("Hello World!");
		btn_click = new Button("Clicky Click!");

		btn_click.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				lb_text.setText("New Text!");
			}
		});

		VBox root = new VBox();   // root is a vbox

		root.getChildren().add(lb_text);
		root.getChildren().add(btn_click);
		Scene myScene = new Scene(root, 300, 300);  // create new scene w/ vbox w/ text

		arg0.setScene(myScene);
		arg0.show();  // arg0 is my stage (a variable)


	}

}
