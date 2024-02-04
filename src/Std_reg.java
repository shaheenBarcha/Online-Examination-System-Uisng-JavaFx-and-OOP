import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Std_reg extends Home
{
	private String username = "";
	private String password = "";
	static String Student = "data_std.txt";
	static String User_PassStd = "User_PassStd.txt";
	String details = "";
	
	
	
	Scene scene;
	Stage stage;
	public void start(Stage s) throws Exception 
	{
		stage = new Stage();
		stage.setHeight(600);
		stage.setWidth(800);
		stage.setTitle("Student Registration");
		
		addcomp();

		stage.setScene(scene);
		stage.show();
	}
	
	private void addcomp()
	{
		Label header = new Label("Registration Form");	
		header.setFont(Font.font("Arial",FontWeight.BOLD,20));
		
		Label l1 = new Label("Name");
		TextField txt1 = new TextField();
		
		Label l2 = new Label("Mobile No.");
		TextField txt2 = new TextField();
		
		Label l3 = new Label("Gender");		
		final ToggleGroup group = new ToggleGroup();
		RadioButton male = new RadioButton("Male");
		male.setToggleGroup(group);
		RadioButton fmale = new RadioButton("Female");
		fmale.setToggleGroup(group);
		
		Label l4 = new Label("Courses");
		CheckBox pst = new CheckBox("PST");
		CheckBox mvc = new CheckBox("MVC");
		CheckBox oop = new CheckBox("OOP");
		
		Label l5 = new Label("Shifts");
		ObservableList<String> shift = FXCollections.observableArrayList
				("8:30-11:00",
				"11:10-12:40",
				"1:00-2:30");
		final ComboBox comboBox = new ComboBox(shift);
		comboBox.setPromptText("< Timings >");
		
		Label l6 = new Label("Joining Date");
		DatePicker date = new DatePicker();
		HBox calender = new HBox(date);
		
		Label l7 = new Label("Username");
		TextField txt3 = new TextField();
		
		Label l8 = new Label("Password");
		PasswordField txt4 = new PasswordField();
		
		Button btnback = new Button("Back");
		Button btnregister = new Button("Register");
		HBox btns = new HBox(10);
		btns.getChildren().addAll(btnregister,btnback);
		
		GridPane grid = new GridPane();
		grid.setVgap(15);
		grid.setHgap(15);
		
		grid.add(header, 0, 0);
		
		grid.add(l1, 0, 1);
		grid.add(txt1, 1, 1);
		
		grid.add(l7, 0, 2);
		grid.add(txt3, 1, 2);
		
		grid.add(l8, 0, 3);
		grid.add(txt4, 1, 3);
		
		grid.add(l2, 0, 4);
		grid.add(txt2, 1, 4);
		
		grid.add(l3,0 , 5);
		grid.add(male, 1, 5);
		grid.add(fmale, 2, 5);
		
		grid.add(l4, 0, 6);
		grid.add(pst, 2, 6);
		grid.add(mvc, 1, 6);
		grid.add(oop, 1, 7);
		
		grid.add(l5, 0, 8);
		grid.add(comboBox, 1, 8);
		
		grid.add(l6, 0, 9);
		grid.add(calender, 1, 9);
		
		grid.add(btns, 1, 11);
		
		grid.setAlignment(Pos.CENTER);
		
		btnback.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override
			public void handle(ActionEvent event) 
			{
				try {
					new Home().start(new Stage());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				stage.hide();
			}
		});
		
		btnregister.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent event)
			{
				username += ""+txt3.getText();
				password += ""+txt4.getText();
				details += "Name: "+txt1.getText()+"\n";
				details += "Username: "+txt3.getText()+"\n";
				details += "Password: "+txt4.getText()+"\n";
				details += "Mobile No: "+txt2.getText()+"\n";
				
				if(male.isSelected())
				{
					details += ("Gender: Male\n");
				}
				else if(fmale.isSelected())
				{
					details += ("Gender: Female\n");
				}
				else
				{
					details += ("Gender: Not Selected\n");
				}
				
				details += "Courses: ";
				
				if(pst.isSelected())
				{
					details += "PST ";
				}
				if(mvc.isSelected())
				{
					details += "MVC ";
				}
				if(oop.isSelected())
				{
					details += "OOP ";
				}
				
				details += "\nShifts: " +comboBox.getSelectionModel().getSelectedItem();
				details += "\nAccount Creation Date: \n"+date.getValue();
				
				Filing file = new Filing();
				
				try
				{
					file.WriteToDataFile(details,Student);
					file.WriteToUser_Pass(username,User_PassStd);
					file.WriteToUser_Pass(password,User_PassStd);
				}
				catch (IOException e) 
				{
					e.printStackTrace();
				}
				
				Alert msg = new Alert(AlertType.INFORMATION);
				msg.setTitle("Registered");
				msg.setHeaderText("User Registered Successfully");
				msg.show();
			}
		});
		scene=new Scene(grid);
	}
}

