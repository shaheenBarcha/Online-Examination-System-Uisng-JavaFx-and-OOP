import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Std_Schedule
{
	Scene scene;
	Stage stage;
	
	public void start(Stage s) throws Exception 
	{
		stage = new Stage();
		stage.setHeight(600);
		stage.setWidth(800);
		stage.setTitle("Exams Schedule");
		
		Filing cnn = new Filing();
		cnn.read_dates(Exams_Scheduler.getExamDates());
		
		Label header = new Label("Exams Schedule");	
		header.setFont(Font.font("Arial",FontWeight.BOLD,20));
		
		Label pst = new Label("Pakistan Studies");
		Label pstdate =  new Label(cnn.PST);
		
		Label mvc = new Label("Multivariate Calculus");
		Label mvcdate =  new Label(cnn.MVC);
		
		Label oop = new Label("Multivariate Calculus");
		Label oopdate =  new Label(cnn.OOP);
		
		Button btnback = new Button("Back");
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setVgap(20);
		grid.setHgap(20);
		
		grid.add(header, 0, 0);
		
		grid.add(pst, 0, 1);
		grid.add(pstdate, 1, 1);
		
		grid.add(mvc, 0, 2);
		grid.add(mvcdate, 1, 2);
		
		grid.add(oop, 0, 3);
		grid.add(oopdate, 1, 3);
		
		grid.add(btnback, 1, 4);
		
		btnback.setOnAction(new EventHandler<ActionEvent>() 
		{	
			@Override
			public void handle(ActionEvent event) 
			{
				try
				{
					new Std_Home().start(new Stage());
					stage.hide();
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		
		scene = new Scene(grid);
		
		stage.setScene(scene);
		stage.show();
	}
}
