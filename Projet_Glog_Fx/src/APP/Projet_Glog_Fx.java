/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APP ;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 *
 * @author Juba
 */
public class Projet_Glog_Fx extends Application {
    
    
    //public Stage ss = null;
   // public Parent vue = null;
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load( getClass().getResource("/Login_ui/Login_ui.fxml"));
        //vue = FXMLLoader.load( getClass().getResource("/projet_glog_fx/FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        
       // ss = stage;
    }
    
   /*public void newScen(){
        
        //Parent root = FXMLLoader.load( getClass().getResource("/Login_ui/Login_ui.fxml"));
        //Parent root = FXMLLoader.load( getClass().getResource("/projet_glog_fx/FXMLDocument.fxml"));
        
        Scene scene = new Scene(vue);
        
        ss.setScene(scene);
        ss.show();

    }*/

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        
    }
    
}
