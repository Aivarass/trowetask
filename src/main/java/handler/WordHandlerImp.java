package handler;

import model.WordObject;

import java.util.ArrayList;
import java.util.List;

public class WordHandlerImp implements WordHandler {

    @Override
    public WordObject findLongestWord(String sentence) {
        String longestWord = "";
        for (String s : getArrayFromSentence(sentence)) {
            if (s.length() > longestWord.length()) {
                longestWord = s;
            }
        }
        return new WordObject(longestWord, longestWord.length());
    }

    @Override
    public List<WordObject> findAllLongestWord(String sentence) {
        //Finding all longest words, complexity O(2n)
        List<WordObject> longestWordList = new ArrayList();
        String longestWord = "";
        for (String s : getArrayFromSentence(sentence)) {
            if (s.length() >= longestWord.length()) {
                longestWord = s;
            }
        }
        for(String s: getArrayFromSentence(sentence)){
            if(s.length() == longestWord.length()){
                longestWordList.add(new WordObject(s,s.length()));
            }
        }
        return longestWordList;
    }

    @Override
    public WordObject findShortestWord(String sentence) {
        String shortestWord = getArrayFromSentence(sentence)[0];
        for(String s : getArrayFromSentence(sentence)){
            if(s.length() < shortestWord.length()){
                shortestWord = s;
            }
        }
        return new WordObject(shortestWord, shortestWord.length());
    }

    @Override
    public List<WordObject> findAllShortestWord(String sentence) {
        //Finding all shortest words, complexity O(2n)
        List<WordObject> shortestWordList = new ArrayList();
        String shortestWord = getArrayFromSentence(sentence)[0];
        for(String s : getArrayFromSentence(sentence)){
            if(s.length() < shortestWord.length()){
                shortestWord = s;
            }
        }
        for(String s : getArrayFromSentence(sentence)){
            if(s.length() == shortestWord.length()){
                shortestWordList.add(new WordObject(s,s.length()));
            }
        }
        return shortestWordList;
    }

    @Override
    public String[] getArrayFromSentence(String sentence) {
        if(sentence != null)
            return sentence.replaceAll("\\.","").replaceAll(",","").split(" ");
        return null;
    }
}
