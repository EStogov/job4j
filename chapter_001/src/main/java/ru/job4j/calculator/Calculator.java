package ru.job4j.calculator;

public class Calculator {
    double result;
    void add(double first, double second) {
        this.result = first + second;
    }
    void subtract(double first, double second) {
        this.result = first - second;
    }
    void div(double first, double second) {
        this.result = first / second;
    }
    void multiply(double first, double second) {
        this.result = first * second;
    }
    double getResult() {
        return this.result;
    }
}
