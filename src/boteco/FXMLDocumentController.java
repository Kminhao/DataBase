package boteco;

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
public class FXMLDocumentController implements Initializable {

    @FXML
    private Text text1; // nome
    @FXML
    private Text text2; //cpf
    @FXML
    private Text text3; //cu   
    // @FXML private TextField textfield1; //preenche nome 
    //@FXML private TextField textfield2; // preenche cpf
    @FXML
    private Button buttonIn; // faz a prra toda
    @FXML
    private Button buttonDe;
    @FXML
    private Button buttonUp;
        @FXML
    private Button buttonNAO;

    @FXML
    private void goInsert(ActionEvent event) {
        System.out.println("test");

    }

    @FXML
    private void goDelete(ActionEvent event) {
        System.out.println("test");

    }

    @FXML
    private void goUpdate(ActionEvent event) {
        System.out.println("test");

    }
        @FXML
    private void goMEE(ActionEvent event) {
        System.out.println("sarude dand storm");

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
