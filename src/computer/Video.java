package computer;

public interface Video {
    void playVideo();
    void pauseVideo();
    void stopVideo();

    default void sayHello() {
        System.out.println("Default hello from Video");
    }

    default void sayHellofromVideo() {
        System.out.println("Hello from video");
    }
}
