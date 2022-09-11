package CompositePattern;

public class Song extends SongComponent {

    String songName;
    String bandName;
    int releaseYear;

    public Song(String newSong,String newBand, int newRelYear){
        songName = newSong;
        bandName = newBand;
        releaseYear = newRelYear;

    }

    public String getSongName(){
        return songName;
    }

    public String getBandName(){
        return bandName;
    }
    public int getReleaseYear(){
        return releaseYear;
    }

    public void displaySongInfo(){
        System.out.println(getSongName() + " was recorded by " + getBandName() + " in " + getReleaseYear());
    }
}
