package entities; // Isso deve estar presente!

public class Comment { // Nome da classe deve ser Comment (no singular)
    private String text;

    public Comment(String text) { // O nome do construtor deve ser igual ao da classe!
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
