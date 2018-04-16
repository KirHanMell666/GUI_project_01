import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.awt.event.*;

class Controller {

    private Model logModel;
    private View logView;

    Controller(Model m) {
        logModel = m;
        logView = new View(this);
    }

    void start() {
        //logModel.dumpData();
        logView.showLogs(logModel.getData());
        logView.start();
    }

    void useButton(JButton jButton)
    {
        ChildController childController = new ChildController(logModel);
        logModel.childCtrl = childController;
        childController.start();
    }

}