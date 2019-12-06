package org.launchcode.skillstracker.Model;

import java.util.ArrayList;

public class Programming {
    private ArrayList<String> languages= new ArrayList<>();
    private ArrayList<String> numbers = new ArrayList<>();
    public Programming(){
        numbers.add(" ");
        numbers.add(" second ");
        numbers.add(" third ");
        languages.add("java");
        languages.add("javascript");
        languages.add("ruby");
    }

    public ArrayList<String> getNumbers() {
        return numbers;
    }

    public void addNumbers(String numbers) {
        this.numbers.add(numbers);
    }

    public ArrayList<String> getLanguages() {
        return languages;
    }

    public void addLanguages(String languages) {
        this.languages.add(languages);
    }
}
