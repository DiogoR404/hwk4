import java.util.ArrayList;

public class PlayList implements Playable {
    public String name;
    private ArrayList<Playable> songs = new ArrayList<Playable>();

    public PlayList(String name) {
        this.name = name;
    }

    public void add(Playable s){
        songs.add(s);
    }
    
    public void remove(Playable s){
        songs.remove(s);
    }

    public ArrayList<Playable> getSongs(){
        return songs;
    }

    public void play(){
        this.getSongs().forEach((n) -> {{
            System.out.println("-----" + name + "-----");
            n.play();
        }});
    }
}