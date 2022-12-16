package ru.mirea.lab31;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import ru.mirea.lab29.Dish;
import org.junit.jupiter.api.Test;

class DishTest {
    @Test
    public void test2(){
        try {
            Dish dish1 = new Dish(-3, "Борщ", "Описание1");
            Assertions.fail("Expected exception");
        } catch (IllegalArgumentException e) {
            Assertions.assertNotEquals("", e.getMessage());
        }
    }

}