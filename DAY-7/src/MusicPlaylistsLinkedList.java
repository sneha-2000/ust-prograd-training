import java.util.LinkedList;

public class MusicPlaylistsLinkedList {
    public static void main(String[] args) {
        LinkedList<String> MusicPlaylist= new LinkedList<String>();
        MusicPlaylist.add("Vande Matram");
        MusicPlaylist.add(1,"Bahara");
        MusicPlaylist.addFirst("Good 4 You");
        MusicPlaylist.addLast("Gone");
        System.out.println(MusicPlaylist);
        MusicPlaylist.forEach(musicplaylist ->System.out.println(musicplaylist));
    }
}
