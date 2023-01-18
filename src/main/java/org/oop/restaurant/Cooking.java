package org.oop.restaurant;

public class Cooking {
    public Cook makeCook(MenuItem menuItem) {

        return new Cook(menuItem.getName(), menuItem.getPrice());
    }

}

