package com.example.dictionary.Models;

import java.util.List;

public class Definitions {
    String definition = "";

    String example = "";
    List<String> synonym = null;
    List<String> antoyms = null;

    public List<String> getSynonym() {
        return synonym;
    }

    public void setSynonym(List<String> synonym) {
        this.synonym = synonym;
    }

    public List<String> getAntoyms() {
        return antoyms;
    }

    public void setAntoyms(List<String> antoyms) {
        this.antoyms = antoyms;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }
}
