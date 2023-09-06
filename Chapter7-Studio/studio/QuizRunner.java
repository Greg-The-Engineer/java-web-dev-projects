import java.util.List;

public class QuizRunner {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        // Add questions to the quiz
        quiz.addQuestion(new MultipleChoiceQuestion("What is the capital of France?", "2",
                List.of("1. London", "2. Paris", "3. Berlin")));

        // Create a list of options for the checkbox question
        List<String> cbOptions = List.of("Java", "C++", "Python", "JavaScript");

        // Create a list of correct choices for the checkbox question
        List<String> cbCorrectChoices = List.of("Java", "Python");

        // Create the CheckboxQuestion
        CheckboxQuestion cbQuestion = new CheckboxQuestion("Select all the programming languages you know:",
                cbOptions, cbCorrectChoices);

        // Add the checkbox question to the quiz
        quiz.addQuestion(cbQuestion);

        // Add the true/false question
        quiz.addQuestion(new TrueFalseQuestion("The Earth is flat. (True/False)", false));

        // Run the quiz
        quiz.runQuiz();
    }
}