package CompositePattern;

public abstract  class SongComponent {

    public void add(SongComponent newSong) {

        throw new UnsupportedOperationException();
    }

    public void remove(SongComponent newSong) {

        throw new UnsupportedOperationException();
    }
    public SongComponent getSongComponent(int componentIndex){

        throw new UnsupportedOperationException();
    }
    public String getSongComponent(){

        throw new UnsupportedOperationException();
    }

    public String getBandName(){

        throw new UnsupportedOperationException();
    }

    public String getSongName(){

        throw new UnsupportedOperationException();
    }
    public int releaseYear(){

        throw new UnsupportedOperationException();
    }

    public void displaySongInfo(){
        throw new UnsupportedOperationException();
    }
}
