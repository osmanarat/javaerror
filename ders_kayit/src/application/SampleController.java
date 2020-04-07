package application;

import java.awt.TextField;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class SampleController implements Initializable{
	
	String strName,strpassword,stremail;
	
	
	@FXML
	private TextField txt_username,txt_password,txt_email;
	
	
	
	
	ObservableList<bilgilerim> liste = FXCollections.observableArrayList();
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<String> bilgilerim;

    @FXML
    private TableColumn<bilgilerim, String> bilgilerim_ad;

    @FXML
    private TableColumn<bilgilerim, String> bilgilerim_soyad;

    @FXML
    private TableColumn<bilgilerim, String> bilgilerim_mail;


    	
    	
    	public void initialize(URL arg0,ResourceBundle arg1) {
    		
    		try {
    			Connection baglanti=DriverManager.getConnection("jdbc:mysql://localhost:3306/udemy?serverTimezone=UTC","root","");
    			Statement sta=baglanti.createStatement();
    			ResultSet rse=sta.executeQuery("select * from bilgilerim");
    			while(rse.next()){
    				System.out.println( rse.getString("bilgilerim_ad"));
    				liste.addAll(new bilgilerim(rse.getString("bilgilerim_ad"),rse.getString("bilgilerim_soyad"),rse.getString("bilgilerim_mail")));

    			}
    			
    			   
    } catch (SQLException e) {
    			e.printStackTrace();
    		}
    		bilgilerim_ad.setCellValueFactory(new PropertyValueFactory<>("bilgilerim_ad"));
    		bilgilerim_soyad.setCellValueFactory(new PropertyValueFactory<>("bilgilerim_soyad"));
    		bilgilerim_mail.setCellValueFactory(new PropertyValueFactory<>("bilgilerim_mail"));

        assert bilgilerim != null : "fx:id=\"bilgilerim\" was not injected: check your FXML file 'Sample.fxml'.";
        assert bilgilerim_ad != null : "fx:id=\"bilgilerim_ad\" was not injected: check your FXML file 'Sample.fxml'.";
        assert bilgilerim_soyad != null : "fx:id=\"bilgilerim_soyad\" was not injected: check your FXML file 'Sample.fxml'.";
        assert bilgilerim_mail != null : "fx:id=\"bilgilerim_mail\" was not injected: check your FXML file 'Sample.fxml'.";

    }
}
