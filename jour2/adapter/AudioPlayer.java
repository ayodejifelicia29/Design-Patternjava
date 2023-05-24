package adapter;

public class AudioPlayer implements MediaPlayer {

    private MediaAdapter mediaAdapter;

    @Override
    public void play(String file, String type) {
        if (type.compareTo("vlc") == 0 || type.compareTo("mp4") == 0) {
            mediaAdapter = new MediaAdapter(type);
            mediaAdapter.play(file, type);
        } else
            System.out.println("Je joue un audio et je joue ceci " + file);
    }
}
