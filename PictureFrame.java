package base;

import javax.swing.*;
import java.awt.*;

public class PictureFrame {

    private Main master;
    private DominoPanel dp;

    public PictureFrame(Main sf) {
        master = sf;
        createAndShowGUI();
    }

    private void createAndShowGUI() {
        JFrame frame = new JFrame("Abominodo");
        dp = new DominoPanel();
        frame.setContentPane(dp);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private class DominoPanel extends JPanel {
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
            // Drawing grid lines
            // ... implementation ...
        }

        private void drawHeadings(Graphics g) {
            // Drawing headings
            // ... implementation ...
        }

        private void drawGrid(Graphics g) {
            // Drawing grid
            // ... implementation ...
        }
    }

    public void reset() {
        // TODO: Implementation for reset method
    }
}
