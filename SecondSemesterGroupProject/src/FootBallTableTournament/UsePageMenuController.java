package FootBallTableTournament;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;

public class UsePageMenuController {
    @FXML
    private Button ScheduleBtt;
    @FXML
    private Button BackBtt;
    @FXML
    private Button ResultsBtt;
    @FXML
    private Button StandingBtt;

    public void getMenu(ActionEvent event){
            //Load the next page
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Table.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("New Tournament");
            stage.setScene(new Scene(root1, 737, 533));
            ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
            stage.show();
        }catch (IOException e) {
        }
    }
}
