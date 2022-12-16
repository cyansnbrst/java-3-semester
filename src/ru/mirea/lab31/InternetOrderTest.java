package ru.mirea.lab31;

import org.junit.jupiter.api.Assertions;
import ru.mirea.lab29.Dish;
import ru.mirea.lab29.Drink;
import ru.mirea.lab29.InternetOrder;
import ru.mirea.lab29.Item;
import org.junit.jupiter.api.Test;

class InternetOrderTest {
    @Test
    public void sorting_test(){
        Dish dish1 = new Dish(4, "Шашлык", "Описание1");
        Dish dish2 = new Dish(3, "Оливье", "Описание2");
        Drink drink1 = new Drink(5, "Вино красное", "Описание3");
        Item[] arr1 = {dish1, drink1, dish2};
        InternetOrder internetOrder = new InternetOrder(arr1);
        Item[] sortred = internetOrder.sort();
        Item[] expected = {drink1, dish1, dish2};
        Assertions.assertEquals(sortred, expected);
    }
}