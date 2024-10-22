public class TShirt {
    private int size;
    private String color;

    /* (a) Finish writing the constructor for TShirt:
     * the size of the shirt should be n if n is a positive integer; otherwise, the size should be 0.
     */
    public TShirt(String s, String n) {
        color = s;
        /* your implementation here */
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    /* (c) Write the method shrinkShirt:
     * this method should reduce the size of the shirt by 1 if the size is greater than 0 (positive integer);
     * otherwise (if the size is 0), the method should do nothing (no change to the size).
     */
    public void shrinkShirt() {
        /* your implementation here */
    }
}

