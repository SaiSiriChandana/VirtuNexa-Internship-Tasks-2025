public class StoryNode {
    private String text;
    private StoryNode choice1;
    private StoryNode choice2;
    private String choice1Text;
    private String choice2Text;

    public StoryNode(String text) {
        this.text = text;
    }

    public static StoryNode loadStory() {
        StoryNode end1 = new StoryNode("You found treasure!");
        StoryNode end2 = new StoryNode("You fell into a trap!");

        StoryNode node2 = new StoryNode("You enter a cave. Left or Right?");
        node2.setChoices("Left", end1, "Right", end2);

        StoryNode start = new StoryNode("You're at the forest entrance. Go forward or back?");
        start.setChoices("Forward", node2, "Back", end2);

        return start;
    }

    public void setChoices(String c1Text, StoryNode c1, String c2Text, StoryNode c2) {
        this.choice1Text = c1Text;
        this.choice1 = c1;
        this.choice2Text = c2Text;
        this.choice2 = c2;
    }

    public boolean isEnd() {
        return choice1 == null && choice2 == null;
    }

    public String getText() {
        return text;
    }

    public StoryNode getChoice1Node() {
        return choice1;
    }

    public StoryNode getChoice2Node() {
        return choice2;
    }

    public String getChoice1Text() {
        return choice1Text;
    }

    public String getChoice2Text() {
        return choice2Text;
    }
}
