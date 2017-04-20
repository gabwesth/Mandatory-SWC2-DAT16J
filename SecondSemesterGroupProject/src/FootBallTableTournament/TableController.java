package FootBallTableTournament;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class TableController {

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

        }
        }
