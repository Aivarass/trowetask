    package model;

    import java.util.Objects;


    public class WordObject {

                    private int length;
                    private String word;

                    public WordObject(String word, int length){
                        this.length = length;
                        this.word = word;
                    }

                    public int getLength() {
                        return length;
                    }

                    public String getWord() {
                        return word;
                    }

                    @Override
                    public boolean equals(Object o) {
                        if (this == o) return true;
                        if (!(o instanceof WordObject)) return false;
                        WordObject that = (WordObject) o;
                        return length == that.length &&
                                Objects.equals(word, that.word);
                    }

                    @Override
                    public int hashCode() {
                        return Objects.hash(length, word);
                    }

                    @Override
                    public String toString() {
                        return "ResultModel{" +
                                "length=" + length +
                                ", word='" + word + '\'' +
                                '}';
                    }
                }

