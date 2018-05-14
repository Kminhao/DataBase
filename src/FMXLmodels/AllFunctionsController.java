package FMXLmodels;

import boteco.Cliente;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author a1704435
 */
public class AllFunctionsController implements Initializable {
    
    
   @FXML private Text text1; // nome
   @FXML private Text text2; //cpf
   @FXML private Text text3; //cu
   @FXML private Text text4;
  // @FXML private TextField textfield1; //preenche nome 
    //@FXML private TextField textfield2; // preenche cpf
   @FXML private Button buttonIn; // faz a prra toda
   @FXML private Button buttonDe;
   @FXML private Button buttonUp;
   @FXML private Button buttontest;


   
   
   @FXML private void goInsert(ActionEvent event) {
  
    Node node = (Node) event.getSource();
    Stage stage = (Stage) node.getScene().getWindow();
    Parent root = null;
    try {
    root = FXMLLoader.load(getClass().getResource("/ViewFXML/InsertFXML.fxml"));
    } catch (IOException ex) {

    }

    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
  
   }
       /* Cliente cliente = new Cliente();
        cliente.setNome(textfield2.getText());
        cliente.setCpf(textfield1.getText());       
        cliente.inserir();
*/

      //  ClienteDAO clienteDAO = new ClienteDAO();
        
   @FXML private void goDelete(ActionEvent event) {
  
    Node node = (Node) event.getSource();
    Stage stage = (Stage) node.getScene().getWindow();
    Parent root = null;
    try {
    root = FXMLLoader.load(getClass().getResource("/ViewFXML/DeleteFXML.fxml"));
    } catch (IOException ex) {

    }

    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
  
   }
      @FXML private void goUpdate(ActionEvent event) {
  
    Node node = (Node) event.getSource();
    Stage stage = (Stage) node.getScene().getWindow();
    Parent root = null;
    try {
    root = FXMLLoader.load(getClass().getResource("/ViewFXML/UpdateFXML.fxml"));
    } catch (IOException ex) {

    }

    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
  
   }
        
    
    

 
 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
