import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class FootballGame extends JFrame {
    private int scoreMilan = 0;
    private int scoreMadrid = 0;
    private JLabel scoreDisplay;
    private JLabel recentGoal;
    private JLabel currentWinner;

    public FootballGame() {
        super("Football Game");
        setBounds(100, 100, 400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Метки для отображения текущего состояния игры
        scoreDisplay = new JLabel("Score: 0 : 0", JLabel.CENTER);
        recentGoal = new JLabel("Last Goal By: None", JLabel.CENTER);
        currentWinner = new JLabel("Current Winner: Tie", JLabel.CENTER);

        JPanel infoPanel = new JPanel(new GridLayout(3, 1));
        infoPanel.add(scoreDisplay);
        infoPanel.add(recentGoal);
        infoPanel.add(currentWinner);

        // Панель с кнопками
        JButton buttonMilan = new JButton("AC Milan");
        JButton buttonMadrid = new JButton("Real Madrid");

        // Изменение стилей кнопок
        buttonMilan.setBackground(Color.BLUE);
        buttonMilan.setForeground(Color.WHITE);
        buttonMadrid.setBackground(Color.RED);
        buttonMadrid.setForeground(Color.WHITE);

        buttonMilan.addActionListener(e -> handleButtonClick("Milan"));
        buttonMadrid.addActionListener(e -> handleButtonClick("Madrid"));

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(buttonMilan);
        buttonPanel.add(buttonMadrid);

        // Добавление компонентов в окно
        add(infoPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void handleButtonClick(String team) {
        if ("Milan".equals(team)) {
            scoreMilan++;
        } else if ("Madrid".equals(team)) {
            scoreMadrid++;
        }
        refreshGameStatus(team);
    }

    private void refreshGameStatus(String team) {
        scoreDisplay.setText("Score: " + scoreMilan + " : " + scoreMadrid);
        recentGoal.setText("Last Goal By: " + team);

        if (scoreMilan > scoreMadrid) {
            currentWinner.setText("Current Winner: AC Milan");
        } else if (scoreMadrid > scoreMilan) {
            currentWinner.setText("Current Winner: Real Madrid");
        } else {
            currentWinner.setText("Current Winner: Tie");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(FootballGame::new);
    }
}
