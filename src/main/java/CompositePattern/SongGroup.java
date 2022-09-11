package CompositePattern;

import java.util.ArrayList;
import java.util.Iterator;

public class SongGroup extends SongComponent {
    ArrayList songComponents = new ArrayList();

    String groupName;
    String groupDescription;

    public SongGroup(String newGroupName, String newGroupDescription) {
        groupName = newGroupName;
        groupDescription = newGroupDescription;

    }

    public String getGroupName() {
        return groupName;
    }

    public String getGroupDescription() {
        return groupDescription;
    }

    public void add(SongComponent newSongComp){
        songComponents.add(newSongComp);

    }
    public void remove(SongComponent newSongComp){
        songComponents.remove(newSongComp);

    }

    public SongComponent getComponent(int compIndex){
        return (SongComponent) songComponents.get(compIndex);

    }

    public void displaySongInfo(){
        System.out.println(getGroupName() + " " + groupDescription + " \n");
        Iterator songIterator = songComponents.iterator();
        while(songIterator.hasNext()){
            SongComponent songInfo = (SongComponent) songIterator.next();
            songInfo.displaySongInfo();
        }
    }





}
