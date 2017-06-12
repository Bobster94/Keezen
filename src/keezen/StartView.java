package keezen;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;

public class StartView extends FlowPane{
	private Label lb;
	private String SpelerIp;
	private TextField tf;
	private Button bt;
	public StartView(){
		lb = new Label();
		bt = new Button("Connect");
		tf = new TextField();
		tf.setText("0.0.0.0");
		this.getChildren().addAll(tf,bt,lb);
		bt.setOnAction(e -> {
			SpelerIp = tf.getText();
			lb.setText(SpelerIp);

		});

	}






}
