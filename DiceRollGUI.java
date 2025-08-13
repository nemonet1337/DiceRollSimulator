import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class DiceRollGUI extends JFrame {
    private final JTextField sidesField;
    private final JButton rollButton;
    private final JLabel resultLabel;
    private final Random random;

    public DiceRollGUI() {
        super("サイコロ ロール");
        this.random = new Random();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(360, 220);
        setLocationRelativeTo(null);

        // Top panel: instruction
        JLabel instruction = new JLabel("ダイスの面数を入力して『振る』を押してください");

        // Middle panel: input and quick buttons
        JPanel inputPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        inputPanel.add(new JLabel("面数:"));
        sidesField = new JTextField(8);
        sidesField.setText("6");
        inputPanel.add(sidesField);

        JPanel quickPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 6, 0));
        String[] presets = {"4", "6", "8", "10", "12", "20"};
        for (String p : presets) {
            JButton b = new JButton(p + "面");
            b.addActionListener(e -> sidesField.setText(p));
            quickPanel.add(b);
        }

        // Bottom panel: actions and result
        JPanel actionPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        rollButton = new JButton("振る");
        resultLabel = new JLabel("結果: -");
        resultLabel.setFont(resultLabel.getFont().deriveFont(Font.BOLD, 18f));
        actionPanel.add(rollButton);
        actionPanel.add(resultLabel);

        // Layout
        JPanel container = new JPanel();
        container.setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
        container.add(instruction);
        container.add(Box.createVerticalStrut(8));
        container.add(inputPanel);
        container.add(quickPanel);
        container.add(Box.createVerticalStrut(8));
        container.add(actionPanel);

        setContentPane(container);

        // Events
        rollButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rollDice();
            }
        });
        sidesField.addActionListener(e -> rollDice());
    }

    private void rollDice() {
        String text = sidesField.getText().trim();
        int sides;
        try {
            sides = Integer.parseInt(text);
            if (sides <= 0) throw new NumberFormatException();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(
                    this,
                    "正の整数を入力してください",
                    "入力エラー",
                    JOptionPane.ERROR_MESSAGE
            );
            return;
        }
        int value = random.nextInt(sides) + 1;
        resultLabel.setText("結果: " + value);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DiceRollGUI().setVisible(true));
    }
}
