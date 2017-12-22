package test;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

 
public class kanye extends Application {
	 public static void main(String[] args) {
	        launch(args);
	    }
	    
	    @Override
	    public void start(Stage primaryStage) {
	    	String[] arr = {"The College Dropout","Late Registration","Graduation","808s and Heartbreak","My Beautiful Dark Twisted Fantasy","Yeezus","The Life of Pablo"};
	        primaryStage.setTitle("its 808s");
	        Button btn = new Button();
	        btn.setText("Kanye West's best album is");
	        btn.setOnAction(new EventHandler<ActionEvent>() {
	 
	            @Override
	            public void handle(ActionEvent event) {
	            	int temp = (int)(Math.random() * 7);
	            	if (arr[temp].equals("")) {
	            		temp = (int)(Math.random() * 7);
	            	}
	            	if (arr[temp].equals("")) {
	            		temp = (int)(Math.random() * 7);
	            	}
	            	if (arr[temp].equals("")) {
	            		temp = (int)(Math.random() * 7);
	            	}
	            	if (arr[temp].equals("")) {
	            		temp = (int)(Math.random() * 7);
	            	}
	            	if (arr[temp].equals("")) {
	            		temp = (int)(Math.random() * 7);
	            	}
	            	if (arr[temp].equals("")) {
	            		temp = (int)(Math.random() * 7);
	            	}
	            	if (arr[temp].equals("")) {
	            		temp = (int)(Math.random() * 7);
	            	}
	            	if (arr[temp].equals("")) {
	            		temp = (int)(Math.random() * 7);
	            	}
	            	if (arr[temp].equals("")) {
	            		temp = (int)(Math.random() * 7);
	            	}
	            	if (arr[temp].equals("")) {
	            		temp = (int)(Math.random() * 7);
	            	}
	            	if (arr[temp].equals("")) {
	            		temp = (int)(Math.random() * 7);
	            	}
	            	if (arr[temp].equals("")) {
	            		temp = (int)(Math.random() * 7);
	            	}
	            	if (arr[temp].equals("")) {
	            		temp = (int)(Math.random() * 7);
	            	}
	            	if (arr[temp].equals("")) {
	            		temp = (int)(Math.random() * 7);
	            	}
	            	if (arr[temp].equals("")) {
	            		temp = (int)(Math.random() * 7);
	            	}
	            	if (arr[temp].equals("")) {
	            		temp = (int)(Math.random() * 7);
	            	}
	            	if (arr[temp].equals("")) {
	            		temp = (int)(Math.random() * 7);
	            	}
	            	if (arr[temp].equals("")) {
	            		temp = (int)(Math.random() * 7);
	            	}
	            	if (arr[temp].equals("")) {
	            		temp = (int)(Math.random() * 7);
	            	}
	            	if (arr[temp].equals("")) {
	            		temp = (int)(Math.random() * 7);
	            	}
	            	if (arr[temp].equals("")) {
	            		temp = (int)(Math.random() * 7);
	            	}
	            	if (arr[temp].equals("")) {
	            		temp = (int)(Math.random() * 7);
	            	}
	            	if (arr[temp].equals("")) {
	            		temp = (int)(Math.random() * 7);
	            	}
	            	if (arr[temp].equals("")) {
	            		temp = (int)(Math.random() * 7);
	            	}
	            	if (arr[temp].equals("")) {
	            		temp = (int)(Math.random() * 7);
	            	}
	            	if (arr[temp].equals("")) {
	            		temp = (int)(Math.random() * 7);
	            	}
	            	if (arr[temp].equals("")) {
	            		temp = (int)(Math.random() * 7);
	            	}
	            	if (arr[temp].equals("")) {
	            		temp = (int)(Math.random() * 7);
	            	}
	            	if (arr[temp].equals("")) {
	            		temp = (int)(Math.random() * 7);
	            	}
	            	if (arr[temp].equals("")) {
	            		temp = (int)(Math.random() * 7);
	            	}
	            	if (arr[temp].equals("")) {
	            		temp = (int)(Math.random() * 7);
	            	}
	            	if (arr[temp].equals("")) {
	            		temp = (int)(Math.random() * 7);
	            	}
	            	if (arr[temp].equals("")) {
	            		temp = (int)(Math.random() * 7);
	            	}
	            	if (arr[temp].equals("")) {
	            		temp = (int)(Math.random() * 7);
	            	}
	            	if (arr[temp].equals("")) {
	            		temp = (int)(Math.random() * 7);
	            	}
	            	if (arr[temp].equals("")) {
	            		temp = (int)(Math.random() * 7);
	            	}
	            	if (arr[temp].equals("")) {
	            		temp = (int)(Math.random() * 7);
	            	}
	            	if (arr[temp].equals("")) {
	            		temp = (int)(Math.random() * 7);
	            	}
	            	if (arr[temp].equals("")) {
	            		temp = (int)(Math.random() * 7);
	            	}
	            	if (arr[temp].equals("")) {
	            		temp = (int)(Math.random() * 7);
	            	}
	            	if (arr[temp].equals("")) {
	            		temp = (int)(Math.random() * 7);
	            	}
	            	if (arr[temp].equals("")) {
	            		temp = (int)(Math.random() * 7);
	            	}
	            	if (arr[temp].equals("")) {
	            		temp = (int)(Math.random() * 7);
	            	}
	            	if (arr[temp].equals("")) {
	            		temp = (int)(Math.random() * 7);
	            	}
	            	if (arr[temp].equals("")) {
	            		temp = (int)(Math.random() * 7);
	            	}
	            	if (arr[temp].equals("")) {
	            		temp = (int)(Math.random() * 7);
	            	}
	            	
	                System.out.println(arr[temp]);
	                arr[temp] = "";
	            }
	        });
	        
	        StackPane root = new StackPane();
	        root.getChildren().add(btn);
	        primaryStage.setScene(new Scene(root, 300, 250));
	        primaryStage.show();
	    }
	
}
