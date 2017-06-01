package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.Account;
import model.GeneralData;
import model.Notification;
import utils.Session;

/**
 * Controller class for notification popup.
 */
public class NotificationPopUpController extends Controller {

    @FXML private Text notificationsText;

    GeneralData generalData;
    Account accountToCheck;

    public void load() {
        generalData = getParent().getGeneralData();
        accountToCheck = Session.getInstance().getCurrentAccount();

        // Notifications
        Notification notification = generalData.getNotifications().get(accountToCheck.getUniversityID());
        notification.updateAccount(accountToCheck);
        notificationsText.setText(notification.checkNotifications());
    }

    @FXML
    private void exitNotifications() {
        Stage stage = (Stage) notificationsText.getScene().getWindow();
        stage.close();
    }
}
