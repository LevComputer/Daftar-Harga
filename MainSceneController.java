import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.image.ImageView;

public class MainSceneController {

    //FXML
    @FXML
    private CheckBox CheckBox1, CheckBox2, CheckBox3, CheckBox4, CheckBox5, CheckBox6, CheckBox7, CheckBox8, CheckBox9, CheckBox10;
    @FXML
    private ImageView ImageView1, ImageView2, ImageView3, ImageView4;
    @FXML
    private Label Label1, Label2, Label3, Label4, Label5, Label6, Label7;
    @FXML
    private ScrollBar ScrollBar1;
    
    public void change(ActionEvent event) {

        //DAFTAR HARGA SATUAN
        if(CheckBox1.isSelected()) {
            Label4.setText("Rp75.000,00");
        } else if(CheckBox2.isSelected()) {
            Label4.setText("Rp9.000,00 - Rp25.000,00 (Disesuaikan Size Software)");
        } else if(CheckBox3.isSelected()) {
            Label4.setText("Rp9.000,00 - Rp99.000,00 (Disesuaikan Size Game)");
        } else if(CheckBox4.isSelected()) {
            Label4.setText("Rp9.000,00 - Rp25.000,00 (Disesuaikan Size Movie)");
        } else if(CheckBox5.isSelected()) {
            Label4.setText("Rp75.000,00");
        } else if(CheckBox6.isSelected()) {
            Label4.setText("Rp75.000,00");
        } else if(CheckBox7.isSelected()) {
            Label4.setText("Rp400.000,00 - Rp800.000,00 (Disesuaikan Merk Laptop)");
        } else if(CheckBox8.isSelected()) {
            Label4.setText("Rp400.000,00 - Rp800.000,00 (Disesuaikan Merk Laptop)");
        } else if(CheckBox9.isSelected()) {
            Label4.setText("Rp800.000,00 - Rp2.000.000,00 (Disesuaikan Merk Laptop)");
        } else if(CheckBox10.isSelected()) {
            Label4.setText("Rp400.000,00 - Rp800.000,00 (Disesuaikan Merk Laptop)");
        } else {
            Label4.setText("TOTAL HARGA");
        }

        //DAFTAR HARGA PAKET A
        if(CheckBox1.isSelected() && CheckBox5.isSelected()) {
            Label4.setText("Rp125.000,00 (Diskon)");
        } else if(CheckBox1.isSelected() && CheckBox6.isSelected()) {
            Label4.setText("Rp125.000,00 (Diskon)");
        } else if(CheckBox5.isSelected() && CheckBox6.isSelected()) {
            Label4.setText("Rp150.000,00");
        }

        //DAFTAR HARGA PAKET B
        if(CheckBox1.isSelected() && CheckBox5.isSelected() && CheckBox6.isSelected()) {
            Label4.setText("Rp200.000,00 (Diskon + Max Performance)");
        }

    }

} 