import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

class View extends JFrame{

    JPanel p = new JPanel();
    JButton button = new JButton("Click Me");

    private final Controller ctrl;

    View(Controller logController) {
        this.ctrl = logController;
        init();
    }

    void init() {
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
    }

    void showLogs(List<Log> data) {
        setBackground(Color.DARK_GRAY);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        p.setLayout(new FlowLayout());

        for (Log log : data) {

            JLabel jLabel = new JLabel(log.toString());
            p.add(jLabel);
        }

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ctrl.useButton(button);
            }
        });

        p.add(button);
        add(p);
        pack();
        setSize(640, 480);
    }

    void start() {
        setVisible(true);
    }
}

