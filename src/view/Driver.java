package view;

import controller.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import model.Date;

import java.util.Arrays;
import java.util.Calendar;


public class Driver extends Application {

    private static Stage mainStage;

    public static Stage getMainStage()
    {
        return mainStage;
    }

    public void start(Stage primaryStage) throws Exception
    {
        mainStage = primaryStage;


        FXMLLoader loader = new FXMLLoader(getClass().getResource("MainWindow.fxml"));
        MainController mainController = new MainController();
        loader.setController(mainController);
        Parent parent = loader.load();

        Date date = new Date();
        String dateStr = date.toString();

        mainController.setDateLabelText(dateStr);



        primaryStage.setTitle("Diet Tracker");
        primaryStage.setScene(new Scene(parent, 1000, 600));
        primaryStage.show();

    }


    public static void main(String[] args)
    {
        launch(args);
    }
}
