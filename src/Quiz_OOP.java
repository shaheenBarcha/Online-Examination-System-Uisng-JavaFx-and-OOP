import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Quiz_OOP extends Std_Home
{
	Stage stage;
	Scene scene;
	int marks = 0;
	
	public void start(Stage s) throws Exception 
	{
		stage = new Stage();
		stage.setHeight(700);
		stage.setWidth(800);
		stage.setTitle("Pakistan Studies Quiz");
		
		addcomp();

		stage.setScene(scene);
		stage.show();
	}
	
	private void addcomp()
	{
		Button btnback = new Button("Back");
		Button btnsubmit = new Button("Submit");
		HBox btns = new HBox(10);
		btns.setAlignment(Pos.CENTER);
		btns.getChildren().addAll(btnsubmit,btnback);
		
		Label header = new Label("Object Oriented Programming Exam (Total 10 Marks)");
		header.setFont(Font.font("Arial",FontWeight.BOLD,20));
		
		Filing cnn = new Filing();
		
		cnn.read_questions(Teach_OOP.getOOPQ());	
		cnn.read_options(Teach_OOP.getOOPO());
		
		Label q1 = new Label("Q1. "+cnn.q1);
		final ToggleGroup group = new ToggleGroup();
		RadioButton q1op1 = new RadioButton(cnn.q1o1);
		q1op1.setToggleGroup(group);
		RadioButton q1op2 = new RadioButton(cnn.q1o2);
		q1op2.setToggleGroup(group);
		RadioButton q1op3 = new RadioButton(cnn.q1o3);
		q1op3.setToggleGroup(group);
		RadioButton q1op4 = new RadioButton(cnn.q1o4);
		q1op4.setToggleGroup(group);
		HBox ops1 = new HBox(30);
		ops1.getChildren().addAll(q1op1,q1op2,q1op3,q1op4);
		
		Label q2 = new Label("Q2. "+cnn.q2);
		final ToggleGroup group2 = new ToggleGroup();
		RadioButton q2op1 = new RadioButton(cnn.q2o1);
		q2op1.setToggleGroup(group2);
		RadioButton q2op2 = new RadioButton(cnn.q2o2);
		q2op2.setToggleGroup(group2);
		RadioButton q2op3 = new RadioButton(cnn.q2o3);
		q2op3.setToggleGroup(group2);
		RadioButton q2op4 = new RadioButton(cnn.q2o4);
		q2op4.setToggleGroup(group2);
		HBox ops2 = new HBox(30);
		ops2.getChildren().addAll(q2op1,q2op2,q2op3,q2op4);
		
		
		Label q3 = new Label("Q3. "+cnn.q3);
		final ToggleGroup group3 = new ToggleGroup();
		RadioButton q3op1 = new RadioButton(cnn.q3o1);
		q3op1.setToggleGroup(group3);
		RadioButton q3op2 = new RadioButton(cnn.q3o2);
		q3op2.setToggleGroup(group3);
		RadioButton q3op3 = new RadioButton(cnn.q3o3);
		q3op3.setToggleGroup(group3);
		RadioButton q3op4 = new RadioButton(cnn.q3o4);
		q3op4.setToggleGroup(group3);
		HBox ops3 = new HBox(30);
		ops3.getChildren().addAll(q3op1,q3op2,q3op3,q3op4);
		
		
		Label q4 = new Label("Q4. "+cnn.q4);
		final ToggleGroup group4 = new ToggleGroup();
		RadioButton q4op1 = new RadioButton(cnn.q4o1);
		q4op1.setToggleGroup(group4);
		RadioButton q4op2 = new RadioButton(cnn.q4o2);
		q4op2.setToggleGroup(group4);
		RadioButton q4op3 = new RadioButton(cnn.q4o3);
		q4op3.setToggleGroup(group4);
		RadioButton q4op4 = new RadioButton(cnn.q4o4);
		q4op4.setToggleGroup(group4);
		HBox ops4 = new HBox(30);
		ops4.getChildren().addAll(q4op1,q4op2,q4op3,q4op4);
		
		
		Label q5 = new Label("Q5. "+cnn.q5);
		final ToggleGroup group5 = new ToggleGroup();
		RadioButton q5op1 = new RadioButton(cnn.q5o1);
		q5op1.setToggleGroup(group5);
		RadioButton q5op2 = new RadioButton(cnn.q5o2);
		q5op2.setToggleGroup(group5);
		RadioButton q5op3 = new RadioButton(cnn.q5o3);
		q5op3.setToggleGroup(group5);
		RadioButton q5op4 = new RadioButton(cnn.q5o4);
		q5op4.setToggleGroup(group5);
		HBox ops5 = new HBox(30);
		ops5.getChildren().addAll(q5op1,q5op2,q5op3,q5op4);
		
		
		Label q6 = new Label("Q6. "+cnn.q6);
		final ToggleGroup group6 = new ToggleGroup();
		RadioButton q6op1 = new RadioButton(cnn.q6o1);
		q6op1.setToggleGroup(group6);
		RadioButton q6op2 = new RadioButton(cnn.q6o2);
		q6op2.setToggleGroup(group6);
		RadioButton q6op3 = new RadioButton(cnn.q6o3);
		q6op3.setToggleGroup(group6);
		RadioButton q6op4 = new RadioButton(cnn.q6o4);
		q6op4.setToggleGroup(group6);
		HBox ops6 = new HBox(30);
		ops6.getChildren().addAll(q6op1,q6op2,q6op3,q6op4);
		
		Label q7 = new Label("Q7. "+cnn.q7);
		final ToggleGroup group7 = new ToggleGroup();
		RadioButton q7op1 = new RadioButton(cnn.q7o1);
		q7op1.setToggleGroup(group7);
		RadioButton q7op2 = new RadioButton(cnn.q7o2);
		q7op2.setToggleGroup(group7);
		RadioButton q7op3 = new RadioButton(cnn.q7o3);
		q7op3.setToggleGroup(group7);
		RadioButton q7op4 = new RadioButton(cnn.q7o4);
		q7op4.setToggleGroup(group7);
		HBox ops7 = new HBox(30);
		ops7.getChildren().addAll(q7op1,q7op2,q7op3,q7op4);
		
		
		Label q8 = new Label("Q8. "+cnn.q8);
		final ToggleGroup group8 = new ToggleGroup();
		RadioButton q8op1 = new RadioButton(cnn.q8o1);
		q8op1.setToggleGroup(group8);
		RadioButton q8op2 = new RadioButton(cnn.q8o2);
		q8op2.setToggleGroup(group8);
		RadioButton q8op3 = new RadioButton(cnn.q8o3);
		q8op3.setToggleGroup(group8);
		RadioButton q8op4 = new RadioButton(cnn.q8o4);
		q8op4.setToggleGroup(group8);
		HBox ops8 = new HBox(30);
		ops8.getChildren().addAll(q8op1,q8op2,q8op3,q8op4);
		
		Label q9 = new Label("Q9. "+cnn.q9);
		final ToggleGroup group9 = new ToggleGroup();
		RadioButton q9op1 = new RadioButton(cnn.q9o1);
		q9op1.setToggleGroup(group9);
		RadioButton q9op2 = new RadioButton(cnn.q9o2);
		q9op2.setToggleGroup(group9);
		RadioButton q9op3 = new RadioButton(cnn.q9o3);
		q9op3.setToggleGroup(group9);
		RadioButton q9op4 = new RadioButton(cnn.q9o4);
		q9op4.setToggleGroup(group9);
		HBox ops9 = new HBox(30);
		ops9.getChildren().addAll(q9op1,q9op2,q9op3,q9op4);
		
		Label q10 = new Label("Q10. "+cnn.q10);
		final ToggleGroup group10 = new ToggleGroup();
		RadioButton q10op1 = new RadioButton(cnn.q10o1);
		q10op1.setToggleGroup(group10);
		RadioButton q10op2 = new RadioButton(cnn.q10o2);
		q10op2.setToggleGroup(group10);
		RadioButton q10op3 = new RadioButton(cnn.q10o3);
		q10op3.setToggleGroup(group10);
		RadioButton q10op4 = new RadioButton(cnn.q10o4);
		q10op4.setToggleGroup(group10);
		HBox ops10 = new HBox(30);
		ops10.getChildren().addAll(q10op1,q10op2,q10op3,q10op4);
		
		
		GridPane grid = new GridPane();
		grid.setVgap(10);
		grid.setAlignment(Pos.CENTER);
		
		grid.add(header, 0, 0);
		
		grid.add(q1, 0, 1);
		grid.add(ops1, 0, 2);
		
		grid.add(q2, 0, 3);
		grid.add(ops2, 0, 4);
		
		grid.add(q3, 0, 5);
		grid.add(ops3, 0, 6);
		
		grid.add(q4, 0, 7);
		grid.add(ops4, 0, 8);
		
		grid.add(q5, 0, 9);
		grid.add(ops5, 0, 10);
		
		grid.add(q6, 0, 11);
		grid.add(ops6, 0, 12);
		
		grid.add(q7, 0, 13);
		grid.add(ops7, 0, 14);
		
		grid.add(q8, 0, 15);
		grid.add(ops8, 0, 16);
		
		grid.add(q9, 0, 17);
		grid.add(ops9, 0, 18);
		
		grid.add(q10, 0, 19);
		grid.add(ops10, 0, 20);
		
		grid.add(btns, 0, 22);
		
		btnsubmit.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent event)
			{
				//Q1
				if(q1op1.isSelected() && cnn.q1o1.equals(cnn.q1c1))
					{
						marks++;
					}
				else if(q1op2.isSelected() && cnn.q1o2.equals(cnn.q1c1))
					{
						marks++;
					}
				else if(q1op3.isSelected() && cnn.q1o3.equals(cnn.q1c1))
					{
						marks++;
					}
				else if(q1op4.isSelected() && cnn.q1o4.equals(cnn.q1c1))
					{
						marks++;
					}
				//Q2
			if(q2op1.isSelected() && cnn.q2o1.equals(cnn.q2c2))
				{
					marks++;
				}
			else if(q2op2.isSelected() && cnn.q2o2.equals(cnn.q2c2))
				{
					marks++;
				}
			else if(q2op3.isSelected() && cnn.q2o3.equals(cnn.q2c2))
				{
					marks++;
				}
			else if(q2op4.isSelected() && cnn.q2o4.equals(cnn.q2c2))
				{
					marks++;
				}
			//Q3
			if(q3op1.isSelected() && cnn.q3o1.equals(cnn.q3c3))
			{
				marks++;
			}
		else if(q3op2.isSelected() && cnn.q3o2.equals(cnn.q3c3))
			{
				marks++;
			}
		else if(q3op3.isSelected() && cnn.q3o3.equals(cnn.q3c3))
			{
				marks++;
			}
		else if(q3op4.isSelected() && cnn.q3o4.equals(cnn.q3c3))
			{
				marks++;
			}
			//Q4
			if(q4op1.isSelected() && cnn.q4o1.equals(cnn.q4c4))
			{
				marks++;
			}
		else if(q4op2.isSelected() && cnn.q4o2.equals(cnn.q4c4))
			{
				marks++;
			}
		else if(q4op3.isSelected() && cnn.q4o3.equals(cnn.q4c4))
			{
				marks++;
			}
		else if(q4op4.isSelected() && cnn.q4o4.equals(cnn.q4c4))
			{
				marks++;
			}
			//Q5
			if(q5op1.isSelected() && cnn.q5o1.equals(cnn.q5c5))
			{
				marks++;
			}
		else if(q5op2.isSelected() && cnn.q5o2.equals(cnn.q5c5))
			{
				marks++;
			}
		else if(q5op3.isSelected() && cnn.q5o3.equals(cnn.q5c5))
			{
				marks++;
			}
		else if(q5op4.isSelected() && cnn.q5o4.equals(cnn.q5c5))
			{
				marks++;
			}
			//Q6
			if(q6op1.isSelected() && cnn.q6o1.equals(cnn.q6c6))
			{
				marks++;
			}
		else if(q6op2.isSelected() && cnn.q6o2.equals(cnn.q6c6))
			{
				marks++;
			}
		else if(q6op3.isSelected() && cnn.q6o3.equals(cnn.q6c6))
			{
				marks++;
			}
		else if(q6op4.isSelected() && cnn.q6o4.equals(cnn.q6c6))
			{
				marks++;
			}
			//Q7
			if(q7op1.isSelected() && cnn.q7o1.equals(cnn.q7c7))
			{
				marks++;
			}
		else if(q7op2.isSelected() && cnn.q7o2.equals(cnn.q7c7))
			{
				marks++;
			}
		else if(q7op3.isSelected() && cnn.q7o3.equals(cnn.q7c7))
			{
				marks++;
			}
		else if(q7op4.isSelected() && cnn.q7o4.equals(cnn.q7c7))
			{
				marks++;
			}
			//Q7
			if(q7op1.isSelected() && cnn.q7o1.equals(cnn.q7c7))
			{
				marks++;
			}
		else if(q7op2.isSelected() && cnn.q7o2.equals(cnn.q7c7))
			{
				marks++;
			}
		else if(q7op3.isSelected() && cnn.q7o3.equals(cnn.q7c7))
			{
				marks++;
			}
		else if(q7op4.isSelected() && cnn.q7o4.equals(cnn.q7c7))
			{
				marks++;
			}
			//Q8
			if(q8op1.isSelected() && cnn.q8o1.equals(cnn.q8c8))
			{
				marks++;
			}
		else if(q8op2.isSelected() && cnn.q8o2.equals(cnn.q8c8))
			{
				marks++;
			}
		else if(q8op3.isSelected() && cnn.q8o3.equals(cnn.q8c8))
			{
				marks++;
			}
		else if(q8op4.isSelected() && cnn.q8o4.equals(cnn.q8c8))
			{
				marks++;
			}
			//Q9
			if(q9op1.isSelected() && cnn.q9o1.equals(cnn.q9c9))
			{
				marks++;
			}
		else if(q9op2.isSelected() && cnn.q9o2.equals(cnn.q9c9))
			{
				marks++;
			}
		else if(q9op3.isSelected() && cnn.q9o3.equals(cnn.q9c9))
			{
				marks++;
			}
		else if(q9op4.isSelected() && cnn.q9o4.equals(cnn.q9c9))
			{
				marks++;
			}
			//Q10
			if(q10op1.isSelected() && cnn.q10o1.equals(cnn.q10c10))
			{
				marks++;
			}
		else if(q10op2.isSelected() && cnn.q10o2.equals(cnn.q10c10))
			{
				marks++;
			}
		else if(q10op3.isSelected() && cnn.q10o3.equals(cnn.q10c10))
			{
				marks++;
			}
		else if(q10op4.isSelected() && cnn.q10o4.equals(cnn.q10c10))
			{
				marks++;
			}
			
				Alert msg = new Alert(AlertType.INFORMATION);
				msg.setTitle("Quiz Submitted");
				msg.setHeaderText("Correct Answer = "+marks+"\nWrong Answer = "+(10-marks));
				msg.show();
			}
		});
		
		btnback.setOnAction(new EventHandler<ActionEvent>() 
		{
			
			@Override
			public void handle(ActionEvent event) 
			{
				try {
					new Std_Home().start(new Stage());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				stage.hide();
			}
		});
		
		scene = new Scene(grid);
	}
}
