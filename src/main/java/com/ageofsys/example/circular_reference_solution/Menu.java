package com.ageofsys.example.circular_reference_solution;

import java.util.ArrayList;
import java.util.List;

/**
 * @author AGEOFSYS
 * @since 1.0
 */
public class Menu {
    private final String name;
    private Menu parent;
    private final List<Menu> children = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Menu getParent() {
        return parent;
    }

    public List<Menu> getChildren() {
        return children;
    }

    public void setParent(Menu parent) {
        this.parent = parent;
    }

    public void addChild(Menu child) {
        child.setParent(this);
        children.add(child);
    }
}
