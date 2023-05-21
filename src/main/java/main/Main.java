package main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

interface Calculator {
    int switchOn(int a);
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Testing");
        Calculator calculator = j -> j + 10;

        System.out.print(calculator.switchOn(9));
    }
}


