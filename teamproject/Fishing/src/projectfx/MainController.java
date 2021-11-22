package projectfx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainController {
	
	
	@FXML
	private Button GotoSignUpBtn;
	@FXML
	private Button GotoSignInBtn;
	@FXML
	private Button GotoMain1Btn;
	@FXML
	private Button GotoRankBtn;
	@FXML
	private Button GotoShopBtn;
	@FXML
	private Button GotoBookBtn;
	@FXML
	private Button PlayBtn;
	@FXML
	private Button BackBtn;
	
	public void ChangeScene1() {
		try {
			Parent login = FXMLLoader.load(getClass().getResource("join.fxml"));
			Scene scene = new Scene(login);
			Stage primaryStage = (Stage) GotoSignUpBtn.getScene().getWindow(); // �쁽�옱 �쐢�룄�슦 媛��졇�삤湲�
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@FXML

	public void ChangeScene2() {
		try {
			Parent login = FXMLLoader.load(getClass().getResource("Login.fxml"));
			Scene scene = new Scene(login);
			Stage primaryStage = (Stage) GotoSignInBtn.getScene().getWindow(); // �쁽�옱 �쐢�룄�슦 媛��졇�삤湲�
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	

	public void ChangeScene3() {
		try {
			Parent login = FXMLLoader.load(getClass().getResource("play1.fxml"));
			Scene scene = new Scene(login);
			Stage primaryStage = (Stage) GotoMain1Btn.getScene().getWindow(); // �쁽�옱 �쐢�룄�슦 媛��졇�삤湲�
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void ChangeScene4() {
		try {
			Parent login = FXMLLoader.load(getClass().getResource("Ranking.fxml"));
			Scene scene = new Scene(login);
			Stage primaryStage = (Stage) GotoRankBtn.getScene().getWindow(); // �쁽�옱 �쐢�룄�슦 媛��졇�삤湲�
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void ChangeScene5() {
		try {
			Parent login = FXMLLoader.load(getClass().getResource("Shop.fxml"));
			Scene scene = new Scene(login);
			Stage primaryStage = (Stage) GotoShopBtn.getScene().getWindow(); // �쁽�옱 �쐢�룄�슦 媛��졇�삤湲�
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void ChangeScene6() {
		try {
			Parent login = FXMLLoader.load(getClass().getResource("Fishbook.fxml"));
			Scene scene = new Scene(login);
			Stage primaryStage = (Stage) GotoBookBtn.getScene().getWindow(); // �쁽�옱 �쐢�룄�슦 媛��졇�삤湲�
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void ChangeScene7() {
		try {
			Parent login = FXMLLoader.load(getClass().getResource("play2.fxml"));
			Scene scene = new Scene(login);
			Stage primaryStage = (Stage) PlayBtn.getScene().getWindow(); // �쁽�옱 �쐢�룄�슦 媛��졇�삤湲�
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void ChangeScene8() {
		try {
			Parent login = FXMLLoader.load(getClass().getResource("play1.fxml"));
			Scene scene = new Scene(login);
			Stage primaryStage = (Stage) BackBtn.getScene().getWindow(); // �쁽�옱 �쐢�룄�슦 媛��졇�삤湲�
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
