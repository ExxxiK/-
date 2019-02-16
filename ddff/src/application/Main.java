package application;
	
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;
 
public class Main  extends Application {
    
  
    @Override
    public void start(Stage primaryStage) {
        try {
		     ObservableList<PieChart.Data>  list = FXCollections.observableArrayList(
		    		 new PieChart.Data("abc", 1),
		    		 new PieChart.Data("1", 12),
		    		 new PieChart.Data("1", 1));
		     PieChart chart = new PieChart(list);
            primaryStage.setScene(new Scene(chart));
            primaryStage.show();
         
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}