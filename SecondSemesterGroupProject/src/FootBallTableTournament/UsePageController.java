package FootBallTableTournament;

import com.sun.javafx.binding.StringFormatter;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UsePageController {

    Main scene = new Main();

        @FXML
        private ChoiceBox TournamentsOption;

        @FXML
        private Button OKbutton;

        @FXML
        private Button BackBtt;

        @FXML
        void ShowTournamentPage(ActionEvent event) {

        }

        @FXML
        void LoadFirstPage(ActionEvent event) {
            scene.openWindow(event,"FirstPage.fxml","Welcome!" );
        }

        @FXML
        ObservableList GetTournamentsName() throws SQLException {

            ObservableList<String> optionList = null;
            //create a connection
            Connection con = DBconnection.getConnection();
            Statement st = con.createStatement();
            String sql = ("SELECT Name FROM `tournaments`");
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                optionList = FXCollections.observableArrayList(rs.getString("Name"));
                con.close();
            }

            return optionList;
        }

         @FXML
         void initialize() throws SQLException {
            TournamentsOption.setItems(GetTournamentsName());
         }

}
