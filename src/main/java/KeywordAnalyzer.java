abstract public class KeywordAnalyzer implements TextAnalyzer {

    public Label processText(String text) {
        for (String keyword : getKeywords()) {
            if (text.contains(keyword)) {
                return getLabel();
            }
        }
        return Label.OK;
    }

    abstract protected String[] getKeywords();

    abstract protected Label getLabel();

}