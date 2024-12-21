abstract class Participant {

    protected String name;

    protected int maxRun;

    protected int maxJump;

    public Participant(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public void run(int distance) {
        if (distance <= maxRun) {
            System.out.println("Participant " + name + " ran " + distance + " maters.");
        } else {
            System.out.println("Participant " + name + " couldn`t run " + distance + " maters.");
        }
    }

    public void jump(int height) {
        if (height <= maxJump) {
            System.out.println("Participant " + name + " jumped " + height + " maters.");
        } else {
            System.out.println("Participant " + name + " couldn`t jump " + height + " maters.");
        }
    }
}
