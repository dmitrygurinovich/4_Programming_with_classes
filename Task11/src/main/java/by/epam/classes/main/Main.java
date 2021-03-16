package by.epam.classes.main;

import by.epam.classes.entity.Sentence;
import by.epam.classes.entity.Text;
import by.epam.classes.entity.Word;

/*
 1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
 консоль текст, заголовок текста.
 */
public class Main {
    public static void main(String[] args) {
        Word[] firstWordsArray = new Word[]{
                new Word("lorem"),
                new Word("ipsum"),
                new Word("dolor"),
                new Word("sit"),
                new Word("amet")
        };

        Word[] secondWordsArray = new Word[]{
                new Word("ut"),
                new Word("enim"),
                new Word("ad"),
                new Word("minim"),
                new Word("veniam")
        };

        Word[] thirdWordsArray = new Word[]{
                new Word("duis"),
                new Word("aute"),
                new Word("irure"),
                new Word("dolor"),
                new Word("in")
        };

        Sentence[] sentences = new Sentence[]{
                new Sentence(firstWordsArray, '.'),
                new Sentence(secondWordsArray, '?'),
                new Sentence(thirdWordsArray, '!')
        };

        System.out.println(sentences[1]);
        // FIXME не делает первую букву предложения большой!
    }
}
