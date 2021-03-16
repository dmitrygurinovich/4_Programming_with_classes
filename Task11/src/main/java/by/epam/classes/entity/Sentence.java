package by.epam.classes.entity;

import java.util.Objects;

public class Sentence {
    private String sentence;

    public Sentence(Word[] words, char sign) {
        StringBuilder sentence;

        sentence = new StringBuilder("");

        for (int i = 0; i < words.length; i++) {
            sentence.append(words[i].getWord()).append(" ");
        }
        sentence.deleteCharAt(sentence.length() - 1);
        sentence.append(sign);


        Character.toUpperCase(sentence.charAt(0));
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
