package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class fin {
    public static void main(String[] args) {
        Notebook notebook1 = new Notebook("MSI", "8",  "grey");
        Notebook notebook2 = new Notebook("ACER", "4", "black");
        Notebook notebook3 = new Notebook("DNS", "4", "black");
        Notebook notebook4 = new Notebook("MSI", "16", "grey");
        Notebook notebook5 = new Notebook("Huawei", "8", "black");

        Set<Notebook> notebooks = new HashSet<>(List.of(notebook1, notebook2,
                notebook3, notebook4, notebook5));

        Map<String, String> sel = selectCriteria();
        sort(sel, notebooks);
    }
    public static String scanner() {
        Scanner scanner = new Scanner(System.in);
        String scan = scanner.nextLine();
        return scan;
    }
    public static Map<String, String> selectCriteria() {
        Map<String, String> resultCriterias = new HashMap<>();
        while (true) {
            {
                System.out.println("Выберите пункт: \n 1 - Название \n 2 - ОЗУ \n 3 - Цвет");
                String key = scanner();
                System.out.println("Введите значения: ");
                String value = scanner();
                resultCriterias.put(key, value);
            }
            System.out.println(resultCriterias);
            return resultCriterias;
        }
    }
    public static void sort(Map<String, String> criterias, Set<Notebook> notebooks) {

        Set<Notebook> temp = new HashSet<>(notebooks);
        for (Notebook notebook : notebooks) {

            for (Object pair : criterias.keySet()) {
                if (pair.equals("1") && !notebook.getName().equals(criterias.get(pair))) {
                    temp.remove(notebook);
                }
                for (Object pair1 : criterias.keySet()) {
                    if (pair1.equals("2") && !notebook.getRam().equals(criterias.get(pair1))) {
                        temp.remove(notebook);

                    }
                    for (Object pair2 : criterias.keySet()) {
                        if (pair2.equals("3") && !notebook.getColour().equals(criterias.get(pair2))) {
                            temp.remove(notebook);
                        }
                    }
                }
            }
        }
        if (temp.isEmpty()) {
            System.out.println("По введенным критериям ничего не найдено!");
        } else {
            System.out.println("Ваша подборка: \n" + temp.toString());
        }
    }
}