package views;

import java.awt.FlowLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class MainFrame extends JFrame {
    JPanel mainPanel;
    JLabel fejlec;
    public DefaultComboBoxModel<String> groupModel;
    public JComboBox<String> groupCombo;
    public MainFrame() {
        this.Fejlec();
        this.setMainComponent();
        this.setMainPanel();
        this.setMainFrame();
    }
    private void setMainComponent() {
        this.groupModel = new DefaultComboBoxModel<>();
        this.groupCombo = new JComboBox<>(this.groupModel);
    }
    private void setMainPanel() {
        this.mainPanel = new JPanel();
        this.mainPanel.add(this.groupCombo);
    }
    private void setMainFrame() {
        this.add(this.mainPanel);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setVisible(true);
    }
    private void Fejlec() {
		this.fejlec = new JLabel("Sangare Fantha Felisha");
		this.add(this.fejlec);
		this.setSize(400, 300);
		this.setVisible(true);
	}	

}
