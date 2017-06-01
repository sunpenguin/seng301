package core;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import controllers.SceneType;
import controllers.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Account;
import model.GeneralData;
import model.Vehicle;
import utils.Session;

import java.io.*;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


/**
 * @author Sunguin Peng
 */
public class Main extends Application {

    static Gson gson = new GsonBuilder().create();

    private Stage primaryStage = null;
    private VBox mainContainer = null;
    private MainController mainController = null;

    private GeneralData generalData;

    public static void main( String[] args )
    {
        launch(args);
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public GeneralData getGeneralData() {
        return generalData;
    }

    public void toggleMenuDisable() {
        mainController.toggleMenuDisable();
    }

    public void setPassengerSettings(Boolean toPassenger) {
        mainController.setPassengerSettings(toPassenger);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        generalData = load();

        this.primaryStage = primaryStage;

        FXMLLoader loader = new FXMLLoader();
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(SceneType.MENU_BAR.getFilePath());
        mainContainer = loader.load(inputStream);
        javafx.scene.Scene scene = new javafx.scene.Scene(mainContainer, 1000, 800);
        primaryStage.setTitle("UC RSS");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false); // While it cannot be scaled while resizing
        primaryStage.show();
        mainController = loader.getController();
        mainController.setApp(this);
        mainController.replaceSceneContent(SceneType.LOG_IN_SCREEN);
        inputStream.close();
    }

    /**
     * Replace SceneType Content with fxml file code from oracle.
     * @param filePath
     * @return
     * @throws Exception
     */
    public Initializable replaceSceneContent(SceneType filePath) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(filePath.getFilePath());
        Parent page = loader.load(inputStream);
        inputStream.close();
        while(mainContainer.getChildren().size() > 1) {
            mainContainer.getChildren().remove(1);
        }
        mainContainer.getChildren().add(page);
        return loader.getController();
    }


    public static GeneralData load() throws UnsupportedEncodingException {
        Reader reader = new InputStreamReader(Main.class.getResourceAsStream("/data.json"), "UTF-8");
        return gson.fromJson(reader, GeneralData.class);
    }

    public static void save(GeneralData system) throws IOException {
        Writer writer = new OutputStreamWriter(new FileOutputStream("src/main/resources/data.json"), "UTF-8");
        gson.toJson(system, writer);
        writer.close();
    }

    @Override
    public void stop() {
        try {
            save(generalData);
        } catch (IOException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Saving Error");
            alert.setHeaderText("Error Saving your Data");
            alert.setContentText("It seems like your data cannot be saved (the program has successfully failed)");
        }
    }
}
