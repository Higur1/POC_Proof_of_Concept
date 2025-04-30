package PingPong;

public class PingPongGame {

    private boolean isPingTurn = true;

    public synchronized void playPing() throws InterruptedException {
        while (!isPingTurn){
            wait(); //block thread
        }
        System.out.println("Ping!");
        isPingTurn = false;
        notify(); //wakeup another thread
    }
    public synchronized void playPong() throws InterruptedException {
        while (isPingTurn){
            wait(); //block thread
        }
        isPingTurn = true;
        System.out.println("Pong!");
        notify(); //wakeup another thread
    }

    public static void main(String[] args) throws InterruptedException {
        PingPongGame game = new PingPongGame();

        Thread pingPlayer = new Thread(new PingPlayer(game));
        Thread pongPlayer = new Thread(new PongPlayer(game));

        pingPlayer.start();
        pongPlayer.start();

        pingPlayer.join();
        pongPlayer.join();
    }
}
