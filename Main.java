public class Main extends Thread{
    public static void main(String[] args) {
        Main thread = new Main();
        thread.start();
        System.out.println("Code is outside of the thread");
    }
    public void run() {
        System.out.println("Code is running in a thread");
    }
}
