package entities;

import entities.enums.OrderStatus;
import java.util.Date;

public class OrderS {
    private Integer id;
    private Date moment;
    private OrderStatus status;

    public OrderS(Integer id, Date moment, OrderStatus status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    // Getters e setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "OrderS{" +
                "id=" + id +
                ", moment=" + moment +
                ", status=" + status +
                '}';
    }
}