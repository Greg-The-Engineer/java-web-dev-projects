import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Quiz {
    private List<Question> questions = new ArrayList<>();

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void runQuiz() {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (Question question : questions) {
            question.displayQuestion();

            if (question instanceof MultipleChoiceQuestion) {
                ((MultipleChoiceQuestion) question).displayChoices();
            } else if (question instanceof CheckboxQuestion) {
                ((CheckboxQuestion) question).displayOptions();
            }

            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (question instanceof CheckboxQuestion) {
                List<String> selectedIndices = List.of(userAnswer.split(",")); // Split the input into a list
                if (((CheckboxQuestion) question).isCorrect(selectedIndices)) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Incorrect.");
                }
            } else {
                if (question.isCorrect(userAnswer)) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Incorrect.");
                }
            }
        }

        System.out.println("Your score: " + score + "/" + questions.size());
    }
}