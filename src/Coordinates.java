public class Coordinates {
    private final int x;
    private final int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Coordinates coordinates = (Coordinates) obj;
        return x == coordinates.x && y == coordinates.y;
    }

    @Override
    public String toString() {
        return "X=" + x + " " + "Y=" + y;
    }
}
