package entities;

import java.util.Date;

public class Order {
    private Date date;
    private Produto product;

    public Order(Date date, Produto product) {
        this.date = date;
        this.product = product;
        this.product.nome = "TV";
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Produto getProduct() {
        return product;
    }

    public void setProduct(Produto product) {
        this.product = product;
    }
}
