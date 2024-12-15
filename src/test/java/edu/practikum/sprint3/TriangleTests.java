package edu.practikum.sprint3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TriangleTests {

    // Вариант без конструктора. Тогда для каждой переменной нужно прописать
    // анатацию с параметризацией и номером индекса.
    // Так же нужно переменные сделать публичными
    @Parameterized.Parameter
    public int side1;
    @Parameterized.Parameter(1)
    public int side2;
    @Parameterized.Parameter(2)
    public int side3;
    @Parameterized.Parameter(3)
    public int expected;

// Текст в анатации стои прописать, если
// у нас только один тест (проверка только одного метода)
    @org.jetbrains.annotations.NotNull
    @org.jetbrains.annotations.Contract(value = " -> new", pure = true)
    @Parameterized.Parameters(name = "Тест {index}: треугольник со сторонами " +
            "{0}, {1}, {2} должен иметь периметр {3}")
    public static Object[][] data() {
        return new Object[][] {
                { 2, 5, 8, 15 },
                { 1, 1, 5, 7 }
        };
    }

    @Test
    public void perimeterTest() {
        Triangle triangle = new Triangle(side1, side2, side3);
        assertEquals("Периметр вычислен неверно", expected, triangle.perimeter());
    }
    // При запуске тестов ниже к ним так же будет применятсья текст из Параметризации,
    // хотя и значения в них прописаны вручную. Что некорректно.
    // Лучше выносить каждый тест в отдельный класс
    @Test
    public void squareTest() {
        Triangle triangle = new Triangle(2, 3, 4);
        assertEquals("Площадь вычислена неверно", 3, triangle.square());
    }

    @Test
    public void maxSideTest() {
        Triangle triangle = new Triangle(10, 2, 5);
        assertEquals("Площадь вычислена неверно", 10, triangle.maxSide());
    }
}

