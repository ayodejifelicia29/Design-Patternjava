package adapter;

public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playvlc(String file) {
        throw new UnsupportedOperationException("Unimplemented method 'playvlc'");
    }

    @Override
    public void playMp4(String file) {
        System.out.println("Je sais lire des mp4, en voila la preuve " + file);
    }
}
