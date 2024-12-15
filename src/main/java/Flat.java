public class Flat {
    // КЛАСС ДЛЯ ЭКСПЕРИМЕНТОВ
    static String company = "Хорошая компания"; // объявили переменную в классе

    public void printCompany() {
        System.out.println(company);
    }

    public void setCompany1(String company) {
        Flat.company = company; // можно так
    }

    public void setCompany2(String value) {
        company = value; // а можно вот так
    }
}
