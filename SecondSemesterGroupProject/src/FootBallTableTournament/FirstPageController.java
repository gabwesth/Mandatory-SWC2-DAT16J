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
import java.sql.SQLException;

public class FirstPageController {
    Main scene = new Main();

    @FXML
    private Button UseExisting;

    @FXML
    private Button CreateNew;

    @FXML
    void OpenCreatePage(ActionEvent event) throws SQLException {
        scene.openWindow(event,"CreatePage.fxml","Create New Tournament" );

    }

    @FXML
    void OpenExistingPage(ActionEvent event) throws SQLException {
        scene.openWindow(event,"UsePage.fxml","Use Existing Tournament" );
    }

}
