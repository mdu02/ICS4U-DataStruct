/**
 * Visualizer for Hanoi Towers
 * @author Bryan Zhang
 * @version Nov 2019
 */
import javax.swing.*;
import java.awt.*;

public class Visualizer extends JFrame {
    Stack<Integer>[] stacks;
    MyPanel panel;
    final int MY_WIDTH = 800;
    final int MY_HEIGHT = 600;
    final int QUARTER = MY_WIDTH / 4;
    final int SIZE = MY_HEIGHT / 20;
    final int SPACING = SIZE / 4;
    int numDisks;
    Visualizer (Stack<Integer> source, Stack<Integer> temp, Stack<Integer> dest, int numDisks) {
        stacks = new Stack[]{source, temp, dest};
        this.numDisks = numDisks;
        panel = new MyPanel();
        this.getContentPane().add(BorderLayout.CENTER, panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(MY_WIDTH, MY_HEIGHT);
        this.setVisible(true);

    }
    private class MyPanel extends JPanel {
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < stacks[i].size(); j++) {
                    int height = SIZE;
                    int width = stacks[i].get(j) * ((QUARTER - SIZE) / numDisks);
                    int x = (i + 1) * QUARTER - width / 2;
                    int y = MY_HEIGHT - (j + 2) * (SIZE + SPACING);
                    g.setColor(new Color(128, stacks[i].get(j) * 15 % 255, 128));
                    g.fillRect(x, y, width, height);
                }
                g.setColor(Color.BLACK);
                g.drawLine((i + 1) * QUARTER, SIZE, (i + 1) * QUARTER , MY_HEIGHT - SIZE * 2);
            }
            this.repaint();
        }
    }
}
