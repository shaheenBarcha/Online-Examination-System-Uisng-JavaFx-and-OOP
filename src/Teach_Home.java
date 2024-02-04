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

public class Teach_Home extends Login
{
	Scene scene;
	Stage stage;
	
	@Override
	public void start(Stage s) throws Exception 
	{
		stage = new Stage();
		stage.setHeight(600);
		stage.setWidth(800);
		stage.setTitle("Teacher Home");
	
		Button pst = new Button("PST Online Exam");
		Button mvc = new Button("MVC Online Exam");
		Button oop = new Button("OOP Online Exam");
		Button b1 = new Button("Exams Scheduler");
		Button btnlogout = new Button("Logout");
		
		HBox btns = new HBox(20);
		btns.setAlignment(Pos.CENTER);
		btns.getChildren().addAll(pst,mvc,oop,b1);
		
		VBox btn = new VBox(20);
		btn.setAlignment(Pos.CENTER);
		btn.getChildren().addAll(btns,btnlogout);
	
		
		b1.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent event)
			{
				try {
					new Exams_Scheduler().start(new Stage());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				stage.hide();
			}
		});
		pst.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override
			public void handle(ActionEvent event) 
			{
				try {
					new Teach_PST().start(new Stage());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				stage.hide();
			}
		});
		
		mvc.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override
			public void handle(ActionEvent event) 
			{
				try {
					new Teach_MVC().start(new Stage());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				stage.hide();
			}
		});
		
		oop.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override
			public void handle(ActionEvent event) 
			{
				try {
					new Teach_OOP().start(new Stage());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				stage.hide();
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

		scene = new Scene(btn);
		
		stage.setScene(scene);
		stage.show();
	}
}
