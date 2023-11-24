package base;

import javax.swing.*;
import java.awt.*;

public class PictureFrame {

    public int[] reroll = null;
    public Main master = null;

    public PictureFrame(Main sf) {
        master = sf;
        createFrame();
    }

    private void createFrame() {
        JFrame frame = new JFrame("Abominodo");
        DominoPanel dp = new DominoPanel();
        frame.setContentPane(dp);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    class DominoPanel extends JPanel {
        private static final long serialVersionUID = 4190229282411119364L;

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            drawGridLines(g);
            drawHeadings(g);
            drawGrid(g);
            if (master.mode == 1) {
                master.drawGuesses(g);
            } else if (master.mode == 0) {
                master.drawDominoes(g);
            }
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(202, 182);
        }

        private void drawGridLines(Graphics g) {
            g.setColor(Color.LIGHT_GRAY);
            for (int row = 0; row < 7; row++) {
                for (int col = 0; col < 8; col++) {
                    drawDigitGivenCentre(g, 30 + col * 20, 30 + row * 20, 20,
                            master.grid[row][col]);
                }
            }
        }

        private void drawHeadings(Graphics g) {
            g.setColor(Color.BLACK);
            for (int row = 0; row < 7; row++) {
                fillDigitGivenCentre(g, 10, 30 + row * 20, 20, row + 1);
            }
            for (int col = 0; col < 8; col++) {
                fillDigitGivenCentre(g, 30 + col * 20, 10, 20, col + 1);
            }
        }

        private void drawGrid(Graphics g) {
            // Your grid drawing logic here
        }

        private void drawDigitGivenCentre(Graphics g, int x, int y, int diameter, int n) {
            int radius = diameter / 2;
            g.setColor(Color.BLACK);
            FontMetrics fm = g.getFontMetrics();
            String txt = Integer.toString(n);
            g.drawString(txt, x - fm.stringWidth(txt) / 2, y + fm.getMaxAscent() / 2);
        }

        private void fillDigitGivenCentre(Graphics g, int x, int y, int diameter, int n) {
            int radius = diameter / 2;
            g.setColor(Color.GREEN);
            g.fillOval(x - radius, y - radius, diameter, diameter);
            g.setColor(Color.BLACK);
            g.drawOval(x - radius, y - radius, diameter, diameter);
            FontMetrics fm = g.getFontMetrics();
            String txt = Integer.toString(n);
            g.drawString(txt, x - fm.stringWidth(txt) / 2, y + fm.getMaxAscent() / 2);
        }
    }

    public void reset() {
        // Reset functionality to be implemented
    }
}
