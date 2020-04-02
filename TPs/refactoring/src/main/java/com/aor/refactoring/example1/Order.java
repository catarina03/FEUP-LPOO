package com.aor.refactoring.example1;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderLine> lines;
    private double total;

    public Order() { lines = new ArrayList<>(); }

    public double getTotal() { return total; }

    public void add(Product product, int quantity) {
        lines.add(new OrderLine(product, quantity));
        total += product.getPrice() * quantity;
    }

    public boolean isElegibleForFreeDelivery() {
        return getTotal() > 100;
    }

    public String printOrder() {
        StringBuffer printBuffer = new StringBuffer();

        for (OrderLine line : lines)
            printBuffer.append(line.toString());

        printBuffer.append("Total: " + this.total);

        return printBuffer.toString();
    }
}