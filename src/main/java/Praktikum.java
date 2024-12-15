import ru.restaurant.Restaurant;

public class Praktikum {

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant(); // создай объект класса Restaurant


        //restaurant.showMenu();
        restaurant.cook(restaurant.menu[2]);    // вызови три написанных ранее метода
        restaurant.checkPears();

        // место для проверки стороннего кода

        int dividend = 100;
        int divider = 500;
        double result1 = dividend/divider;
        System.out.println("Результат деления переменной dividend на divider: " + result1);
        // ещё сторонний код
        System.out.println("Вызов метода getMoney: " + restaurant.getMoney(1742l));;
        //
        System.out.println();
        System.out.println("Новый кусок кода:");
        Flat flat = new Flat();
        flat.printCompany();
        flat.setCompany1("Новое значение для compfny");
        System.out.println(flat.company);
        flat.setCompany2("Значение для value");
        System.out.println(flat.company);
        }

}