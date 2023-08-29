package computer;

public interface Video {
    void playVideo();
    void pauseVideo();
    void stopVideo();

    default void sayHellofromVideo() {
        System.out.println("Hello from video");
    }
}
