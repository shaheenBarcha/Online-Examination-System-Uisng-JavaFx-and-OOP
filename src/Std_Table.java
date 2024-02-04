import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


public class Std_Table extends Application
{
	
	public static void main(String[] args) 
	{
		launch(args);
	}

	@Override
	public void start(Stage primary) throws Exception 
	{
		Label header = new Label("Students Details");	
		header.setFont(Font.font("Arial",FontWeight.BOLD,30));
		
		TableView t = new TableView();
		
		TableColumn name= new TableColumn("Name");
		TableColumn username= new TableColumn("Username");
		TableColumn pass= new TableColumn("Password");
		TableColumn contact= new TableColumn("Contact#");
		TableColumn gender= new TableColumn("Gender");
		
		TableColumn courses= new TableColumn("Courses");
		TableColumn mvc= new TableColumn("MVC");
		TableColumn oop= new TableColumn("OOP");
		TableColumn pst= new TableColumn("PST");
		courses.getColumns().addAll(mvc,oop,pst);
		
		TableColumn shifts= new TableColumn("Shifts");
		TableColumn date= new TableColumn("Date");
		
		
		t.getColumns().addAll(name,username,pass,contact,gender,courses,shifts,date);
	
	Button fetch = new Button("Fetch");
	VBox v = new VBox(10);
	v.setAlignment(Pos.CENTER);
	v.getChildren().addAll(header,t,fetch);
	
	
	
	
	fetch.setOnAction(new EventHandler<ActionEvent>() 
	{
		
		@Override
		public void handle(ActionEvent event) 
		{
			Filing cnn = new Filing();
			cnn.read_student(Std_reg.Student);
			name.setText(cnn.name);
			username.setText(cnn.username);
			pass.setText(cnn.pass);
			contact.setText(cnn.contact);
			gender.setText(cnn.gender);
			courses.setText(cnn.courses);
			shifts.setText(cnn.shifts);
			date.setText(cnn.date);
		}
	});
	
	
	Scene s= new Scene(v,900,600);
    primary.setTitle("Student Record");
    primary.setScene(s);
    primary.show();

	}		
	
	
}	
