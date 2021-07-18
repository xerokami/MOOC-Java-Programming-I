public class HealthStation {
    private int weighingCount = 0;

    public int weigh(Person person) {
        this.weighingCount++;
        return person.getWeight();
    }

    public void feed(Person person) {
        person.setWeight(weigh(person) + 1);
    }

    public int weighings() {
        return this.weighingCount;
    }

}
