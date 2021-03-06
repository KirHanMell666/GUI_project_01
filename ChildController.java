import javax.swing.*;

class ChildController {

    private Model logModel;
    private ChildView logChildView;

    ChildController(Model m) {
        logModel = m;
        logChildView = new ChildView(this);
    }

    void start() {
        //logModel.dumpData();
        logChildView.showLogs(logModel.getData());
        logChildView.start();
    }

    void useButtonTextField()
    {
                logModel.addData(logChildView.tf.getText());
                logChildView.create(logChildView.tf.getText());
                logChildView.tf.setText("");

                logChildView.validate();
    }

}