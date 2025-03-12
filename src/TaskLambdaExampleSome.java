public class TaskLambdaExampleSome {
    public static void main(String[] args) {
     Thread thread = new Thread(
             () -> System.out.println("Hello Petrovich")
     );
     thread.start();
    }
}
