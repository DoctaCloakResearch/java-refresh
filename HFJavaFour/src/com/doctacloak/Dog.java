package com.doctacloak;

public class Dog {
    int size;
    String name;

    void setSize(int size) {
        this.size = size;
    }

    void setName(String name) {
        this.name = name;
    }

    void bark(int numOfBarks) {
        if (numOfBarks <= 0) {
            return;
        }

        while (numOfBarks > 0) {
            if (size > 60) {
                System.out.println(name + " begins to bark, 'Woof, Woof!!'");
            } else if (size > 14) {
                System.out.println(name + " begins to bark, 'Ruff, Ruff!!'");
            } else {
                System.out.println(name + " begins to bark, 'Yip! Yip!'");
            }
            numOfBarks--;
        }
    }
}
