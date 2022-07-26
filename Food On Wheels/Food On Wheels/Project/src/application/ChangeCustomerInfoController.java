package application;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ChangeCustomerInfoController {

	
	private FoodOnWheels controller;
	public FoodOnWheels getController() {
		return controller;
	}
	public void setController(FoodOnWheels controller) {
		this.controller = controller;
	}
	
	//text fields
	
	@FXML
	private TextField name;
	@FXML
	private TextField username;
	@FXML
	private TextField Address;
	@FXML
	private PasswordField password;
	@FXML
	private TextField phoneNo;
	
	//labels
	
	@FXML
	private Label nameLabel;
	@FXML
	private Label phoneNolabel;
	@FXML
	private Label usernameLabel;
	@FXML
	private Label passwordlabel ;
	
	@FXML
	private Label errorLabel;
	
	
	
	
	public void toSignUp(ActionEvent event) throws IOException {
	 	
		 FXMLLoader loader = new FXMLLoader();
			Stage currentStage=(Stage)((Node)event.getSource()).getScene().getWindow();
			String fxmlDocPath = "src/application/CustomerSignUp.fxml";
			FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
			AnchorPane pane = (AnchorPane) loader.load(fxmlStream);
			CustomerSignUpController obj= loader.getController();
			obj.setController(controller);
			Scene scene = new Scene(pane,600,600);
			currentStage.setScene(scene);
			currentStage.show();
			
			 
	}
	 public void toAdminLogin(ActionEvent event) throws IOException {
		 
		 FXMLLoader loader = new FXMLLoader();
		Stage currentStage=(Stage)((Node)event.getSource()).getScene().getWindow();
		String fxmlDocPath = "src/application/adminLogin.fxml";
		FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
		AnchorPane pane = (AnchorPane) loader.load(fxmlStream);
		adminLoginController obj= loader.getController();
		obj.setController(controller);
		Scene scene = new Scene(pane,600,600);
		currentStage.setScene(scene);
		currentStage.show();
		
		
		 
	 }
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
	 public void toRiderLogin(ActionEvent event) throws IOException {
		 
		 FXMLLoader loader = new FXMLLoader();
		Stage currentStage=(Stage)((Node)event.getSource()).getScene().getWindow();
		String fxmlDocPath = "src/application/riderLogin.fxml";
		FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
		AnchorPane pane = (AnchorPane) loader.load(fxmlStream);
		RiderLoginController obj= loader.getController();
		obj.setController(controller);
		Scene scene = new Scene(pane,600,600);
		currentStage.setScene(scene);
		currentStage.show();
		
		
		 
	 }
	
	
	
	@FXML
	public void updateinfo(ActionEvent event) throws IOException {
	 boolean isValid= true;
	 String name= this.name.getText();
	 String Address= this.Address.getText();
	 String phoneNo= this.phoneNo.getText();
	 String username= this.username.getText();
	 String password = this.password.getText();
	 
	 if(!(name.equals("") || username.equals("") || phoneNo.equals("") || password.equals("") || Address.equals(""))) {
		 if(name.contains("0")||name.contains("1")||name.contains("2")||name.contains("3")||name.contains("4")||name.contains("5")||name.contains("6")||name.contains("7")||name.contains("8")||name.contains("9")) {
				this.nameLabel.setText("Name should not contain any number");
				isValid= false;
		 }
		 int phone=0;
		 if(phoneNo.contains(" ")) {
			 this.phoneNolabel.setText("Spaces not allowed");
		 	isValid= false;
		 }
		 else {
			 try {
				  phone= Integer.parseInt(phoneNo);
			 }
		 	 catch(NumberFormatException e) {
		 		 phoneNolabel.setText("Alphabets not allowed");
		 		 System.out.println(e);
		 		 isValid= false;
		 	 }
			 
		 }
		 
		 if(username.contains(" ")) {
				this.usernameLabel.setText("Spaces not allowed");
				isValid= false;
		 }
		 if(password.length()<5) {
			 	passwordlabel.setText(" Should contain more than 4 words");
				isValid= false;
		 }
		 
		 
		 
		 // for valid case
		 
		 if(isValid) {

			 this.controller.updateprofile(name,Address,phoneNo,username,password);
			 
				 
				 this.errorLabel.setText("Account updated successfully!");
				 Login(event);
				 
			 
//			  {
//				 this.errorLabel.setText("Sorry! some error occurred");
//			 }
			 
			}
	 }
	 else {
		 this.errorLabel.setText("Field should not be empty");
		
	 }

   }
	
	@FXML
	public void Login(ActionEvent event) throws IOException {
	 	
		 FXMLLoader loader = new FXMLLoader();
			Stage currentStage=(Stage)((Node)event.getSource()).getScene().getWindow();
			String fxmlDocPath = "src/application/CustomerLogin.fxml";
			FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
			AnchorPane pane = (AnchorPane) loader.load(fxmlStream);
			CustomerLoginController obj= loader.getController();
			obj.setController(controller);
			Scene scene = new Scene(pane,710,468);
			currentStage.setScene(scene);                                      
			currentStage.show();
			
			 
	}
	
	
}
