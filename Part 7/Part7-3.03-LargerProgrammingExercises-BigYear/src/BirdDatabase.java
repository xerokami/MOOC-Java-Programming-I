import java.util.ArrayList;

public class BirdDatabase {
    private ArrayList<Bird> birdList;

    public BirdDatabase() {
        this.birdList = new ArrayList<>();
    }

    public void addBirdToDatabase(Bird bird) {
        birdList.add(bird);
    }

    public void birdObserved(String birdName) {
        for (Bird bird: birdList) {
            if (bird.getBirdName().equals(birdName)) {
                bird.addObservation();
            }
        }
    }

    public void printOneBird(String birdToFind) {
        for (Bird bird: birdList) {
            if (bird.getBirdName().equals(birdToFind)) {
                System.out.println(bird);
            }
        }
    }

    public void printAllBirds() {
        for (Bird bird: birdList) {
            System.out.println(bird);
        }
    }
}
