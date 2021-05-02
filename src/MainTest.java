import com.java.java11.Main11;
import com.java.java8.Main8;

class MainTest {
    public static void main(String[] args) {
        System.out.println(" \n ***** Java 8 features start ****");
        Main8 main = new Main8();
        main.parseArr();
        System.out.println(" \n ***** Java 8 features end ****");

        System.out.println(" \n ***** Java 11 features start ****");
        Main11 main11 = new Main11();
        System.out.println(" \n ***** Java 11 features end ****");

    }
} 