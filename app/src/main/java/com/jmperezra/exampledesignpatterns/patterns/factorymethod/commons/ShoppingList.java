package com.jmperezra.exampledesignpatterns.patterns.factorymethod.commons;

import java.util.Date;
import java.util.List;

/**
 * Bean Class
 *
 */
public class ShoppingList {

    private int id;

    private Date date;

    private List<Items> items;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }
}
