import java.util.ArrayList;

public class PlayList {
    private ArrayList<Track> trackList = new ArrayList<>();

    public void addTrack(Track track) {
        trackList.add(track);
    }

    public Track findTrack(String title) {
        for(Track track: trackList) {
            if(track.getTitle().toLowerCase().equals(title.toLowerCase())) {
               return track;
            }
        }
        return null;
    }

    public int getNumberOfTracks() {
        return trackList.size();
    }
}
