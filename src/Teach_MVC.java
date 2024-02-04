import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Teach_MVC extends Teach_Home
{
	Stage stage;
	Scene scene;
	
	private static String MVCQ = "MVCQ.txt";
	private static String MVCO = "MVCO.txt";

	public void start(Stage s) throws Exception 
	{
		stage = new Stage();
		stage.setHeight(720);
		stage.setWidth(800);
		stage.setTitle("Multivariate Calculus Quiz");
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
		
		Label header = new Label("Multivariate Calculus Exam (Total 10 Marks)");
		header.setFont(Font.font("Arial",FontWeight.BOLD,20));
		
		//Question 1 Start//
		Label q1 = new Label("Question 1");
		TextField t1 = new TextField();
		t1.setPrefSize(510, 15);
		HBox q1h1 = new HBox(5);
		q1h1.setAlignment(Pos.CENTER_LEFT);
		q1h1.getChildren().addAll(q1,t1);
		
		Label opt1 = new Label("Option1 ->");
		TextField op1 = new TextField();
		op1.setPrefSize(50, 15);
		
		Label opt2 = new Label("Option2 ->");
		TextField op2 = new TextField();
		op2.setPrefSize(50, 15);
		
		Label opt3 = new Label("Option3 ->");
		TextField op3 = new TextField();
		op3.setPrefSize(50, 15);
		
		Label opt4 = new Label("Option4 ->");
		TextField op4 = new TextField();
		op4.setPrefSize(50, 15);
		
		Label ans = new Label("Correct");
		TextField an = new TextField();
		an.setPrefSize(50, 15);
		
		HBox q1h2 = new HBox(5);
		q1h2.setAlignment(Pos.CENTER_LEFT);
		q1h2.getChildren().addAll(opt1,op1,opt2,op2,opt3,op3,opt4,op4,ans,an);
		//Question 1 End//
		
		
		//Question 2 Start//
		Label q2 = new Label("Question 2");
		TextField t2 = new TextField();
		t2.setPrefSize(510, 15);
		HBox q2h1 = new HBox(5);
		q2h1.setAlignment(Pos.CENTER_LEFT);
		q2h1.getChildren().addAll(q2,t2);
				
		Label q2opt1 = new Label("Option1 ->");
		TextField q2op1 = new TextField();
		q2op1.setPrefSize(50, 15);
				
		Label q2opt2 = new Label("Option2 ->");
		TextField q2op2 = new TextField();
		q2op2.setPrefSize(50, 15);
				
		Label q2opt3 = new Label("Option3 ->");
		TextField q2op3 = new TextField();
		q2op3.setPrefSize(50, 15);
				
		Label q2opt4 = new Label("Option4 ->");
		TextField q2op4 = new TextField();
		q2op4.setPrefSize(50, 15);
				
		Label q2ans = new Label("Correct");
		TextField q2an = new TextField();
		q2an.setPrefSize(50, 15);
				
		HBox q2h2 = new HBox(5);
		q2h2.setAlignment(Pos.CENTER_LEFT);
		q2h2.getChildren().addAll(q2opt1,q2op1,q2opt2,q2op2,q2opt3,q2op3,q2opt4,q2op4,q2ans,q2an);
		//Question 2 End//
		
		
		//Question 3 Start//
		Label q3 = new Label("Question 3");
		TextField t3 = new TextField();
		t3.setPrefSize(510, 15);
		HBox q3h1 = new HBox(5);
		q3h1.setAlignment(Pos.CENTER_LEFT);
		q3h1.getChildren().addAll(q3,t3);
						
		Label q3opt1 = new Label("Option1 ->");
		TextField q3op1 = new TextField();
		q3op1.setPrefSize(50, 15);
						
		Label q3opt2 = new Label("Option2 ->");
		TextField q3op2 = new TextField();
		q3op2.setPrefSize(50, 15);
						
		Label q3opt3 = new Label("Option3 ->");
		TextField q3op3 = new TextField();
		q3op3.setPrefSize(50, 15);
						
		Label q3opt4 = new Label("Option4 ->");
		TextField q3op4 = new TextField();
		q3op4.setPrefSize(50, 15);
						
		Label q3ans = new Label("Correct");
		TextField q3an = new TextField();
		q3an.setPrefSize(50, 15);
						
		HBox q3h2 = new HBox(5);
		q3h2.setAlignment(Pos.CENTER_LEFT);
		q3h2.getChildren().addAll(q3opt1,q3op1,q3opt2,q3op2,q3opt3,q3op3,q3opt4,q3op4,q3ans,q3an);
		//Question 3 End//
		
		
		//Question 4 Start//
		Label q4 = new Label("Question 4");
		TextField t4 = new TextField();
		t4.setPrefSize(510, 15);
		HBox q4h1 = new HBox(5);
		q4h1.setAlignment(Pos.CENTER_LEFT);
		q4h1.getChildren().addAll(q4,t4);
						
		Label q4opt1 = new Label("Option1 ->");
		TextField q4op1 = new TextField();
		q4op1.setPrefSize(50, 15);
						
		Label q4opt2 = new Label("Option2 ->");
		TextField q4op2 = new TextField();
		q4op2.setPrefSize(50, 15);
						
		Label q4opt3 = new Label("Option3 ->");
		TextField q4op3 = new TextField();
		q4op3.setPrefSize(50, 15);
						
		Label q4opt4 = new Label("Option4 ->");
		TextField q4op4 = new TextField();
		q4op4.setPrefSize(50, 15);
						
		Label q4ans = new Label("Correct");
		TextField q4an = new TextField();
		q4an.setPrefSize(50, 15);
						
		HBox q4h2 = new HBox(5);
		q4h2.setAlignment(Pos.CENTER_LEFT);
		q4h2.getChildren().addAll(q4opt1,q4op1,q4opt2,q4op2,q4opt3,q4op3,q4opt4,q4op4,q4ans,q4an);
		//Question 4 End//
		
		
		//Question 5 Start//
		Label q5 = new Label("Question 5");
		TextField t5 = new TextField();
		t5.setPrefSize(510, 15);
		HBox q5h1 = new HBox(5);
		q5h1.setAlignment(Pos.CENTER_LEFT);
		q5h1.getChildren().addAll(q5,t5);
								
		Label q5opt1 = new Label("Option1 ->");
		TextField q5op1 = new TextField();
		q5op1.setPrefSize(50, 15);
								
		Label q5opt2 = new Label("Option2 ->");
		TextField q5op2 = new TextField();
		q5op2.setPrefSize(50, 15);
								
		Label q5opt3 = new Label("Option3 ->");
		TextField q5op3 = new TextField();
		q5op3.setPrefSize(50, 15);
								
		Label q5opt5 = new Label("Option5 ->");
		TextField q5op4 = new TextField();
		q5op4.setPrefSize(50, 15);
							
		Label q5ans = new Label("Correct");
		TextField q5an = new TextField();
		q5an.setPrefSize(50, 15);
								
		HBox q5h2 = new HBox(5);
		q5h2.setAlignment(Pos.CENTER_LEFT);
		q5h2.getChildren().addAll(q5opt1,q5op1,q5opt2,q5op2,q5opt3,q5op3,q5opt5,q5op4,q5ans,q5an);
		//Question 5 End//
		
		
		//Question 6 Start//
		Label q6 = new Label("Question 6");
		TextField t6 = new TextField();
		t6.setPrefSize(510, 15);
		HBox q6h1 = new HBox(5);
		q6h1.setAlignment(Pos.CENTER_LEFT);
		q6h1.getChildren().addAll(q6,t6);
										
		Label q6opt1 = new Label("Option1 ->");
		TextField q6op1 = new TextField();
		q6op1.setPrefSize(50, 15);
										
		Label q6opt2 = new Label("Option2 ->");
		TextField q6op2 = new TextField();
		q6op2.setPrefSize(50, 15);
										
		Label q6opt3 = new Label("Option3 ->");
		TextField q6op3 = new TextField();
		q6op3.setPrefSize(50, 15);
									
		Label q6opt6 = new Label("Option6 ->");
		TextField q6op4 = new TextField();
		q6op4.setPrefSize(50, 15);
									
		Label q6ans = new Label("Correct");
		TextField q6an = new TextField();
		q6an.setPrefSize(50, 15);
										
		HBox q6h2 = new HBox(5);
		q6h2.setAlignment(Pos.CENTER_LEFT);
		q6h2.getChildren().addAll(q6opt1,q6op1,q6opt2,q6op2,q6opt3,q6op3,q6opt6,q6op4,q6ans,q6an);
		//Question 6 End//
		
		
		//Question 7 Start//
		Label q7 = new Label("Question 7");
		TextField t7 = new TextField();
		t7.setPrefSize(510, 15);
		HBox q7h1 = new HBox(5);
		q7h1.setAlignment(Pos.CENTER_LEFT);
		q7h1.getChildren().addAll(q7,t7);
										
		Label q7opt1 = new Label("Option1 ->");
		TextField q7op1 = new TextField();
		q7op1.setPrefSize(50, 15);
									
		Label q7opt2 = new Label("Option2 ->");
		TextField q7op2 = new TextField();
		q7op2.setPrefSize(50, 15);
										
		Label q7opt3 = new Label("Option3 ->");
		TextField q7op3 = new TextField();
		q7op3.setPrefSize(50, 15);
										
		Label q7opt7 = new Label("Option7 ->");
		TextField q7op4 = new TextField();
		q7op4.setPrefSize(50, 15);
									
		Label q7ans = new Label("Correct");
		TextField q7an = new TextField();
		q7an.setPrefSize(50, 15);
										
		HBox q7h2 = new HBox(5);
		q7h2.setAlignment(Pos.CENTER_LEFT);
		q7h2.getChildren().addAll(q7opt1,q7op1,q7opt2,q7op2,q7opt3,q7op3,q7opt7,q7op4,q7ans,q7an);
		//Question 7 End//
		
		
		//Question 8 Start//
		Label q8 = new Label("Question 8");
		TextField t8 = new TextField();
		t8.setPrefSize(510, 15);
		HBox q8h1 = new HBox(5);
		q8h1.setAlignment(Pos.CENTER_LEFT);
		q8h1.getChildren().addAll(q8,t8);
										
		Label q8opt1 = new Label("Option1 ->");
		TextField q8op1 = new TextField();
		q8op1.setPrefSize(50, 15);
									
		Label q8opt2 = new Label("Option2 ->");
		TextField q8op2 = new TextField();
		q8op2.setPrefSize(50, 15);
										
		Label q8opt3 = new Label("Option3 ->");
		TextField q8op3 = new TextField();
		q8op3.setPrefSize(50, 15);
										
		Label q8opt8 = new Label("Option8 ->");
		TextField q8op4 = new TextField();
		q8op4.setPrefSize(50, 15);
									
		Label q8ans = new Label("Correct");
		TextField q8an = new TextField();
		q8an.setPrefSize(50, 15);
										
		HBox q8h2 = new HBox(5);
		q8h2.setAlignment(Pos.CENTER_LEFT);
		q8h2.getChildren().addAll(q8opt1,q8op1,q8opt2,q8op2,q8opt3,q8op3,q8opt8,q8op4,q8ans,q8an);
		//Question 8 End//
		
		
		//Question 9 Start//
		Label q9 = new Label("Question 9");
		TextField t9 = new TextField();
		t9.setPrefSize(510, 15);
		HBox q9h1 = new HBox(5);
		q9h1.setAlignment(Pos.CENTER_LEFT);
		q9h1.getChildren().addAll(q9,t9);
										
		Label q9opt1 = new Label("Option1 ->");
		TextField q9op1 = new TextField();
		q9op1.setPrefSize(50, 15);
									
		Label q9opt2 = new Label("Option2 ->");
		TextField q9op2 = new TextField();
		q9op2.setPrefSize(50, 15);
										
		Label q9opt3 = new Label("Option3 ->");
		TextField q9op3 = new TextField();
		q9op3.setPrefSize(50, 15);
										
		Label q9opt9 = new Label("Option9 ->");
		TextField q9op4 = new TextField();
		q9op4.setPrefSize(50, 15);
									
		Label q9ans = new Label("Correct");
		TextField q9an = new TextField();
		q9an.setPrefSize(50, 15);
										
		HBox q9h2 = new HBox(5);
		q9h2.setAlignment(Pos.CENTER_LEFT);
		q9h2.getChildren().addAll(q9opt1,q9op1,q9opt2,q9op2,q9opt3,q9op3,q9opt9,q9op4,q9ans,q9an);
		//Question 9 End//
		
		
		//Question 10 Start//
		Label q10 = new Label("Question 10");
		TextField t10 = new TextField();
		t10.setPrefSize(510, 15);
		HBox q10h1 = new HBox(5);
		q10h1.setAlignment(Pos.CENTER_LEFT);
		q10h1.getChildren().addAll(q10,t10);
										
		Label q10opt1 = new Label("Option1 ->");
		TextField q10op1 = new TextField();
		q10op1.setPrefSize(50, 15);
									
		Label q10opt2 = new Label("Option2 ->");
		TextField q10op2 = new TextField();
		q10op2.setPrefSize(50, 15);
										
		Label q10opt3 = new Label("Option3 ->");
		TextField q10op3 = new TextField();
		q10op3.setPrefSize(50, 15);
										
		Label q10opt10 = new Label("Option10 ->");
		TextField q10op4 = new TextField();
		q10op4.setPrefSize(50, 15);
									
		Label q10ans = new Label("Correct");
		TextField q10an = new TextField();
		q10an.setPrefSize(50, 15);
										
		HBox q10h2 = new HBox(5);
		q10h2.setAlignment(Pos.CENTER_LEFT);
		q10h2.getChildren().addAll(q10opt1,q10op1,q10opt2,q10op2,q10opt3,q10op3,q10opt10,q10op4,q10ans,q10an);
		//Question 10 End//

		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.TOP_CENTER);
		grid.setVgap(5);
		
		grid.add(header, 0, 0);
		
		grid.add(q1h1, 0, 1);
		grid.add(q1h2, 0, 2);
		
		grid.add(q2h1, 0, 3);
		grid.add(q2h2, 0, 4);
		
		grid.add(q3h1, 0, 5);
		grid.add(q3h2, 0, 6);
		
		grid.add(q4h1, 0, 7);
		grid.add(q4h2, 0, 8);
		
		grid.add(q5h1, 0, 9);
		grid.add(q5h2, 0, 10);
		
		grid.add(q6h1, 0, 11);
		grid.add(q6h2, 0, 12);
		
		grid.add(q7h1, 0, 13);
		grid.add(q7h2, 0, 14);
		
		grid.add(q8h1, 0, 15);
		grid.add(q8h2, 0, 16);
		
		grid.add(q9h1, 0, 17);
		grid.add(q9h2, 0, 18);
		
		grid.add(q10h1, 0, 19);
		grid.add(q10h2, 0, 20);
		
		grid.add(btns, 0, 22);
		
		btnback.setOnAction(new EventHandler<ActionEvent>() 
		{
			
			@Override
			public void handle(ActionEvent event) 
			{
				try {
					new Teach_Home().start(new Stage());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				stage.hide();
			}
		});
		
		btnsubmit.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event)
			{	
				if(t1.getText().equals("")||t2.getText().equals("")||t3.getText().equals("")||t4.getText().equals("")||t5.getText().equals("")||t6.getText().equals("")||t7.getText().equals("")||t8.getText().equals("")||t9.getText().equals("")||t10.getText().equals("")
						||op1.getText().equals("")||op2.getText().equals("")||op3.getText().equals("")||op4.getText().equals("")||an.getText().equals("")
						||q2op1.getText().equals("")||q2op2.getText().equals("")||q2op3.getText().equals("")||q2op4.getText().equals("")||q2an.getText().equals("")
						||q3op1.getText().equals("")||q3op2.getText().equals("")||q3op3.getText().equals("")||q3op4.getText().equals("")||q3an.getText().equals("")
						||q4op1.getText().equals("")||q4op2.getText().equals("")||q4op3.getText().equals("")||q4op4.getText().equals("")||q4an.getText().equals("")
						||q5op1.getText().equals("")||q5op2.getText().equals("")||q5op3.getText().equals("")||q5op4.getText().equals("")||q5an.getText().equals("")
						||q6op1.getText().equals("")||q6op2.getText().equals("")||q6op3.getText().equals("")||q6op4.getText().equals("")||q6an.getText().equals("")
						||q7op1.getText().equals("")||q7op2.getText().equals("")||q7op3.getText().equals("")||q7op4.getText().equals("")||q7an.getText().equals("")
						||q8op1.getText().equals("")||q8op2.getText().equals("")||q8op3.getText().equals("")||q8op4.getText().equals("")||q8an.getText().equals("")
						||q9op1.getText().equals("")||q9op2.getText().equals("")||q9op3.getText().equals("")||q9op4.getText().equals("")||q9an.getText().equals("")
						||q10op1.getText().equals("")||q10op2.getText().equals("")||q10op3.getText().equals("")||q10op4.getText().equals("")||q10an.getText().equals(""))
				{
					Alert msg = new Alert(AlertType.ERROR);
					msg.setTitle("TextField Empty");
					msg.setHeaderText("Please fill up all text fields");
					msg.show();
				}
				else if(
						(op1.getText().equals(an.getText())||op2.getText().equals(an.getText())||op3.getText().equals(an.getText())||op4.getText().equals(an.getText()))
					&&  (q2op1.getText().equals(q2an.getText())||q2op2.getText().equals(q2an.getText())||q2op3.getText().equals(q2an.getText())||q2op4.getText().equals(q2an.getText()))
					&&  (q3op1.getText().equals(q3an.getText())||q3op2.getText().equals(q3an.getText())||q3op3.getText().equals(q3an.getText())||q3op4.getText().equals(q3an.getText()))
					&&  (q4op1.getText().equals(q4an.getText())||q4op2.getText().equals(q4an.getText())||q4op3.getText().equals(q4an.getText())||q4op4.getText().equals(q4an.getText()))
					&&  (q5op1.getText().equals(q5an.getText())||q5op2.getText().equals(q5an.getText())||q5op3.getText().equals(q5an.getText())||q5op4.getText().equals(q5an.getText()))
					&&  (q6op1.getText().equals(q6an.getText())||q6op2.getText().equals(q6an.getText())||q6op3.getText().equals(q6an.getText())||q6op4.getText().equals(q6an.getText()))
					&&  (q7op1.getText().equals(q7an.getText())||q7op2.getText().equals(q7an.getText())||q7op3.getText().equals(q7an.getText())||q7op4.getText().equals(q7an.getText()))
					&&  (q8op1.getText().equals(q8an.getText())||q8op2.getText().equals(q8an.getText())||q8op3.getText().equals(q8an.getText())||q8op4.getText().equals(q8an.getText()))
					&&  (q9op1.getText().equals(q9an.getText())||q9op2.getText().equals(q9an.getText())||q9op3.getText().equals(q9an.getText())||q9op4.getText().equals(q9an.getText()))
					&&  (q10op1.getText().equals(q10an.getText())||q10op2.getText().equals(q10an.getText())||q10op3.getText().equals(q10an.getText())||q10op4.getText().equals(q10an.getText())))
				{
				String questions = "";
				String options = "";
				
				questions += ""+t1.getText();
				questions += "\n"+t2.getText();
				questions += "\n"+t3.getText();
				questions += "\n"+t4.getText();
				questions += "\n"+t5.getText();
				questions += "\n"+t6.getText();
				questions += "\n"+t7.getText();
				questions += "\n"+t8.getText();
				questions += "\n"+t9.getText();
				questions += "\n"+t10.getText();
				
				options += ""+op1.getText();
				options += "\n"+op2.getText();
				options += "\n"+op3.getText();
				options += "\n"+op4.getText();
				options += "\n"+an.getText();
				
				options += "\n"+q2op1.getText();
				options += "\n"+q2op2.getText();
				options += "\n"+q2op3.getText();
				options += "\n"+q2op4.getText();
				options += "\n"+q2an.getText();
				
				options += "\n"+q3op1.getText();
				options += "\n"+q3op2.getText();
				options += "\n"+q3op3.getText();
				options += "\n"+q3op4.getText();
				options += "\n"+q3an.getText();
				
				options += "\n"+q4op1.getText();
				options += "\n"+q4op2.getText();
				options += "\n"+q4op3.getText();
				options += "\n"+q4op4.getText();
				options += "\n"+q4an.getText();
				
				options += "\n"+q5op1.getText();
				options += "\n"+q5op2.getText();
				options += "\n"+q5op3.getText();
				options += "\n"+q5op4.getText();
				options += "\n"+q5an.getText();
				
				options += "\n"+q6op1.getText();
				options += "\n"+q6op2.getText();
				options += "\n"+q6op3.getText();
				options += "\n"+q6op4.getText();
				options += "\n"+q6an.getText();
				
				options += "\n"+q7op1.getText();
				options += "\n"+q7op2.getText();
				options += "\n"+q7op3.getText();
				options += "\n"+q7op4.getText();
				options += "\n"+q7an.getText();
				
				options += "\n"+q8op1.getText();
				options += "\n"+q8op2.getText();
				options += "\n"+q8op3.getText();
				options += "\n"+q8op4.getText();
				options += "\n"+q8an.getText();
				
				options += "\n"+q9op1.getText();
				options += "\n"+q9op2.getText();
				options += "\n"+q9op3.getText();
				options += "\n"+q9op4.getText();
				options += "\n"+q9an.getText();
				
				options += "\n"+q10op1.getText();
				options += "\n"+q10op2.getText();
				options += "\n"+q10op3.getText();
				options += "\n"+q10op4.getText();
				options += "\n"+q10an.getText();
				
				Filing cnn = new Filing();
				
				try
				{
					cnn.WriteToQuest(questions,getMVCQ());
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
				
				try
				{
					cnn.WriteToOpt(options,getMVCO());
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
				
				Alert msg = new Alert(AlertType.INFORMATION);
				msg.setTitle("Quiz Submitted");
				msg.setHeaderText("Quiz Submitted Successfully");
				msg.show();
				}
				else
				{
					Alert msg = new Alert(AlertType.ERROR);
					msg.setTitle("Answer Mismatch");
					msg.setHeaderText("Correct answer isn't matching with any of the option");
					msg.show();
				}
			}
		});
		
		scene = new Scene(grid);
	}

	public static String getMVCQ() {
		return MVCQ;
	}

	public static void setMVCQ(String mVCQ) {
		MVCQ = mVCQ;
	}

	public static String getMVCO() {
		return MVCO;
	}

	public static void setMVCO(String mVCO) {
		MVCO = mVCO;
	}
}
