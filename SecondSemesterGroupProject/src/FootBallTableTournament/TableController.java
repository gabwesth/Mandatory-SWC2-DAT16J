package FootBallTableTournament;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class TableController {

    CreatePageController cpc = new CreatePageController();

    @FXML
    private TextField EmailP2;
    @FXML
    private TextField EmailP1;
    @FXML
    private TextField NameP2;
    @FXML
    private TextField NameP1;
    @FXML
    private TextField DOBp2;
    @FXML
    private TextField DOBp1;

    @FXML
    private Button ShowShedulBtt;
    @FXML
    private Button FinalSave;
    @FXML
    private Button SavePlayer1;
    @FXML
    private Button SavePlayer2;

    @FXML
    private TableView<TableController> Table;

    @FXML
    private TableColumn<TableController, String> Name;
    @FXML
    private TableColumn<TableController, String> Email;
    @FXML
    private TableColumn<TableController, String> DOB;
    @FXML
    private TableColumn<TableController, String> Rank;
    @FXML
    private TableColumn<TableController, String> Team;

        @FXML
        void LoadPlayerOnTable(ActionEvent event) {

            }
            @FXML
        void CommitToDB(ActionEvent event) {

        }

        @FXML
        void DeleteTableContentPlayer(ActionEvent event) {

        }



        @FXML
        void UpdateTableContentMatch(ActionEvent event) {

        }

        @FXML
        void DeleteTableContentMatch(ActionEvent event) {

        }

        @FXML
        void DispaySchedule(ActionEvent event) {

            //if 4team condition is satisfied, launch 4team schedule
            if(cpc.condition4 = true) {
                try{
                FXMLLoader fxmlLoader4 = new FXMLLoader(getClass().getResource("fourTeamSchedule.fxml"));
                Parent root2 = (Parent) fxmlLoader4.load();
                Stage stage4 = new Stage();
                stage4.setTitle("4-Team Tournament");
                stage4.setScene(new Scene(root2, 570, 200));
                //((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
                stage4.show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(cpc.condition6 = true) {
                try{
                    FXMLLoader fxmlLoader6 = new FXMLLoader(getClass().getResource("sixTeamSchedule.fxml"));
                    Parent root3 = (Parent) fxmlLoader6.load();
                    Stage stage6 = new Stage();
                    stage6.setTitle("6-Team Tournament");
                    stage6.setScene(new Scene(root3, 550, 225));
                    //((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
                    stage6.show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(cpc.condition8 = true) {
                try{
                    FXMLLoader fxmlLoader8 = new FXMLLoader(getClass().getResource("eightTeamSchedule.fxml"));
                    Parent root3 = (Parent) fxmlLoader8.load();
                    Stage stage8 = new Stage();
                    stage8.setTitle("8-Team Tournament");
                    stage8.setScene(new Scene(root3, 650, 300));
                    //((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
                    stage8.show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(cpc.condition10 = true) {
                try{
                    FXMLLoader fxmlLoader10 = new FXMLLoader(getClass().getResource("tenTeamSchedule.fxml"));
                    Parent root4 = (Parent) fxmlLoader10.load();
                    Stage stage10 = new Stage();
                    stage10.setTitle("10-Team Tournament");
                    stage10.setScene(new Scene(root4, 650, 330));
                    //((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
                    stage10.show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        }
