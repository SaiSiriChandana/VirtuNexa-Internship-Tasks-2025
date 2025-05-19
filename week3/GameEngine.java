import java.util.Scanner;

public class GameEngine {
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        DatabaseManager.initializeDB();
        StoryNode start = StoryNode.loadStory();
        play(start);
    }

    private void play(StoryNode node) {
        while (node != null) {
            System.out.println("\n" + node.getText());

            if (node.isEnd()) {
                System.out.println("== The End ==");
                break;
            }

            System.out.println("1: " + node.getChoice1Text());
            System.out.println("2: " + node.getChoice2Text());
            int choice = Utils.getValidatedChoice(scanner);

            node = (choice == 1) ? node.getChoice1Node() : node.getChoice2Node();
        }
    }
}
