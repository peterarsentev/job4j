package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        String[] input = {"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] expect = {"Привет", "Мир", "Супер"};
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] result = arrayDuplicate.remove(input);
        assertThat(result, is(expect));
    }
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicateOneMore() {
        String[] input = {"Мир", "Мир", "Труд", "Май", "Мир", "Отдыхай", "Мир"};
        String[] expect = {"Мир", "Отдыхай", "Труд", "Май"};
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] result = arrayDuplicate.remove(input);
        assertThat(result, is(expect));
    }
}