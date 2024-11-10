package FootballScoreTracker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FootballMatch extends JFrame implements ActionListener {
    private int milanScore = 0;
    private int madridScore = 0;
    private JLabel scoreLabel;
    private JLabel lastScorerLabel;
    private JLabel leadingTeamLabel;

    public FootballMatch() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new BorderLayout());

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.LIGHT_GRAY);
        buttonPanel.setPreferredSize(new Dimension(400, 200));
        buttonPanel.setLayout(new GridLayout(1, 2));

        JButton milanButton = new JButton("AC Milan");
        milanButton.setForeground(Color.BLACK);
        milanButton.setBackground(Color.RED);
        milanButton.setPreferredSize(new Dimension(100, 100));
        milanButton.addActionListener(this);
        buttonPanel.add(milanButton);

        JButton madridButton = new JButton("Real Madrid");
        madridButton.setForeground(Color.WHITE);
        madridButton.setBackground(Color.BLUE);
        madridButton.setPreferredSize(new Dimension(100, 100));
        madridButton.addActionListener(this);
        buttonPanel.add(madridButton);

        add(buttonPanel, BorderLayout.NORTH);

        JPanel infoPanel = new JPanel();
        infoPanel.setLayout(new GridLayout(3, 1));

        scoreLabel = new JLabel("Score: " + milanScore + " X " + madridScore, JLabel.CENTER);
        infoPanel.add(scoreLabel);

        lastScorerLabel = new JLabel("Last Scored: None", JLabel.CENTER);
        infoPanel.add(lastScorerLabel);

        leadingTeamLabel = new JLabel("Leading: Tied", JLabel.CENTER);
        infoPanel.add(leadingTeamLabel);

        add(infoPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        String team = event.getActionCommand();

        if ("AC Milan".equals(team)) {
            milanScore++;
            lastScorerLabel.setText("Last Scored: AC Milan");
        } else if ("Real Madrid".equals(team)) {
            madridScore++;
            lastScorerLabel.setText("Last Scored: Real Madrid");
        }

        scoreLabel.setText("Score: " + milanScore + " X " + madridScore);

        if (milanScore > madridScore) {
            leadingTeamLabel.setText("Leading: AC Milan");
        } else if (milanScore < madridScore) {
            leadingTeamLabel.setText("Leading: Real Madrid");
        } else {
            leadingTeamLabel.setText("Leading: Tied");
        }
    }

    public static void main(String[] args) {
        new FootballMatch();
    }
}
