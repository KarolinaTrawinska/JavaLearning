package computer;

public interface Music {
    String NAME = "MUSIC";

    void playMusic();

    void pauseMusic();

    void stopMusic();

    default void sayHellofromMusic() {
        System.out.println("Hello from music");
    }
    default void sayHello() {
        System.out.println("Default hello from Music");

    }
    static String getName() {
        return NAME;
    }
    private static void privateMethod() {
        System.out.println("Hello from private method");
    }
}