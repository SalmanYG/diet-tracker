package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import view.Driver;

public class MainController {
    private static Stage mainStage = Driver.getMainStage();

    @FXML
    private Label dateLabel;

    public void setDateLabelText(String date)
    {
        dateLabel.setText(date);
    }

    public void mealClickHandler(MouseEvent mouseEvent)
    {
        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/SecondScreen.fxml"));
            Parent root1 = fxmlLoader.load();
            mainStage.setScene(new Scene(root1));
            mainStage.show();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void dataClickHandler(MouseEvent mouseEvent)
    {
    }
}
