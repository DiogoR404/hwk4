public class Song implements Playable {
    public String name;
    public String artist;

    public Song(String name, String artist) {
        this.name = name;
        this.artist = artist;
    }

    public void play() {
        System.out.println("Escuchando..." + name + " BY " + artist);
    }
}