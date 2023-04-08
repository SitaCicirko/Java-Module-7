package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;

public class StreamMain {

    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String abc = "abc";
        String abcdef = "ABCDEF";
        poemBeautifier.beautify(abc, text -> "ABC" + text + "ABC");
        poemBeautifier.beautify(abc, text -> text.toUpperCase());
        poemBeautifier.beautify(abcdef, text -> text.toLowerCase() );
        poemBeautifier.beautify(abc, text -> text.replaceAll("sruu", "tututu"));
    }
}