/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login_ui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Juba
 */
public class Main_uiController implements Initializable {

    @FXML
    private AnchorPane iScene;

    @FXML
    private AnchorPane rootAnchor;

    @FXML
    void btnMembreClicked(MouseEvent event) throws IOException {
        /* Parent root = null;
        
        try{
            root = FXMLLoader.load(getClass().getResource("New"))
        }*/
/*
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(getClass().getResource("newMember_ui.fxml"));

        AnchorPane pan = Loader.load();
        iScene.getChildren().setAll(pan);
*/
        //AnchorPane.setBottomAnchor(iScene, 0.0);
        //AnchorPane.setTopAnchor(iScene, 83.0);
        //AnchorPane.setLeftAnchor(iScene,136.0);
        //AnchorPane.setRightAnchor(iScene, 0.0);

        //rootAnchor.
        //iScene. ;
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
