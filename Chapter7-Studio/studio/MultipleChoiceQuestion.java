import java.util.List;

// Subclass for multiple-choice questions
class MultipleChoiceQuestion extends Question {
    private List<String> choices;

    public MultipleChoiceQuestion(String text, String answer, List<String> choices) {
        super(text, answer);
        this.choices = choices;
    }

    public void displayChoices() {
        for (int i = 0; i < choices.size(); i++) {
            System.out.println(i + 1 + ". " + choices.get(i));
        }
    }
}
