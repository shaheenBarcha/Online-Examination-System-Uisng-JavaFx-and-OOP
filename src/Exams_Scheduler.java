import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Exams_Scheduler extends Home
{
	Scene scene;
	Stage stage;
	
	private static String examDates = "dates.txt";
	String dates = "";
	
	public void start(Stage s) throws Exception 
	{
		stage = new Stage();
		stage.setHeight(600);
		stage.setWidth(800);
		stage.setTitle("Exams Scheduler");
		
		Label header = new Label("Exams Scheduler");	
		header.setFont(Font.font("Arial",FontWeight.BOLD,20));
		
		Label l1 = new Label("Pakistan Studies");
		DatePicker d1 = new DatePicker();
		
		Label l2 = new Label("Multivariate Calculus");
		DatePicker d2 = new DatePicker();
		
		Label l3 = new Label("Object Oriented Programming");
		DatePicker d3 = new DatePicker();
		
		Button btnback = new Button("Back");
		Button btnsubmit = new Button("Submit");
		HBox btns = new HBox(10);
		btns.getChildren().addAll(btnsubmit,btnback);
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(20);
		grid.setVgap(20);
	
		grid.add(header, 0, 0);
		
		grid.add(l1, 0, 1);
		grid.add(d1, 1, 1);
		
		grid.add(l2, 0, 2);
		grid.add(d2, 1, 2);
		
		grid.add(l3, 0, 3);
		grid.add(d3, 1, 3);
		
		grid.add(btns, 1, 4);
		
		Filing cnn = new Filing();
		
		btnsubmit.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent arg0)
			{
				dates += d1.getValue()+"\n";
				dates += d2.getValue()+"\n";
				dates += d3.getValue()+"\n";
				
				try
				{
					cnn.WriteToDataFile(dates,getExamDates());
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
				
				Alert msg= new Alert(AlertType.INFORMATION);
				msg.setTitle("Exams Date Submitted");
				msg.setHeaderText("Exams Date Submitted Successfully");
				msg.show();
			}
		});

		btnback.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				try {
					new Teach_Home().start(new Stage());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				stage.hide();
				
			}
		});
		scene=new Scene(grid);
		stage.setScene(scene);
		stage.show();
	}

	public static String getExamDates() {
		return examDates;
	}

	public static void setExamDates(String examDates) {
		Exams_Scheduler.examDates = examDates;
	}
}