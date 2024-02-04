import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Home
{
	Scene scene;
	Stage stage;
	
	public void start(Stage s) throws Exception 
	{
		stage = new Stage();
		stage.setHeight(600);
		stage.setWidth(800);
		stage.setTitle("Admin Home");
		
		Button b1 = new Button("Resgister Student");
		Button b2 = new Button("Register Teacher");
		Button b3 = new Button("Exams Schedule");
		Button b4 = new Button("View Profiles");
		 
		Button btnlogout = new Button("Logout");
		
		VBox v = new VBox(20);
		v.setAlignment(Pos.CENTER);
		HBox h = new HBox(15);
		h.setAlignment(Pos.CENTER);
		h.getChildren().addAll(b1,b2,b3,b4);
		v.getChildren().addAll(h,btnlogout);
		
		b1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) 
			{
				try {
					new Std_reg().start(new Stage());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				stage.hide();
			}
		});
		
		b2.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override
			public void handle(ActionEvent event) 
			{
				try {
					new Teacher_reg().start(new Stage());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				stage.hide();
			}
		});
		b3.setOnAction(new EventHandler<ActionEvent>() 
		{	
			@Override
			public void handle(ActionEvent event) 
			{
				try
				{
					new Teach_Schedule().start(new Stage());
					stage.hide();
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		b4.setOnAction(new EventHandler<ActionEvent>() 
		{	
			@Override
			public void handle(ActionEvent event) 
			{
				try
				{
					new ViewProfiles().start(new Stage());
					stage.hide();
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		
		btnlogout.setOnAction(new EventHandler<ActionEvent>() 
		{	
			@Override
			public void handle(ActionEvent event) 
			{
				try
				{
					new Login().start(new Stage());
					stage.hide();
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
				
				Alert msg= new Alert(AlertType.INFORMATION);
				msg.setTitle("Logged Out");
				msg.setHeaderText("Logged Out Successfully");
				msg.show();
			}
		});
		scene = new Scene(v);
		stage.setScene(scene);
		stage.show();	
		}
}
