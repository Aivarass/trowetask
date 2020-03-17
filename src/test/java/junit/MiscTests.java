package junit;

import handler.WordHandler;
import handler.WordHandlerImp;
import model.WordObject;
import org.junit.Assert;
import org.junit.Test;

public class MiscTests {

    @Test
    public void testOneWord(){
        WordHandler wordHandler = new WordHandlerImp();
        Assert.assertEquals(wordHandler.findLongestWord("word"), new WordObject("word", 4));
        Assert.assertEquals(wordHandler.findShortestWord("word"), new WordObject("word", 4));
    }

    @Test
    public void testWordSameLength(){
        WordHandler wordHandler = new WordHandlerImp();
        Assert.assertEquals(wordHandler.findLongestWord("word word word word word"), new WordObject("word", 4));
        Assert.assertEquals(wordHandler.findShortestWord("word word word word word"), new WordObject("word", 4));
    }

    @Test
    public void testAllWordsSameLength(){
        WordHandler wordHandler = new WordHandlerImp();
        Assert.assertEquals(5,wordHandler.findAllLongestWord("word word word word word").size());
        Assert.assertEquals(5,wordHandler.findAllShortestWord("word word word word word").size());
    }

    @Test
    public void testAllWordsSameLengthContent(){
        WordHandler wordHandler = new WordHandlerImp();
        wordHandler.findAllLongestWord("word word word word word").forEach(s -> Assert.assertEquals(s,new WordObject("word",4)));
        wordHandler.findAllShortestWord("word word word word word").forEach(s -> Assert.assertEquals(s,new WordObject("word",4)));
    }

    @Test
    public void testSmallToLarge(){
        WordHandler wordHandler = new WordHandlerImp();
        Assert.assertEquals(new WordObject("looking",7),wordHandler.findLongestWord("a ah two three words looking"));
        Assert.assertEquals(new WordObject("a",1),wordHandler.findShortestWord("a ah two three words looking"));
    }

    @Test
    public void testLargeToSmall(){
        WordHandler wordHandler = new WordHandlerImp();
        Assert.assertEquals(new WordObject("looking",7),wordHandler.findLongestWord("looking words three two ah a"));
        Assert.assertEquals(new WordObject("a",1),wordHandler.findShortestWord("looking words three two ah a"));
    }

    @Test
    public void testVeryLongSentence(){
        WordHandler wordHandler = new WordHandlerImp();
        Assert.assertEquals(new WordObject("involuntarily",13),wordHandler.findLongestWord("As he crossed toward the pharmacy at the corner he involuntarily turned his head because of a burst of light that had ricocheted from his temple, and saw, with that quick smile with which we greet a rainbow or a rose, a blindingly white parallelogram of sky being unloaded from the van—a dresser with mirrors across which, as across a cinema screen, passed a flawlessly clear reflection of boughs sliding and swaying not arboreally, but with a human vacillation, produced by the nature of those who were carrying this sky, these boughs, this gliding façade."));
        Assert.assertEquals(new WordObject("a",1),wordHandler.findShortestWord("As he crossed toward the pharmacy at the corner he involuntarily turned his head because of a burst of light that had ricocheted from his temple, and saw, with that quick smile with which we greet a rainbow or a rose, a blindingly white parallelogram of sky being unloaded from the van—a dresser with mirrors across which, as across a cinema screen, passed a flawlessly clear reflection of boughs sliding and swaying not arboreally, but with a human vacillation, produced by the nature of those who were carrying this sky, these boughs, this gliding façade."));
    }

    @Test
    public void testVeryLongSentenceForAll(){
        WordHandler wordHandler = new WordHandlerImp();
        Assert.assertEquals(2,wordHandler.findAllLongestWord("As he crossed toward the pharmacy at the corner he involuntarily turned his head because of a burst of light that had ricocheted from his temple, and saw, with that quick smile with which we greet a rainbow or a rose, a blindingly white parallelogram of sky being unloaded from the van—a dresser with mirrors across which, as across a cinema screen, passed a flawlessly clear reflection of boughs sliding and swaying not arboreally, but with a human vacillation, produced by the nature of those who were carrying this sky, these boughs, this gliding façade.").size());
        Assert.assertEquals(7,wordHandler.findAllShortestWord("As he crossed toward the pharmacy at the corner he involuntarily turned his head because of a burst of light that had ricocheted from his temple, and saw, with that quick smile with which we greet a rainbow or a rose, a blindingly white parallelogram of sky being unloaded from the van—a dresser with mirrors across which, as across a cinema screen, passed a flawlessly clear reflection of boughs sliding and swaying not arboreally, but with a human vacillation, produced by the nature of those who were carrying this sky, these boughs, this gliding façade.").size());
    }

    @Test
    public void testEmptyString(){
        WordHandler wordHandler = new WordHandlerImp();
        Assert.assertEquals(wordHandler.findLongestWord(""), new WordObject("", 0));
        Assert.assertEquals(wordHandler.findShortestWord(""), new WordObject("", 0));
    }

    @Test(expected=NullPointerException.class)
    public void testNull(){
        WordHandler wordHandler = new WordHandlerImp();
        wordHandler.findLongestWord(null);
        wordHandler.findShortestWord(null);
    }

    @Test
    public void testVeryLongWord(){
        WordHandler wordHandler = new WordHandlerImp();
        Assert.assertEquals(wordHandler.findLongestWord("1 12 123 123536362338279837389279832739879328739732973983279 12"), new WordObject("123536362338279837389279832739879328739732973983279", 51));
        Assert.assertEquals(wordHandler.findShortestWord("1 12 123 123536362338279837389279832739879328739732973983279 12"), new WordObject("1", 1));
    }
}
