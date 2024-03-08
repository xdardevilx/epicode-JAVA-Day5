public class Main {
    public static void main(String[] args) {
        Image image = new Image("Beach", 5);
        image.show();
        System.out.println();
        Audio audio = new Audio("mille giorni di te e di me", 4);
        audio.play();
        System.out.println();
        Video video = new Video("The Matrix", 10, 5);
        video.play();
    }
}