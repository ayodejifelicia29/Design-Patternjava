package adapter;

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("session24-05-2023.mp3", "mp3");
        audioPlayer.play("session24-05-2023.mp4", "mp4");
        audioPlayer.play("session24-05-2023.vlc", "vlc");
    }
}
