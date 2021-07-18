public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    //creates equals method to compare two song objects
    public boolean equals(Object compared) {

        // if they match exactly then return true
        if (this == compared) {
            return true;
        }

        //if the object compared isn't a song then return false
        if (!(compared instanceof Song)) {
            return false;
        }

        //convert compared object into a song object
        Song comparedSong = (Song) compared;

        //check that everything matches and returns true
        if (this.artist.equals(comparedSong.artist)
                && this.name.equals(comparedSong.name)
                && this.durationInSeconds == comparedSong.durationInSeconds)
        return true;

        //otherwise return false
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

}