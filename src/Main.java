import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;

        MultimediaElement[] multimedia = { new Video("the matrix", 3, 7), new Audio("mille giorni di te e di me", 3),
                new Image("beach", 7), new Video("harry potter", 5, 10), new Audio("la canzone del drago", 4) };

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
                    for (MultimediaElement m : multimedia) {
                        if (m instanceof Video) {
                            m.play();
                        }
                    }
                    break;
                case 2:
                    for (MultimediaElement m : multimedia) {
                        if (m instanceof Audio) {
                            m.play();
                        }
                    }
                    break;
                case 3:
                    for (MultimediaElement m : multimedia) {
                        if (m instanceof Image) {
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