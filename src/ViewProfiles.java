import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ViewProfiles extends Login
{
	Scene scene;
	Stage stage;
	
	@Override
	public void start(Stage s) throws Exception 
	{
		stage = new Stage();
		stage.setHeight(600);
		stage.setWidth(800);
		stage.setTitle("View Profiles");
	
		Button b1 = new Button("Teacher");
		b1.setPrefSize(100, 20);
		Button b2 = new Button("Student");
		b2.setPrefSize(100, 20);
		Button b3 = new Button("MyProfile");
		b3.setPrefSize(100, 20);
		Button btnlogout = new Button("Logout");
		btnlogout.setPrefSize(100, 20);
		HBox btns = new HBox(20);
		btns.setAlignment(Pos.CENTER);
		btns.getChildren().addAll(b1,b2,b3);
		
		VBox btn = new VBox(20);
		btn.setAlignment(Pos.CENTER);
		btn.getChildren().addAll(btns,btnlogout);
	
		
		

		scene = new Scene(btn);
		
		stage.setScene(scene);
		stage.show();
	}
}
