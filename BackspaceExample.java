public class BackspaceExample {
    public static void main(String[] args) {
        System.out.print("Hello,");
        System.out.print("\b\b\b"); // move cursor 3 positions back
        System.out.print("World!"); // overwrite the last 3 characters
        System.out.print("Hello, World!\f"); // clear the screen or move to top of page
        System.out.print("New line!"); // print on a new line
        System.out.print("Hello, World!\r"); // move cursor to beginning of line
        System.out.print("New beginning!"); // overwrite the lineFu
    }
}