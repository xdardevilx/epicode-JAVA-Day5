public class Image extends MultimediaElement {
    private int brightness;

    public Image(String name, int brightness) {
        super(name);
        this.brightness = brightness;
    }

    public void increaseBrightness(int currentBrightness) {
        System.out.print("aumento la luminosità di: " + currentBrightness + " ");
        printBrightness(currentBrightness);
        System.out.println();
    }

    public void decreaseBrightness(int currentBrightness) {
        System.out.print("aumento la luminosità di: " + currentBrightness + " ");
        printBrightness(currentBrightness);
        System.out.println();
    }

    public void printBrightness(int brightness) {
        String x = "*";
        for (int i = 0; i < brightness; i++) {

            System.out.print(x);
        }

    }

    @Override
    public void show() {

        System.out.print("Showing image " + getName() + " with brightness " + brightness + " ");
        printBrightness(brightness);
    }
}
