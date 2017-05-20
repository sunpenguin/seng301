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

import java.io.InputStream;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


/**
 * @author Sunguin Peng
 */
public class Main extends Application {
    // TODO add @FXML tags above all fxml methods
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
        // TODO Find a better way to initialize rides dictionary
        userAccount = new Account("User", 420);
        generalData = new GeneralData();
        generalData.addAccount(userAccount);
        generalData.getRides().put(userAccount.getId(), new ArrayList<>());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
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
