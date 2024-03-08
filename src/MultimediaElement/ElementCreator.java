import java.util.Scanner;

public class ElementCreator {

    private Scanner scanner;

    public ElementCreator(Scanner scanner) {
        this.scanner = scanner;
    }

    public MultimediaElement[] createElements() {
        System.out.println("Quanti elementi vuoi creare?");
        int numElements = scanner.nextInt();
        scanner.nextLine();

        MultimediaElement[] elements = new MultimediaElement[numElements];

       for(int i = 0; i < numElements; i++) {
        System.out.println("Elemento " + (i + 1) + ":");
        System.out.println("scegli che elemento creare Image, Video o Audio");
        String elementType = scanner.nextLine();
        System.out.println("Inserisci il nome dell'elemento");
        String name = scanner.nextLine();

        if(elementType.equalsIgnoreCase("image")){
            System.out.println("Inserisci la luminosità dell'immagine");
            int brightness = scanner.nextInt();
            scanner.nextLine();
            elements[i] = new Image(name, brightness);
        }else if(elementType.equalsIgnoreCase("video")){
            System.out.println("inserisci la durata");
            int duration = scanner.nextInt();
            System.out.println("inserisci la luminosità del video");
            int brightness = scanner.nextInt();
            elements[i] = new Video (name, duration, brightness);
        }else if(elementType.equalsIgnoreCase("audio")){
            System.out.println("inserisci la durata");
            int duration = scanner.nextInt();
            elements[i] = new Audio (name, duration);
        }else{
            System.out.println("tipo di elemento non valido");
        }
       }

        return elements;
    }
}
