import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Instantiate questions
//        MultipleChoiceQuestion customMCQuestion1 = new MultipleChoiceQuestion(
//                "Who is the singer of Metallica?",
//                "3", // Correct answer choice (e.g., "3" for James Hetfield)
//                List.of("Dave Mustaine", "Tom Araya", "James Hetfield", "Joey Belladonna")
//        );

        MultipleChoiceQuestion customMCQuestion2 = new MultipleChoiceQuestion(
                "What is the best selling album of all time?",
                "1", // Correct answer choice (e.g., "1" for Thriller – Michael Jackson)
                List.of("Thriller – Michael Jackson", "Back In Black – AC/DC", "The Bodyguard Soundtrack - Whitney Houston", "Their Greatest Hits – Eagles")
        );

        // Create a list of options for the checkbox question
        List<String> cbOptions = List.of("Java", "C++", "Python", "JavaScript");

        // Create a list of correct choices for the checkbox question
        List<String> cbCorrectChoices = List.of("Java", "JavaScript");

        CheckboxQuestion customCBQuestion = new CheckboxQuestion(
                "Select all the programming languages you know:",
                cbOptions, cbCorrectChoices
        );

        TrueFalseQuestion tfQuestion = new TrueFalseQuestion("The Earth is flat. (True/False)", false);

        // Create a quiz
        Quiz quiz = new Quiz();

        // Add questions to the quiz
//        quiz.addQuestion(customMCQuestion1);
        quiz.addQuestion(customMCQuestion2);
        quiz.addQuestion(customCBQuestion);
        quiz.addQuestion(tfQuestion);

        // Run the quiz
        quiz.runQuiz();
    }
}