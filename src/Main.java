import java.util.Scanner;
//il codice funziona tutto l'unica cosa non riesco a capire perchè quando entra nel ciclo che crea gli elementi mi salva un elemeno si e uno no saltando direttamente all'elemento successivo se possibile quando viene corretto capire dove sto sbagliando grazie mille.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ElementCreator creator = new ElementCreator(sc);
        MultimediaElement[] elements = creator.createElements();
        int choice = -1;
        while (choice != 0) {
            System.out.println();
            System.out.println("scegli un opzione valida");
            System.out.println("1. play film");
            System.out.println("2. play audio");
            System.out.println("3. show image");
            System.out.println("0. exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Film disponibili:");
                    for (MultimediaElement m : elements) {
                        if (m instanceof Video) {
                            System.out.println();
                            m.play();
                        }
                    }
                    break;
                case 2:
                    System.out.println("Audio disponibili:");

                    for (MultimediaElement m : elements) {
                        if (m instanceof Audio) {
                            System.out.println();
                            m.play();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Image disponibili:");
                    for (MultimediaElement m : elements) {
                        if (m instanceof Image) {
                            System.out.println();
                            m.show();
                        }
                    }
                    break;
                case 0:
                    System.out.println("bye");
                    break;
                default:
                    System.out.println("opzione non valida");
                    break;
            }
        }
        sc.close();

    }
}