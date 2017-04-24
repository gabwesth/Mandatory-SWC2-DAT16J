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
import java.util.ArrayList;

public class UsePageController {

    Main scene = new Main();
    public static String tour;
    public static String chosenTournament = "";

        @FXML
        private ChoiceBox TournamentsOption;

        @FXML
        private Button OKbutton;

        @FXML
        private Button BackBtt;

        @FXML
        void LoadFirstPage(ActionEvent event) {
            scene.openWindow(event,"FirstPage.fxml","Welcome!",395, 251 );
        }

        @FXML
        ObservableList GetTournamentsName() throws SQLException {

            ObservableList<String> optionList = FXCollections.observableArrayList();

            Connection con = DBconnection.getConnection();
            Statement st = con.createStatement();
            String sql = ("SELECT Name FROM `Tournaments`");
            ResultSet rs = st.executeQuery(sql);

            while(rs.next()) {
             optionList.add(rs.getString("Name"));

            }

            con.close();
            return optionList;
        }

         @FXML
         void initialize() throws SQLException {
            TournamentsOption.setItems(GetTournamentsName());
            tour = (String) TournamentsOption.getSelectionModel().getSelectedItem();
         }

         @FXML
         void ShowTournamentPage(ActionEvent event) throws SQLException
         {
             chosenTournament = (String) TournamentsOption.getValue();
             scene.openWindowAndClose(event,"UsePageMenu.fxml",chosenTournament,737, 533 );

         }

}
