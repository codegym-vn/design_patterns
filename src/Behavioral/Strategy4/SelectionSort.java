package Behavioral.Strategy4;

import java.util.List;

public class SelectionSort implements ISortStrategy {

    @Override
    public <T> void sort(List<T> items) {
        System.out.println("Selection sort");
    }
}