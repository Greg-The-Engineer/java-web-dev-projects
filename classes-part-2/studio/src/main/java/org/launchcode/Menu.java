package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date lastUpdated, ArrayList<MenuItem> items) {
        this.lastUpdated = lastUpdated;
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public void addItem(MenuItem newItem) {
        if (!items.contains(newItem)) {
            items.add(newItem);
            setLastUpdated(new Date()); // Update lastUpdated when a new item is added
        } else {
            System.out.println("Warning: Item already exists in the menu.");
        }
    }

    public void removeItem(MenuItem itemToRemove) {
        items.remove(itemToRemove);
        setLastUpdated(new Date()); // Update lastUpdated when an item is removed
    }

    public void printMenu() {
        for (MenuItem item : items) {
            System.out.println(item.getDescription() + " - $" + item.getPrice() + " (" + item.getCategory() + ")");
        }
    }
}