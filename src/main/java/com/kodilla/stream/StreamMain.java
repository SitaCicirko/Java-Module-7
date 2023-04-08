package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {

    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String abc = "abc";
        String abcdef = "ABCDEF";
        poemBeautifier.beautify(abc, text -> "ABC" + text + "ABC");
        poemBeautifier.beautify(abc, text -> text.toUpperCase());
        poemBeautifier.beautify(abcdef, text -> text.toLowerCase() );
        poemBeautifier.beautify(abc, text -> text.replaceAll("sruu", "tututu"));
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}