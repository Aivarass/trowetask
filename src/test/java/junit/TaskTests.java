package junit;

import handler.WordHandler;
import handler.WordHandlerImp;
import model.WordObject;
import org.junit.Assert;
import org.junit.Test;

public class TaskTests {

    @Test
    public void findLongestWordTest(){
        WordHandler wordHandler = new WordHandlerImp();
        Assert.assertEquals(new WordObject("jumped",6), wordHandler.findLongestWord("The cow jumped over the moon."));
    }

    @Test
    public void findShortestWordTest(){
        WordHandler wordHandler = new WordHandlerImp();
        Assert.assertEquals(new WordObject("The",3), wordHandler.findShortestWord("The cow jumped over the moon."));
    }

    @Test
    public void finAllLongestWordsTest(){
        WordHandler wordHandler = new WordHandlerImp();
        Assert.assertEquals(1, wordHandler.findAllLongestWord("The cow jumped over the moon.").size());
        Assert.assertEquals(new WordObject("jumped",6), wordHandler.findAllLongestWord("The cow jumped over the moon.").get(0));
    }

    @Test
    public void finAllShortestWordsTest(){
        WordHandler wordHandler = new WordHandlerImp();
        Assert.assertEquals(3, wordHandler.findAllShortestWord("The cow jumped over the moon.").size());
        Assert.assertEquals(new WordObject("The",3), wordHandler.findAllShortestWord("The cow jumped over the moon.").get(0));
        Assert.assertEquals(new WordObject("cow",3), wordHandler.findAllShortestWord("The cow jumped over the moon.").get(1));
        Assert.assertEquals(new WordObject("the",3), wordHandler.findAllShortestWord("The cow jumped over the moon.").get(2));
    }
}
