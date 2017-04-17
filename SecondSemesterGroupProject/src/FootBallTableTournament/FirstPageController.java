package FootBallTableTournament;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.*;

import java.io.IOException;

public class FirstPageController {

    @FXML
    private Button UseExisting;

    @FXML
    private Button CreateNew;

    @FXML
    void OpenCreatePage(ActionEvent event) {
            try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CreatePage.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            //stage.initModality(Modality.APPLICATION_MODAL);
            //stage.initStyle(StageStyle.UNDECORATED);
            stage.setTitle("Create New Tournament");
            stage.setScene(new Scene(root1, 394, 251));
            ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
            stage.show();

        } catch (IOException e) {
                e.printStackTrace();
            }

    }

    @FXML
    void OpenExistingPage(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("UsePage.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Use Existing Tournament");
            stage.setScene(new Scene(root1, 394, 251));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
