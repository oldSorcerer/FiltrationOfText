public class Main {

    public static void main(String[] args) {
        String[] spam = {"shit", "ass", "fuck"};
        int maxLength = 200;

        String text = "woxmqomxfukuck:(";

        TextAnalyzer[] textAnalyzers = {
                new SpamAnalyzer(spam),
                new NegativeTextAnalyzer(),
                new TooLongTextAnalyzer(maxLength),
        };
        System.out.println(CheckLabels.checkLabels(textAnalyzers,text));
    }
}
