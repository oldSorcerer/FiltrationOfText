public class NegativeTextAnalyzer extends KeywordAnalyzer {

    private final String[] keywords = {":(", ":|", "=("};

    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }

}