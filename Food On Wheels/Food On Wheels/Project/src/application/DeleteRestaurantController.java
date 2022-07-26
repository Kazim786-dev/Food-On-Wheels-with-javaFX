package application;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class DeleteRestaurantController {
	private FoodOnWheels controller;
	public FoodOnWheels getController() {
		return controller;
	}
	public void setController(FoodOnWheels controller) {
		this.controller = controller;
	}
	@FXML
	private TextField user_name;
	@FXML
	private ChoiceBox<String> myChoiceBox = new ChoiceBox<String>();
	@FXML
	private PasswordField password;
	@FXML
	private Label isNull;
	@FXML
	 // The reference of show button will be injected by the FXML loader
	 public Button goBtn;
	// location and resources will be automatically injected by the FXML loader
	 @FXML
	 public URL location;
	 //=new URL("D:\\SDA Spring 2022\\eclipseWorkplaceForSDA\\DemoApp\\src\\application\\SampleUI.fxml");
     
	 @FXML
	 public ResourceBundle resources;

	// Add a public no-args constructor
	 public void BOXUIController()
	 {
	 }
	 @FXML
	 public void initialize()
	 {		 
	 }
	 
	 
	 @FXML
	 public void show(ActionEvent event) throws IOException, SQLException {
		 ArrayList<Restaurant> list= controller.showRestaurant();
		 for(int i=0; i<list.size(); i++) {
			 this.myChoiceBox.getItems().add(list.get(i).getName());
		 }
	 }
	 
	 @FXML
	 public void getRest(ActionEvent event) throws IOException {
		 String rest= this.myChoiceBox.getValue();
		 if(rest!=null) {
			 this.controller.removeRestaurant(rest);
			 FXMLLoader loader = new FXMLLoader();
			 Stage currentStage=(Stage)((Node)event.getSource()).getScene().getWindow();
			 String fxmlDocPath = "src/application/adminMenu.fxml";
			 FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
			 AnchorPane pane = (AnchorPane) loader.load(fxmlStream);
			 adminMenuController obj= loader.getController();
			 obj.setController(controller);
			 Scene scene = new Scene(pane,600,600);
			 currentStage.setScene(scene);
			 currentStage.show();
		 }
		 
		 	 
	 }
	 
	 @FXML
	 public void toRestaurentLogin(ActionEvent event) throws IOException {
		 	
		 FXMLLoader loader = new FXMLLoader();
			Stage currentStage=(Stage)((Node)event.getSource()).getScene().getWindow();
			String fxmlDocPath = "src/application/ManagerLogin.fxml";
			FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
			AnchorPane pane = (AnchorPane) loader.load(fxmlStream);
			ManagerLoginController obj= loader.getController();
			obj.setController(controller);
			Scene scene = new Scene(pane,600,600);
			currentStage.setScene(scene);
			currentStage.show();
			
			 
	}
	public void back(ActionEvent event) throws IOException {
		 	
		 FXMLLoader loader = new FXMLLoader();
			Stage currentStage=(Stage)((Node)event.getSource()).getScene().getWindow();
			String fxmlDocPath = "src/application/adminMenu.fxml";
			FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
			AnchorPane pane = (AnchorPane) loader.load(fxmlStream);
			adminMenuController obj= loader.getController();
			obj.setController(controller);
			Scene scene = new Scene(pane,600,600);
			currentStage.setScene(scene);
			currentStage.show();
			
			 
	}
	 
}
