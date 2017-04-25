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
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CreatePageController {
    Main scene = new Main();
    public static int choice;
    public static String nameOfTournament;

    ObservableList<Integer> optionList = FXCollections.observableArrayList(4,6,8,10);

        @FXML
        public ChoiceBox TeamNumbers;
        @FXML
        private TextField NewTournamentName;
        @FXML
        private Button BackBtt;
        @FXML
        private Button NextBtt;


    @FXML
    private void goBack(ActionEvent event) {
        scene.openWindowAndClose(event,"FirstPage.fxml","Welcome!",395,251 );
    }

    @FXML
    private void LoadTable(ActionEvent event){
        String TName = NewTournamentName.getText();
        nameOfTournament = TName;
        int TNumbers = (int) TeamNumbers.getValue();
        System.out.println(TName +" _ "  + TNumbers);
        choice = (int) TeamNumbers.getSelectionModel().getSelectedItem();

        try{
            //INSERT INTO `Tournaments` (`Name`, `Scheadule`, `NumberOfTeams`, `Result`) VALUES ('EasterTournamentDat16J', NULL, '6', NULL)
            String sql = "INSERT INTO `Tournaments` VALUES ('"+TName+"' , NULL, '"+TNumbers+"', NULL)";
            String mySql = "CREATE TABLE IF NOT EXISTS `"+TName+"_players` (\n" +
                    "  `Name` varchar(30) NOT NULL,\n" +
                    "  `DateOfBirth` int(6) NOT NULL,\n" +
                    "  `Email` varchar(30) NOT NULL,\n" +
                    "  `Rank` int(11) \n" +
                    ")";
            String mySql = "CREATE TABLE IF NOT EXISTS `"+TName+"_Players` (\n" +
                    "  `Name` varchar(30) NOT NULL,\n" +
                    "  `DateOfBirth` int(6) NOT NULL,\n" +
                    "  `Email` varchar(30) NOT NULL,\n" +
                    "  `Rank` int(11) \n" +
                    ")";
            System.out.println(sql);
            //Create a connection and execute the Statement
            Connection con = DBconnection.getConnection();
            Statement stmt = con.createStatement();
            stmt.executeUpdate(sql);
            stmt.executeUpdate(mySql);
            stmt.executeUpdate(results);
            con.close();

            //Load the next page
            scene.openWindowAndClose(event,"Table.fxml","New Tournament",737,533);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    @FXML
    private void initialize(){
        TeamNumbers.setItems(optionList);
    }

}
