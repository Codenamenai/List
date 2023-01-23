import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> shoppingList = new ArrayList<>();
        while (true) {
            System.out.println("Выберите операцию:");
            System.out.println("1. Добавить");
            System.out.println("2. Посмотреть");
            System.out.println("3. Удалить");
            System.out.println("4. Найти");
            String operation = scanner.nextLine();
            int choise = Integer.parseInt(operation);
            switch (choise) {
                case 1:
                    System.out.println("Какую покупку хотите добавить?");
                    shoppingList.add(scanner.nextLine());
                    System.out.println(shoppingList);
                    System.out.println("количество продуктов :" + shoppingList.size());
                    break;
                case 2:
                    System.out.println("Список покупок :");
                    for (int i = 0; i < shoppingList.size(); i++) {
                        System.out.println(i + 1 + "." + shoppingList.get(i));


                    }
                    break;
                case 3:
                    System.out.println("Список покупок :");
                    for (int i = 0; i < shoppingList.size(); i++) {
                        System.out.println(i + 1 + "." + shoppingList.get(i));
                    }
                    System.out.println("Какую хотите удалить? Введите номер или название");
                    if (scanner.hasNextInt()) {
                        String purchase = scanner.nextLine();
                        int numberPurchase = Integer.parseInt(purchase) - 1;
                        System.out.println(numberPurchase);
                        System.out.println("Покупка " + shoppingList.get(numberPurchase) +
                                " удалена");
                        shoppingList.remove(numberPurchase);
                        System.out.println("Список покупок :");
                        for (int i = 0; i < shoppingList.size(); i++) {
                            System.out.println(i + 1 + "." + shoppingList.get(i));
                        }


                    } else {
                        String purchase = scanner.nextLine();
                        System.out.println("Покупка " + purchase +
                                " удалена");
                        shoppingList.remove(purchase);
                        System.out.println("Список покупок :");
                        for (int i = 0; i < shoppingList.size(); i++) {
                            System.out.println(i + 1 + "." + shoppingList.get(i));
                        }

                    }
                    break;
                case 4:
                    System.out.println("Введите текст для поиска");
                    String search = scanner.nextLine();
                    System.out.println("Найдено: ");
                    for (int i = 0; i < shoppingList.size(); i++) {
                        String itemLower = shoppingList.get(i).toLowerCase();
                        String queryLower = search.toLowerCase();
                        if (itemLower.contains(queryLower)) {
                            System.out.println((i + 1) + " : " + shoppingList.get(i));
                        } else {
                            System.out.println("нет данных ");
                        }

                    }
                    break;

            }
        }


    }

}




