package tugas3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.TilePane;
//import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

//@author meidina
 
public class Tugas_Event_Handler extends Application {
    
    @Override
    public void start(Stage window){
        GridPane root = new GridPane();
        root.setMinSize (400,200);
        root.setPadding(new Insets(10, 10, 10, 10));
        root.setVgap(5);
        root.setHgap(5);
        root.setAlignment(Pos.CENTER);
        
        Text textA = new Text("A");
        TextField tfA = new TextField();
        
        Text textB = new Text("B");
        TextField tfB = new TextField();
        
        Text textHasil1 = new Text("Hasil");
        Text textHasil2 = new Text();
        
        
        TilePane tpane = new TilePane();
        Button btPlus = new Button("+");
        Button btMinus = new Button("-");
        Button btClear = new Button ("Clear");
        tpane.setOrientation(Orientation.HORIZONTAL);
        tpane.getChildren().addAll(btPlus, btMinus, btClear);
        
        //baris 1
        root.add(textA, 0, 0);
        root.add(tfA, 1, 0);
        
        //baris 2
        root.add(textB, 0, 1);
        root.add(tfB, 1, 1);
        
        //baris 3
        root.add(textHasil1, 0, 2);
        root.add(textHasil2, 1, 2);
        
        //baris 4
        root.add(tpane, 1, 3);
        
        Scene scene1 = new Scene(root);
        window.setScene(scene1);
        window.show();
        
        btPlus.setOnAction(value -> {
            Double hasil = Double.parseDouble(tfA.getText()) + Double.parseDouble(tfB.getText());
            textHasil2.setText(tfA.getText() + " + "+ tfB.getText() + " = " + hasil.toString());
        });
        
        btMinus.setOnAction(value -> {
            Double hasil = Double.parseDouble(tfA.getText()) - Double.parseDouble(tfB.getText());
            textHasil2.setText(tfA.getText() + " - "+ tfB.getText() + " = " + hasil.toString());
        });
        
        btClear.setOnAction(value -> {
            tfA.setText(" ");
            tfB.setText(" ");
            textHasil2.setText(" ");
        
        });
        
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
