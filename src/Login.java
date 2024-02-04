import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


public class Login extends Application
{
	private String User_PassAdmin = "User_PassAdmin.txt";
	
	public static void main(String[] args) 
	{
		launch(args);
	}

	@Override
	public void start(Stage s) throws Exception 
	{	
		stage = s;
		stage.setHeight(600);
		stage.setWidth(800);
		stage.setTitle("Login");

		addcomp();
		
		stage.show();
		stage.setScene(scene);
	}
	
	Stage stage;
	Scene scene;
	
	private void addcomp()
	{
		Label header = new Label("Institute Management System");	
		header.setFont(Font.font("Arial",FontWeight.BOLD,25));
		
		Label l1 = new Label("Username");
		TextField txt1 = new TextField();
		
		Label l2 = new Label("Password");
		PasswordField txt2 = new PasswordField();
		
		Button btnlog = new Button("Login");
		Button btnclr = new Button("Clear");
		HBox h = new HBox(10);
		h.getChildren().addAll(btnlog,btnclr);
		
		GridPane grid = new GridPane();
		grid.setVgap(15);
		grid.setHgap(10);
		grid.setAlignment(Pos.CENTER);
		
		grid.add(l1, 0, 0);
		grid.add(txt1, 1, 0);
		
		grid.add(l2, 0, 1);
		grid.add(txt2, 1, 1);
		
		grid.add(h, 1, 2);
		
		VBox v = new VBox(40);
		v.setAlignment(Pos.CENTER);
		v.getChildren().addAll(header,grid);
		
		scene=new Scene(v);
		
		btnlog.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) 
			{
				String q= txt1.getText();
				String w= txt2.getText();
				
				Filing cnn= new Filing();
				
				cnn.open_file(User_PassAdmin);
				boolean ans = cnn.read_Login(q,w);
				
				cnn.open_file(Std_reg.User_PassStd);
				boolean ansStd = cnn.read_Login(q, w);
				
				cnn.open_file(Teacher_reg.User_PassTeach);
				boolean ansTeach = cnn.read_Login(q, w);
				
				if(ans == true)
				{
					try {
						new Home().start(new Stage());
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					stage.close();
				}
				else if(ansStd == true)
				{
					try{
						new Std_Home().start(new Stage());
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						
					}
					stage.close();
				}
				else if(ansTeach == true)
				{
					try {
						new Teach_Home().start(new Stage());
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					stage.close();
				}
				else if(q.isEmpty() || w.isEmpty())
				{
					Alert msg= new Alert(AlertType.INFORMATION);
					msg.setTitle("TextField Empty");
					msg.setHeaderText("Please Input Username or Password");
					msg.show();
				}
				else
				{
					Alert msg= new Alert(AlertType.ERROR);
					msg.setTitle("Login Failed");
					msg.setHeaderText("Username or Password is Incorrect");
					msg.show();
				}
				cnn.close();
			}
		});
		
		btnclr.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override
			public void handle(ActionEvent event) 
			{
				txt1.setText("");
				txt2.setText("");
				Alert msg= new Alert(AlertType.INFORMATION);
				msg.setTitle("Text Fields Cleared");
				msg.setHeaderText("Text Fields Cleared Successfully");
				msg.show();
			}
		});
	}
}
