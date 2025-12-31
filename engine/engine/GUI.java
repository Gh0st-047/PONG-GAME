import javax.swing.*;

public class GUI extends JFrame {
    private JTextField player1Field;
    private JTextField player2Field;
    private String[] playerNames;

    public GUI() {
        setTitle("Pong Game - Enter Player Names");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Player 1
        JLabel label1 = new JLabel("Player 1 Name:");
        player1Field = new JTextField(15);
        player1Field.setText("Player1");
        JPanel p1Panel = new JPanel();
        p1Panel.add(label1);
        p1Panel.add(player1Field);

        // Player 2
        JLabel label2 = new JLabel("Player 2 Name:");
        player2Field = new JTextField(15);
        player2Field.setText("Player2");
        JPanel p2Panel = new JPanel();
        p2Panel.add(label2);
        p2Panel.add(player2Field);

        // Start Button
        JButton startButton = new JButton("Start Game");
        startButton.addActionListener(e -> startGame());

        panel.add(p1Panel);
        panel.add(p2Panel);
        panel.add(startButton);

        add(panel);
        setVisible(true);
    }

    private void startGame() {
        String name1 = player1Field.getText().trim();
        String name2 = player2Field.getText().trim();

        if (name1.isEmpty() || name2.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter both player names!");
            return;
        }

        playerNames = new String[]{name1, name2};
        dispose();
        new Main().startPongGame(name1, name2);
    }

    public static void main(String[] args) {
        new GUI();
    }
}
