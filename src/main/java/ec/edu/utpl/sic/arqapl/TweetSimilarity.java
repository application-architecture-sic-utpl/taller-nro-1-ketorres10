package ec.edu.utpl.sic.arqapl;

import ec.edu.utpl.sic.arqapl.metrics.Cosine;
import ec.edu.utpl.sic.arqapl.metrics.Jaccard;
import ec.edu.utpl.sic.arqapl.metrics.JaroWinkler;
import ec.edu.utpl.sic.arqapl.metrics.Similaritable;

public class TweetSimilarity {
    private Similaritable algorithm;

    public TweetSimilarity() {
    }

    public TweetSimilarity(Similaritable algorithm) {

        this.algorithm = algorithm;
    }

    public double similarity(String tweet1, String tweet2, String metodo) {

        if (metodo.equals("cosine")){
            algorithm =new Cosine();
        }else if (metodo.equals("jaccard")){
            algorithm =new Jaccard();
        }else if (metodo.equals("jarowinkler")){
            algorithm =new JaroWinkler();
        }
        return algorithm.similarity(tweet1, tweet2);

    }

}
