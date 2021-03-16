package by.epam.classes.entity;

import java.util.Objects;

public class Text {
    private String text;

    public Text(Sentence[] sentences) {
        StringBuilder text;
        text = new StringBuilder("");

        for (Sentence sentence : sentences) {
            text.append(sentence).append(" ");
        }

        text.deleteCharAt(text.charAt(text.length() - 1));

        this.text = text.toString();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text1 = (Text) o;
        return text.equals(text1.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }

    @Override
    public String toString() {
        return text;
    }
}
