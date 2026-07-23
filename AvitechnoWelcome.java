import javax.swing.*;
import java.awt.*;

public class AvitechnoWelcome extends JFrame {

    public AvitechnoWelcome() {
        setTitle("Avitechno World");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        BackgroundPanel panel = new BackgroundPanel("assets/background.jpg");
        panel.setLayout(new BorderLayout());

        JLabel label = new JLabel("Welcome to Avitechno World", SwingConstants.CENTER);
        label.setFont(new Font("Segoe UI", Font.BOLD, 36));
        label.setForeground(Color.WHITE);

        JLabel subLabel = new JLabel("Innovate | Automate | Transform", SwingConstants.CENTER);
        subLabel.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        subLabel.setForeground(Color.LIGHT_GRAY);

        JPanel textPanel = new JPanel();
        textPanel.setOpaque(false);
        textPanel.setLayout(new GridLayout(2,1));
        textPanel.add(label);
        textPanel.add(subLabel);

        panel.add(textPanel, BorderLayout.CENTER);

        add(panel);
    }

    class BackgroundPanel extends JPanel {
        private Image backgroundImage;

        public BackgroundPanel(String fileName) {
            backgroundImage = new ImageIcon(fileName).getImage();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new AvitechnoWelcome().setVisible(true);
        });
    }
}
