package FootBallTableTournament;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CreatePageController {

    ObservableList<String> numberOfTeamsOption = FXCollections.observableArrayList("4","6","8","10");
    @FXML
    private ChoiceBox TeamNumbers;
    @FXML
    private TextField NewTeamName;
    @FXML
    private Button BackBtt;
    @FXML
    private Button NextBtt;

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
            ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    private void LoadTable(ActionEvent event){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Table.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("New Tournament");
            stage.setScene(new Scene(root1, 737, 533));
            ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    private void initialize(){
        TeamNumbers.setItems(numberOfTeamsOption);
    }

}
