public class Video extends MultimediaElement {
    private int duration;
    private int brightness;

    public Video(String name, int duration, int brightness) {
        super(name);
        this.duration = duration;
        this.brightness = brightness;

    }

    public void printVideo(int duration) {
        for (int i = 0; i < duration; i++) {
            System.out.print("!");
        }
    }

    public void printBrightness(int brightness) {
        String x = "*";
        for (int i = 0; i < brightness; i++) {

            System.out.print(x);
        }

    }

    @Override
    public void play() {
        System.out.print("Playing video " + getName() + " " + duration + " " + brightness + " ");
        printVideo(duration);
        printBrightness(brightness);
    }

}
