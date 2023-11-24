package base;

public class Domino implements Comparable<Domino> {
    private int high;
    private int low;
    private int hx;
    private int hy;
    private int lx;
    private int ly;
    private boolean placed = false;

    public Domino(int high, int low) {
        this.high = high;
        this.low = low;
    }

    public void place(int hx, int hy, int lx, int ly) {
        this.hx = hx;
        this.hy = hy;
        this.lx = lx;
        this.ly = ly;
        placed = true;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("[");
        result.append(high);
        result.append(low);
        result.append("]");
        if (!placed) {
            result.append("unplaced");
        } else {
            result.append("(");
            result.append(hx + 1);
            result.append(",");
            result.append(hy + 1);
            result.append(")");
            result.append("(");
            result.append(lx + 1);
            result.append(",");
            result.append(ly + 1);
            result.append(")");
        }
        return result.toString();
    }

    public void invert() {
        int tempX = hx;
        hx = lx;
        lx = tempX;

        int tempY = hy;
        hy = ly;
        ly = tempY;
    }

    public boolean isHorizontal() {
        return hy == ly;
    }

    @Override
    public int compareTo(Domino otherDomino) {
        if (this.high != otherDomino.high) {
            return Integer.compare(otherDomino.high, this.high);
        }
        return Integer.compare(this.low, otherDomino.low);
    }
    
    // Getters and setters if needed
}
