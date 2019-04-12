package net;

public enum ErrorCode {
    NEGATIVE_SIZE("Размер не может быть отрицательным");

    private String text;

    ErrorCode(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
