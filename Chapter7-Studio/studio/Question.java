import java.util.List;

// Base class for all types of questions
class Question {
    private String text;
    private String answer;

    public Question(String text, String answer) {
        this.text = text;
        this.answer = answer;
    }

    public String getText() {
        return text;
    }

    public boolean isCorrect(String userAnswer) {
        return answer.equalsIgnoreCase(userAnswer);
    }

    public void displayQuestion() {
        System.out.println(text);
    }
}