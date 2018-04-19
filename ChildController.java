import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.awt.event.*;

class ChildController {

    private Model logModel;
    private ChildView logChildView;
    JLabel mainLabel = new JLabel();

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
                logChildView.create(logChildView.tf.getText());
                logChildView.tf.setText("");
                //logChildView.showLogs(logModel.getData());

                logChildView.p.validate();
                logChildView.validate();
                logChildView.p.repaint();
                logChildView.repaint();
                //logChildView.pack();
                //logChildView.setSize(1024,768);
    }

}