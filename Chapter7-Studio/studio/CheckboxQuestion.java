import java.util.List;

// Subclass for checkbox questions
class CheckboxQuestion extends Question {
    private List<String> options;
    private List<String> correctChoices;

    public CheckboxQuestion(String text, List<String> options, List<String> correctChoices) {
        super(text, "");
        this.correctChoices = correctChoices;
        this.options = options;
    }

    public boolean isCorrect(List<String> selectedIndices) {
        if (selectedIndices.size() != correctChoices.size()) {
            return false;
        }

        for (String index : selectedIndices) {
            int selectedIndex = Integer.parseInt(index) - 1; // Convert index to zero-based
            if (!correctChoices.contains(options.get(selectedIndex))) {
                return false;
            }
        }

        return true;
    }

    public void displayOptions() {
        System.out.println("Available options:");
        for (int i = 0; i < options.size(); i++) {
            System.out.println(i + 1 + ". " + options.get(i));
        }
    }
}
