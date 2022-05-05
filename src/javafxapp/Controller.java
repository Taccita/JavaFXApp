package javafxapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {
    public TextField endId;
    public TextField pathId;

    @FXML
    public void btnFindClick(ActionEvent event){
        System.out.println("Find!");

    }
    @FXML
    public void btnCancelClick(ActionEvent event){
        System.out.println("Try to Cancel!");}
}
