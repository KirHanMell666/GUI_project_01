import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

class ChildView extends JFrame {

    JTextField tf = new JTextField();
    JPanel p = new JPanel();
    JPanel p2 = new JPanel();
    JScrollPane jsp = new JScrollPane(p);
    JButton bAdd = new JButton("Add Element");

    private final ChildController childCtrl;

    ChildView(ChildController logChildController) {
        this.childCtrl = logChildController;
        init();
    }

    void init() {
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
    }

    void showLogs(List<Log> data) {
        setBackground(Color.DARK_GRAY);

        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));

        for (Log log : data) {

            JLabel jLabel = new JLabel(log.toString());
            p.add(jLabel);
        }

        bAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                childCtrl.useButtonTextField(bAdd,tf);
            }
        });

        tf.setPreferredSize(new Dimension(500,25));

        p2.add(tf);
        p2.add(bAdd);
        add(jsp);
        add(p2);

        pack();
        setSize(1024, 768);
    }

    void start() {
        setVisible(true);
    }
}