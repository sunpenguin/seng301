package core;

import controllers.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Account;
import model.GeneralData;
import model.Trip;

import java.io.InputStream;


/**
 * @author Sunguin Peng
 */
public class Main extends Application {
    private Stage primaryStage = null;
    private VBox mainContainer = null;
    private MainController mainController = null;

    private Account userAccount = null;
    private GeneralData generalData;

    public static void main( String[] args )
    {
        launch(args);
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    /**
     * Starts up the test data. ALso adds a trip in for testing rides.
     */
    public void testStartUp() {
        userAccount = new Account("User");
        generalData = new GeneralData();
        userAccount.addTrip("Test 1",
                new Trip("Test 1", generalData.getRoutes().get("Route 2"), 0,
                        userAccount.getVehicles().get("Honda"), 1));
        generalData.setCurrentTrip("Test 1");
    }

    public Account getUserAccount() {
        return userAccount;
    }

    public GeneralData getGeneralData() {
        return generalData;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        testStartUp();

        this.primaryStage = primaryStage;

        FXMLLoader loader = new FXMLLoader();
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("main.fxml");
        mainContainer = loader.load(inputStream);
        Scene scene = new Scene(mainContainer, 1000, 800);
        primaryStage.setTitle("UC RSS");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false); // While it cannot be scaled while resizing
        primaryStage.show();
        mainController = loader.getController();
        mainController.setApp(this);
        mainController.replaceSceneContent("home.fxml");
        inputStream.close();
    }

    /**
     * Replace Scene Content with fxml file code from oracle.
     * @param filePath
     * @return
     * @throws Exception
     */
    public Initializable replaceSceneContent(String filePath) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(filePath);
        Parent page = loader.load(inputStream);
        inputStream.close();
        while(mainContainer.getChildren().size() > 1) {
            mainContainer.getChildren().remove(1);
        }
        mainContainer.getChildren().add(page);
        return loader.getController();
    }
}
