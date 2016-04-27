
public class TheMain {

    public static void main(String [] args) {
        int a = 5;
        int b = 8;

        if (a==b) {
            System.out.println("It's not possible");
            break;
        } else if (a!=b) {
            System.out.println("Yes");
            break;
        } else if (a==b || a!=b) {
            System.out.println("Yes it is");
            break;
        }else if (a!=b && b!=a) {
            System.out.println("it's true!");
        }
    }
}
