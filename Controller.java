import java.awt.*;

class Controller {

    private Model logModel;
    private View logView;

    Controller(Model m) {
        logModel = m;
        logView = new View(this);
    }

    void start() {
        logView.showLogs(logModel.getData());
        logView.start();
    }

    void useButton()
    {
        ChildController childController = new ChildController(logModel);
        logModel.childCtrl = childController;
        childController.start();
    }

}