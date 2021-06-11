package edu.smu.M2ChallengeSpringberryMercury.models;

import java.util.Objects;

public class Definition {
    public String word;
    public String definition;
    public int id;

    public Definition(String word, String definition, int id) {
        this.word = word;
        this.definition = definition;
        this.id = id;
    }
    public Definition(){

    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Definition definition1 = (Definition) o;
        return id == definition1.id && Objects.equals(word, definition1.word) && Objects.equals(definition, definition1.definition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word, definition, id);
    }

    @Override
    public String toString() {
        return "Word{" +
                "word='" + word + '\'' +
                ", definition='" + definition + '\'' +
                ", id=" + id +
                '}';
    }
}
