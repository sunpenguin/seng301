package controllers;

import core.Main;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * The abstract controller class.
 * Implements Initializable so other controllers fo not need to implement it.
 * @author Sunguin Peng
 */
public abstract class Controller implements Initializable {
    private Main parent = null;

    /**
     * Set the parent app
     * @param parent    The parent to set
     */
    public void setApp(Main parent){
        this.parent = parent;
    }

    /**
     * Get parent App
     * @return  The parent app
     */
    public Main getParent(){
        return parent;
    }

    /**
     * Replaces content and loads the content with the load method
     * @param filePath  The name of the file path as a string
     */
    public void replaceSceneContent(SceneType filePath){
        try {
            Controller controller = (Controller)
                    parent.replaceSceneContent(filePath);
            controller.setApp(parent);
            controller.load();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Creates a popup window with a specific FXML scene. May be used later.
     * @param filePath  The name of the file path as a string
     * @param width The width of the window
     * @param height    The length of the window
     */
    public Stage createPopUpStage(SceneType filePath, int width, int height) {
        FXMLLoader loader = new FXMLLoader();
        InputStream in = getClass().getClassLoader().getResourceAsStream(filePath.getFilePath());
        Parent page = null;
        try {
            page = loader.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //set controller and call default calls
        Controller controller = loader.getController();
        controller.setApp(parent);
        controller.load();
        //create a new stage to popup
        Stage popupStage = new Stage();
        popupStage.initModality(Modality.APPLICATION_MODAL);
        //inner layout constraints
        VBox container = new VBox();
        container.getChildren().add(page);
        javafx.scene.Scene popupScene = new javafx.scene.Scene(container, width, height);
        //show
        popupStage.setScene(popupScene);
        popupStage.showAndWait();
        return popupStage;
    }

    /**
     * Abstract method. This serves as the method that initializes the scene after switching scenes
     */
    public abstract void load();

    /**
     * Initialize statement before anything loads.
     * @param location
     * @param resources
     */
    public void initialize(URL location, ResourceBundle resources) {

    }
}
