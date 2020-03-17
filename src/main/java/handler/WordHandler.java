package handler;

import model.WordObject;

import java.util.List;

public interface WordHandler {

    WordObject findLongestWord(String sentence);

    List<WordObject> findAllLongestWord(String sentence);

    WordObject findShortestWord(String sentence);

    List<WordObject> findAllShortestWord(String sentence);

    String[] getArrayFromSentence(String sentence);

}
