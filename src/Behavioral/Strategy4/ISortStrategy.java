package Behavioral.Strategy4;

import java.util.List;

public interface ISortStrategy {

    <T> void sort(List<T> items);
}