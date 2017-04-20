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
    private void LoadFirstPage(ActionEvent event) {
        scene.openWindow(event,"FirstPage.fxml","Welcome!" );
    }

    @FXML
    private void LoadTable(ActionEvent event){
        String TName = NewTournamentName.getText();
        int TNumbers = (int) TeamNumbers.getValue();
        System.out.println(TName +" _ "  + TNumbers);

        try{
            //INSERT INTO `Tournaments` (`Name`, `Scheadule`, `NumberOfTeams`, `Result`) VALUES ('EasterTournamentDat16J', NULL, '6', NULL)
            String sql = "INSERT INTO `Tournaments` VALUES ('"+TName+"' , NULL, '"+TNumbers+"', NULL)";
            System.out.println(sql);
            //Create a connection and execute the Statement
            Connection con = DBconnection.getConnection();
            Statement stmt = con.createStatement();
            stmt.executeUpdate(sql);
            con.close();
            //Load the next page
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Table.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("New Tournament");
            stage.setScene(new Scene(root1, 737, 533));
            ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
            stage.show();

        } catch (IOException e) {
           e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    @FXML
    private void initialize(){
        TeamNumbers.setItems(optionList);
    }

}
