package FootBallTableTournament;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class UsePageController {

        @FXML
        private Button OKbutton;

        @FXML
        void ShowTournamentPage(ActionEvent event) {

        }
        @FXML
        private Button BackBtt;

        @FXML
        void LoadFirstPage(ActionEvent event) {
                try{
                        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FirstPage.fxml"));
                        Parent root1 = (Parent) fxmlLoader.load();
                        Stage stage = new Stage();
                        //stage.initModality(Modality.APPLICATION_MODAL);
                        //stage.initStyle(StageStyle.UNDECORATED);
                        stage.setTitle("Welcome!");
                        stage.setScene(new Scene(root1, 394, 251));
                        stage.show();
                } catch (IOException e) {
                        e.printStackTrace();
                }

        }

}
