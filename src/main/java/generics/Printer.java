package generics;

//14:38

import java.io.Serializable;
/*
* Generic Class
* */
public class Printer<T, V extends Serializable> {
    T element;
    V secondElement;

    public Printer(T element, V secondElement) {
        this.element = element;
        this.secondElement = secondElement;
    }

    public void print() {
        System.out.println("V:" + element + " - " + "T:" + secondElement);
    }
}
