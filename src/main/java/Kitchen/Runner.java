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

package Kitchen;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Chef chef = new Chef();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, welcome to chef cooker kitchen,\n "
                + "Do you want to test our DietSalad ?\n"
                + "Please, write 'yes' - to test or 'no' - to finish, and press 'Enter'");
        String negativeAnswer = scanner.nextLine();

        if (negativeAnswer.equals("no")) {
            System.out.println("We wish, you don't wont to test it.");
            System.exit(0);
        } else {
            chef.createDietSalad();
            chef.countSaladCalories();
            chef.sortSaladByWeightSaladIngredientsInDishes();
            chef.sortSaladIngredient();
        }
    }
}

