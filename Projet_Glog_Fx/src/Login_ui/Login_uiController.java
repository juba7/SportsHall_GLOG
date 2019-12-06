/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login_ui;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXSpinner;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Juba
 */
public class Login_uiController implements Initializable {

    
    @FXML
    private AnchorPane iPane;
    
    @FXML
    private JFXTextField user;

    @FXML
    private JFXPasswordField mp;

    @FXML
    private JFXButton btn_submit;

    @FXML
    private JFXButton btn_restormp;

    @FXML
    private JFXSpinner pb_loading;

    @FXML
    private Label label_error;
    
    @FXML
    void handleButtonSubmit(MouseEvent event)  {


        FXMLLoader Loader = new FXMLLoader();
        
        Loader.setLocation(getClass().getResource("Main_ui.fxml"));
        try{
            Loader.load();
        }
        catch(IOException ex){
        
        }
        
        Parent p = Loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(p));
        stage.show();
        
        ((Node)(event.getSource())).getScene().getWindow().hide();

        if(!validateConnexionField()) {
            drawErrorBox("Veuillez remplir tous les champs du formulaire");
           return;
        }
        
        drawErrorBox();
        btn_submit.disableProperty().set(true);
        btn_submit.textProperty().set(" ");
        pb_loading.visibleProperty().set(true);
        
        
  
    }
    
    void loadNewScene() throws IOException{

    }
    
    
    
    Boolean validateConnexionField(){
    //label_error.textProperty().set(mp.textProperty().toString());
        
        if(  mp.textProperty().getValue().equals("")  
                || user.textProperty().getValue().equals("") )
            return false;
        
        return true;
    }
    
    void drawErrorBox(String s ){
        
            label_error.visibleProperty().set(true);
            label_error.textProperty().set(s);
        
    }
    void drawErrorBox(){
         label_error.visibleProperty().set(false);
    }
    
    /**
     * Initializes the controller class.
     */
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
  
    
}
