package adapter;

public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playvlc(String file) {
        System.out.println("Je sais lire des vlc, en voila la preuve " + file);
    }

    @Override
    public void playMp4(String file) {
        throw new UnsupportedOperationException("Unimplemented method 'playMp4'");
    }
}
