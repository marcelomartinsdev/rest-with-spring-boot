package br.com.marcelomartinsdev.rest;

public class Greetings {
    private final Long ID;
    private final String content;

    public Greetings(Long ID, String content) {
        this.ID = ID;
        this.content = content;
    }

    public Long getID() {
        return ID;
    }

    public String getContent() {
        return content;
    }
}
