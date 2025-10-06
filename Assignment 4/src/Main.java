// Assignment4.java (driver)
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Media> allMedia = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("[Media Manager]");
            System.out.println("1- Add Image");
            System.out.println("2- Add Music");
            System.out.println("3- Add Video");
            System.out.println("4- Show images");
            System.out.println("5- Show music");
            System.out.println("6- Show videos");
            System.out.println("7- Show images and videos");
            System.out.println("8- Show music and videos");
            System.out.println("9- Exit");
            System.out.print("Enter option: ");
            int option = -1;
            try {
                option = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                // invalid input, will fall through
            }

            switch (option) {
                case 1:
                    System.out.print("Enter file name: ");
                    String iname = scanner.nextLine();
                    System.out.print("Enter image codec: ");
                    String icodec = scanner.nextLine();
                    allMedia.add(new Image(iname, icodec));
                    break;
                case 2:
                    System.out.print("Enter file name: ");
                    String mname = scanner.nextLine();
                    System.out.print("Enter audio codec: ");
                    String acodec = scanner.nextLine();
                    allMedia.add(new Music(mname, acodec));
                    break;
                case 3:
                    System.out.print("Enter file name: ");
                    String vname = scanner.nextLine();
                    System.out.print("Enter image codec: ");
                    String vic = scanner.nextLine();
                    System.out.print("Enter audio codec: ");
                    String vac = scanner.nextLine();
                    allMedia.add(new Video(vname, vic, vac));
                    break;
                case 4:
                    for (Media m : allMedia) {
                        if (m instanceof Image) {
                            System.out.println(((Image) m).getMediaInfo());
                        }
                    }
                    break;
                case 5:
                    for (Media m : allMedia) {
                        if (m instanceof Music) {
                            System.out.println(((Music) m).getMediaInfo());
                        }
                    }
                    break;
                case 6:
                    for (Media m : allMedia) {
                        if (m instanceof Video) {
                            System.out.println(((Video) m).getMediaInfo());
                        }
                    }
                    break;
                case 7:
                    for (Media m : allMedia) {
                        if (m instanceof IImageStandard) {
                            System.out.println(((IMediaStandard) m).getMediaInfo());
                        }
                    }
                    break;
                case 8:
                    for (Media m : allMedia) {
                        if (m instanceof IAudioStandard) {
                            System.out.println(((IMediaStandard) m).getMediaInfo());
                        }
                    }
                    break;
                case 9:
                    System.out.println("Shutting down...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }

            System.out.println();  // blank line
        }

        scanner.close();
    }
}