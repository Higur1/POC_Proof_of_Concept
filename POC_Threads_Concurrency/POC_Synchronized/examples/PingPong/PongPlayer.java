package PingPong;

public class PongPlayer implements Runnable {
    private final PingPongGame game;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                game.playPong();
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public PongPlayer(PingPongGame game) {
        this.game = game;
    }
}
