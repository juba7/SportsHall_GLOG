/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login_ui;

import com.jfoenix.controls.JFXTreeTableColumn;
import com.jfoenix.controls.JFXTreeTableView;
import com.jfoenix.controls.RecursiveTreeItem;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
//import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableRow;
import javafx.scene.control.TreeTableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.util.Callback;

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
    private JFXTreeTableView<Person> Table_membre;

    URL url_ ;
    ResourceBundle rb_ ;
    
    // tableau des Membres 
    ObservableList<Person> membres = FXCollections.observableArrayList();
    
    @FXML
    void btnMembreClicked(MouseEvent event) throws IOException {
       try {
        TreeTableView.TreeTableViewSelectionModel<Person> selectionModel = Table_membre.getSelectionModel();
        System.out.println("Login_ui.Main_uiController.btnMembreClicked()" + selectionModel.getSelectedItem().getValue().name );
       // selectionModel.getSelectedItem().getValue().name
       }
       catch(Exception e){
           System.out.println("aucun element selectioner"); 
       }
        membres.clear();
        //ObservableList<Person> person = FXCollections.observableArrayList();
        membres.add(new Person("Genius Coders", "20", "Pune"));
        membres.add(new Person("Nilesh Kadam", "20", "Hadapsar"));
        membres.add(new Person("Shailesh Kadam", "18", "Gondhalenagar"));
        membres.add(new Person("Subscirbers", "21", "All World"));

        initialize(url_, rb_);
        
        
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        url_ = url; rb_ =rb;
        
        // membres est le vecteur qui initialise la table 
        init_Tab_membre(membres);
    }
    
    void init_Tab_membre(ObservableList<Person> person){
        JFXTreeTableColumn<Person, String> name = new JFXTreeTableColumn("Nom");
        name.setPrefWidth(150);

        name.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<Person, String>, ObservableValue<String>>() {

            @Override
            public ObservableValue<String> call(TreeTableColumn.CellDataFeatures<Person, String> param) {
                return param.getValue().getValue().name;
            }
        });

        JFXTreeTableColumn<Person, String> age = new JFXTreeTableColumn("Age");
        age.setPrefWidth(100);

        age.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<Person, String>, ObservableValue<String>>() {

            @Override
            public ObservableValue<String> call(TreeTableColumn.CellDataFeatures<Person, String> param) {
                return param.getValue().getValue().age;
            }
        });

        JFXTreeTableColumn<Person, String> address = new JFXTreeTableColumn("Address");
        address.setPrefWidth(100);

        address.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<Person, String>, ObservableValue<String>>() {

            @Override
            public ObservableValue<String> call(TreeTableColumn.CellDataFeatures<Person, String> param) {
                return param.getValue().getValue().address;
            }
        });
                //ObservableList<Person> person = FXCollections.observableArrayList();    

        TreeItem<Person> root = new RecursiveTreeItem<Person>(person, RecursiveTreeObject::getChildren);
        Table_membre.getColumns().setAll(name, age, address);
        Table_membre.setRoot(root);
        Table_membre.setShowRoot(false);

    }
    

    class Person extends RecursiveTreeObject<Person> {

        StringProperty name;
        StringProperty age;
        StringProperty address;

        public Person(String name, String age, String address) {
            this.name = new SimpleStringProperty(name);
            this.age = new SimpleStringProperty(age);
            this.address = new SimpleStringProperty(address);

        }

    }

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
