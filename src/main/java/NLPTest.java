import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.Properties;

public class NLPTest {

    public static String text = "father can start smart car always.";

    public static void main(String[] args) {
        Properties props = new Properties();

        props.setProperty("annotators", "tokenize, ssplit, pos, lemma, ner, parse, depparse, coref, kbp, quote");

        props.setProperty("coref.algorithm", "neural");

        StanfordCoreNLP pipeline = new StanfordCoreNLP(props);

        CoreDocument document = new CoreDocument(text);

        pipeline.annotate(document);

        CoreLabel token = document.tokens().get(0);
        System.out.println("Example : token");
        System.out.println(token);
        System.out.println();
    }
}
