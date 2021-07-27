public class Bird {
    private String birdName;
    private String latinBirdName;
    private int birdObservation;

    public Bird(String birdName, String latinBirdName) {
        this.birdName = birdName;
        this.latinBirdName = latinBirdName;
        this.birdObservation = 0;
    }

    public String getBirdName() {
        return birdName;
    }

    public int getBirdObservation() {
        return birdObservation;
    }

    public void addObservation() {
        birdObservation++;
    }

    @Override
    public String toString() {
        return this.birdName + " (" + this.latinBirdName + "): " + this.birdObservation + " observations";
    }
}
