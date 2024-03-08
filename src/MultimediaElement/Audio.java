public class Audio extends MultimediaElement {
    private int duration;

    public Audio(String name, int duration) {
        super(name);
        this.duration = duration;
    }

    public void printAudio(int duration) {
        // String x = "!";
        for (int i = 0; i < duration; i++) {
            System.out.print("!");
        }
    }

    public void play() {
        System.out.print("Playing audio " + getName() + " " + duration);
        printAudio(duration);
    }

}
