public class GraduatedStudent extends Student {
    private boolean hasGraduated; // New variable to store graduation status

    public GraduatedStudent(int id, String name, int age) {
        super(id, name, age);
        this.hasGraduated = false; // Default to not graduated
    }

    public boolean isGraduated() {
        return hasGraduated;
    }

    public void graduate() {
        this.hasGraduated = true; // Turns student to graduated status
    }

    @Override
    public String toString() {
        return super.toString() + ", Graduated: " + hasGraduated;
    }
}
