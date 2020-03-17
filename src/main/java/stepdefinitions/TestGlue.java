package stepdefinitions;

import handler.WordHandler;
import handler.WordHandlerImp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.WordObject;
import org.junit.Assert;

public class TestGlue {

    static String sentence;
    static WordObject shortestWord;
    static WordObject longestWord;

    @Given("^I am provided with a sentence: (.*?)$")
    public void getSentence(String sentence){
        this.sentence = sentence;
    }

    @When("^I check the sentence for the longest word")
    public void checkForLongestWord(){
        WordHandler wordHandler = new WordHandlerImp();
        this.longestWord = wordHandler.findLongestWord(sentence);
    }

    @And("^I check the sentence for the shortest word")
    public void checkForShortestWord(){
        WordHandler wordHandler = new WordHandlerImp();
        this.shortestWord = wordHandler.findShortestWord(sentence);
    }

    @Then("^The longest word should be (.*?)$")
    public void getResultLongest(String expected){
        Assert.assertEquals(new WordObject(expected,expected.length()),longestWord);
    }

    @And("^The shortest word should be (.*?)$")
    public void getResultShortest(String expected){
        Assert.assertEquals(new WordObject(expected,expected.length()),shortestWord);
    }

}
