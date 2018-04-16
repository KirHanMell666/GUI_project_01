import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.awt.event.*;

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

    void useButtonTextField(JButton jButton, JTextField tf)
    {
                logModel.addData(logChildView.tf.getText());
                logChildView.tf.setText("");
                //logChildView.showLogs(logModel.getData());

                logChildView.validate();
                logChildView.repaint();
                //logChildView.pack();
                //logChildView.setSize(1024,768);
    }

}