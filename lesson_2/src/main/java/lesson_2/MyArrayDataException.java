package lesson_2;

public class MyArrayDataException extends Exception {
    private int x;
    private int j;

    private String text;
    public MyArrayDataException() {
    }

    public MyArrayDataException(String s) {
        this.text = s;
    }

    public MyArrayDataException(int i, int j) {
        this.x = i;
        this.j = j;
    }
    public String getText() {
        return text;
    }
    public int getX() {
        return x;
    }

    public int getJ() {
        return j;
    }
}
