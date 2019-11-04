package ec.edu.utpl.sic.arqapl.tests;

import ec.edu.utpl.sic.arqapl.TweetSimilarity;
import static org.junit.Assert.*;

import ec.edu.utpl.sic.arqapl.metrics.Cosine;
import org.junit.Test;

import java.util.Scanner;

public class TweetSimilarityTest {
    public TweetSimilarityTest() {
    }

    @Test
    public void similar() {
        Scanner entrada = new Scanner(System.in);
        var tweet1 = "Hola mundo";
        var tweet2 = "mundo";
        String metodo;

        TweetSimilarity ts = new TweetSimilarity();
            assertEquals(1.0,
                ts.similarity(tweet1, tweet2, "jarowinkler"), 0.1);

    }


}
