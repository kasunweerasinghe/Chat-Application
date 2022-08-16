package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * created by kasunrachintha on 8/14/22
 *
 * @author : kasunrachintha
 * @Date :  8/14/22
 * @Project : Chat-Application-Using-Socket-Programming
 **/
public class LoginFromController {

    public TextField txtUserName;
    public static String userName;

    public void btnLoginOnAction(ActionEvent actionEvent) throws IOException {
        userName =txtUserName.getText();
        Stage stage = (Stage) txtUserName.getScene().getWindow();
        stage.close();
        Stage stage1 = new Stage();
        stage1.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/clientForm.fxml"))));
        stage1.setTitle("Online Chat ");
        stage1.setResizable(false);
        stage1.centerOnScreen();
        stage1.show();
    }
}
