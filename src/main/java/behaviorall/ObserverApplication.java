package behaviorall;

public class ObserverApplication {
    public static void main(String[] args) {
        IronObjects ironBall = IronObjects.builder()
                .name("ball")
                .radius(20)
                .build();

        IronObjects ironRing = IronObjects.builder()
                .name("ring")
                .radius(50)
                .build();

        IronObjects ironPipe = IronObjects.builder()
                .name("pipe")
                .radius(15)
                .build();

        Magnet magnet = new Magnet(30);
        magnet.subscribe(ironBall);
        magnet.subscribe(ironRing);
        magnet.subscribe(ironPipe);
        magnet.notifyMagnet();
    }
}
