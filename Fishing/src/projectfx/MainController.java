package projectfx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainController {
	
	
	@FXML
	private Button GotoSighupBtn;
	@FXML
	private Button GotoSighinBtn;
	@FXML
	private Button GotoMain1Btn;

	public void SISU() {
		try {
			Parent login = FXMLLoader.load(getClass().getResource("/projextfx/Sigh.fxml"));
			Scene scene = new Scene(login);
			Stage primaryStage = (Stage) GotoSighupBtn.getScene().getWindow(); // 현재 윈도우 가져오기
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	} 
	@FXML

	public void SUSI() {
		try {
			Parent login = FXMLLoader.load(getClass().getResource("/projextfx/Login.fxml"));
			Scene scene = new Scene(login);
			Stage primaryStage = (Stage) GotoSighinBtn.getScene().getWindow(); // 현재 윈도우 가져오기
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	

	public void SIM1() {
		try {
			Parent login = FXMLLoader.load(getClass().getResource("/projextfx/Main.fxml"));
			Scene scene = new Scene(login);
			Stage primaryStage = (Stage) GotoMain1Btn.getScene().getWindow(); // 현재 윈도우 가져오기
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
