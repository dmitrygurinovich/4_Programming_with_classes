package by.epam.classes.entity;

import java.util.Objects;

public class Sentence {
    private String sentence;

    public Sentence(Word[] words, char sign) {
        StringBuilder sentence;
        StringBuilder tempSentence;

        sentence = new StringBuilder("");
        tempSentence = new StringBuilder("");

        for (int i = 0; i < words.length; i++) {
            tempSentence.append(words[i].getWord()).append(" ");
        }
        tempSentence.deleteCharAt(tempSentence.length() - 1);
        tempSentence.append(sign);

        sentence.append(Character.toUpperCase(tempSentence.charAt(0)));
        tempSentence.deleteCharAt(0);
        sentence.append(tempSentence);


        this.sentence = sentence.toString();
    }

    public Sentence() {

    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sentence sentence1 = (Sentence) o;
        return sentence.equals(sentence1.sentence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sentence);
    }

    @Override
    public String toString() {
        return sentence;
    }
}
