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
    Main scene = new Main();

    @FXML
    private Button ScheduleBtt;
    @FXML
    private Button BackBtt;
    @FXML
    private Button ResultsBtt;
    @FXML
    private Button StandingBtt;

    public void getMenu(ActionEvent event){
            scene.openWindow(event,"Table.fxml","New Tournament",737,533 );

    }
}
