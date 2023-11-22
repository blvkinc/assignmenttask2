package base;

import java.awt.Color;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Location extends SpacePlace {
    public int column;
    public int row;
    public DIRECTION direction;
    public enum DIRECTION {VERTICAL, HORIZONTAL};

    public Location(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public Location(int row, int column, DIRECTION direction) {
        this(row, column);
        this.direction = direction;
    }

    @Override
    public String toString() {
        if (direction == null) {
            return "(" + (column + 1) + "," + (row + 1) + ")";
        } else {
            return "(" + (column + 1) + "," + (row + 1) + "," + direction + ")";
        }
    }

    public void drawGridLines(Graphics g) {
        g.setColor(Color.LIGHT_GRAY);
        for (int tmp = 0; tmp <= 7; tmp++) {
            g.drawLine(20, 20 + tmp * 20, 180, 20 + tmp * 20);
        }
        for (int see = 0; see <= 8; see++) {
            g.drawLine(20 + see * 20, 20, 20 + see * 20, 160);
        }
    }

    public static int getInt() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        do {
            try {
                return Integer.parseInt(reader.readLine());
            } catch (IOException | NumberFormatException ignored) {
            }
        } while (true);
    }
}
