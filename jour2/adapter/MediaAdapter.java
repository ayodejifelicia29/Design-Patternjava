package adapter;

public class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String type) {
        if (type.compareTo("vlc") == 0) {
            advancedMediaPlayer = new VlcPlayer();
        } else
            advancedMediaPlayer = new Mp4Player();
    }

    @Override
    public void play(String file, String type) {
        if (type.compareTo("vlc") == 0)
            advancedMediaPlayer.playvlc(file);
        else
            advancedMediaPlayer.playMp4(file);
    }
}
