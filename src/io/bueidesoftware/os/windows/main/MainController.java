package io.bueidesoftware.os.windows.main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import io.bueidesoftware.os.Main;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class MainController implements Initializable{
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

	}
	
	public void addStudent(){
		Parent root;
		try {
			root = FXMLLoader.load(Main.class.getResource("windows/main/Main.fxml"));
			//root = FXMLLoader.load(getClass().getResource("AddStudent.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(Main.class.getResource("windows/application.css").toExternalForm());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void addClass(){
		
	}
	
}
