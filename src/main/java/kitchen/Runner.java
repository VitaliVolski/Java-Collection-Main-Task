//Задание. Создать консольное приложение, удовлетворяющее следующим требованиям:
//        Каждый класс должен иметь отражающее смысл название и информативный состав.
//        Использовать возможности ООП: классы, наследование, полиморфизм, инкапсуляция.
//        Наследование должно применяться только тогда, когда это имеет смысл.
//        При кодировании должны быть использованы соглашения об оформлении кода java code convention.
//        Классы должны быть грамотно разложены по пакетам
//        Консольное меню должно быть минимальным.
//        Для хранения параметров инициализации можно использовать файлы.
//- Шеф-повар. Определить иерархию овощей. Сделать салат. Подсчитать калорийность.
//  Провести сортировку овощей для салата на основе одного из параметров.
//  Найти овощи в салате, соответствующие заданному диапазону калорийности.

package kitchen;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Chef chef = new Chef();
        Salad salad = new Salad();
        DietSalad dietSalad = new DietSalad();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, welcome to chef cooker kitchen,\n "
                + "Do you want to test our DietSalad.java ?\n"
                + "Please, write 'yes' - to test or 'no' - to finish, and press 'Enter'");
        String answer = scanner.nextLine();

        if (answer.equals("no")) {
            System.out.println("We wish, you don't wont to test it.");
            System.exit(0);
        } else {
            System.out.println("\nCreate salad from the existing ingredients: "
                    + chef.createDietSalad(dietSalad.collectDietSaladIngredients()));
            salad.countSaladCalories(chef.createDietSalad
                    (dietSalad.collectDietSaladIngredients()));
            salad.sortSaladByWeightSaladIngredientsInDishes
                    (chef.createDietSalad(dietSalad.collectDietSaladIngredients()));
            salad.sortSaladIngredient
                    (chef.createDietSalad(dietSalad.collectDietSaladIngredients()));
        }
    }
}
