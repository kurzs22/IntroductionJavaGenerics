/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package IntroductionJavaGenerics;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        MyList<Integer> list = new MyList<>();
        for (int i=0; i<111; i++) list.add(i);

        System.out.println(list.toString());
    }
}