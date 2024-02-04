import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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

public class Std_Home extends Login
{
	Scene scene;
	Stage stage;
	
	public void start(Stage s) throws Exception 
	{
		stage = new Stage();
		stage.setHeight(600);
		stage.setWidth(800);
		stage.setTitle("Student Home");
	
		Button pst = new Button("PST Exam");
		Button mvc = new Button("MVC Exam");
		Button oop = new Button("OOP Exam");
		Button b1 = new Button("Exams Schedule");
		Button btnlogout = new Button("Logout");
		
		HBox btns = new HBox(20);
		btns.setAlignment(Pos.CENTER);
		btns.getChildren().addAll(pst,mvc,oop,b1);
		
		VBox btn = new VBox(20);
		btn.setAlignment(Pos.CENTER);
		btn.getChildren().addAll(btns,btnlogout);
		
		Filing cnn = new Filing();
		cnn.read_dates(Exams_Scheduler.getExamDates());
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate now = LocalDate.now();
		
		pst.setOnAction(new EventHandler<ActionEvent>() 
		{
				@Override
				public void handle(ActionEvent event) 
				{
					if (dtf.format(now).equals(cnn.PST))
					{
						try {
							new Quiz_PST().start(new Stage());
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						stage.hide();
					}
					else
					{
						Alert msg= new Alert(AlertType.INFORMATION);
						msg.setTitle("Exam Date");
						msg.setHeaderText("Please visit on exam date: "+cnn.PST);
						msg.show();
					}
				}
			
		});
		
		mvc.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override
			public void handle(ActionEvent event) 
			{
				if (dtf.format(now).equals(cnn.MVC))
				{
					try {
						new Quiz_MVC().start(new Stage());
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					stage.hide();
				}
				else
				{
					Alert msg= new Alert(AlertType.INFORMATION);
					msg.setTitle("Exam Date");
					msg.setHeaderText("Please visit on exam date: "+cnn.MVC);
					msg.show();
				}
			}
		});
		
		oop.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override
			public void handle(ActionEvent event) 
			{
				if (dtf.format(now).equals(cnn.OOP))
				{
					try {
						new Quiz_OOP().start(new Stage());
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					stage.hide();
				}
				else
				{
					Alert msg= new Alert(AlertType.INFORMATION);
					msg.setTitle("Exam Date");
					msg.setHeaderText("Please visit on exam date: "+cnn.OOP);
					msg.show();
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
		
		b1.setOnAction(new EventHandler<ActionEvent>() 
		{	
			@Override
			public void handle(ActionEvent event) 
			{
				try
				{
					new Std_Schedule().start(new Stage());
					stage.hide();
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		
		scene = new Scene(btn);
		
		stage.setScene(scene);
		stage.show();
	}
}
