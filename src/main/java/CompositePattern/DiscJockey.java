package CompositePattern;

public class DiscJockey {
    SongComponent songlist;

    public DiscJockey(SongComponent newSongList){
        songlist = newSongList;

    }

    public void getSonglist(){
        songlist.displaySongInfo();
    }
}
