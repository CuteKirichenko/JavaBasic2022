package homeworks.polymorphism;

public class PolyMain {

    public static void main(String[] args) {
        MusicStyle popMusic = new PopMusic();
        MusicStyle rockMusic = new RockMusic();
        MusicStyle classicMusic = new ClassicMusic();

        MusicStyle[] player = {popMusic, rockMusic, classicMusic};
        for (MusicStyle style : player) {
            style.playMusic();
        }
    }
}
