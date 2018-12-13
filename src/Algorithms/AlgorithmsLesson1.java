package Algorithms;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AlgorithmsLesson1 {

    public static void main(String[] args) {

//        indexOfmass();
//        maxInteger();
//        exchange();
//        equations();
//        month();
        humanAge();
    }


    //Ввести вес и рост человека. Рассчитать и вывести индекс массы тела по формуле i=m/(h*h);
    //где m-масса тела в килограммах, h - рост в метрах.

//    static void indexOfmass() throws InputMismatchException {
//      System.out.println("Рассчет индекса массы тела");
//        try {
//            Scanner scanner1 = new Scanner(System.in);
//            System.out.println("Введите массу тела в кг:                Дробное число разделяется запятой");
//            float m = scanner1.nextFloat();
//            System.out.println("Введите рост в м: ");
//            float h = scanner1.nextFloat();
//            float i = m / (h * h);
//            System.out.println("Индекс массы тела равен: " + i);
//        } catch (InputMismatchException e) {
//            System.out.println("Необходимо ввести число" + "\n");
//            indexOfmass();
//        }
//    }


    // Найти максимальное из четырех чисел. Массивы не использовать.

//    static void maxInteger()  throws InputMismatchException {
//        try {
//            System.out.println("Поиск максимального числа");
//            Scanner scaner = new Scanner(System.in);
//            System.out.println("Введите первое число:");
//            float firstInteger = scaner.nextFloat();
//            System.out.println("Введите второе число:");
//            float secondInteger = scaner.nextFloat();
//            System.out.println("Введите третье число:");
//            float thirdInteger = scaner.nextFloat();
//            System.out.println("Введите четвертое число:");
//            float fourthInteger = scaner.nextFloat();
//            float firstMaxInteger = Math.max(firstInteger, secondInteger); // Попарное сравнение.
//            float secondMaxInteger = Math.max(thirdInteger, fourthInteger);
//            float realyMaxInteger = Math.max(firstMaxInteger, secondMaxInteger);
//            System.out.println("Максимальное число: " + realyMaxInteger);
//        } catch (InputMismatchException e) {
//            System.out.println("Введите число. Если число дробное, разделите его запятой");
//            maxInteger();
//        }
//    }


    //Написать программу обмена значениями двух целочисленных переменных:
    //a. с использованием третьей переменной;
    //b. *без использования третьей переменной.

//    public static void exchange() {
//        int a = 5;
//        int b = 8;
//        int c = b;
//        int b = a;
//        int a = c;
//
//        int a = a + b;
//        int b = a - b;
//        int a = a - b;
//    }


    //Написать программу нахождения корней заданного квадратного уравнения

//    public static void equations() {
//        System.out.println("Решение квадратных уравнений" + "\n" + "представим уравнение в виде: ax^2 + bx + c = 0");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите значение а:");
//        float a = scanner.nextFloat();
//        while (a == 0){
//            System.out.println("Число a не должно быть равно 0" + "\n" + "Введите значение а:");
//            Scanner scanner1 = new Scanner(System.in);
//            a = scanner1.nextFloat();
//        }
//        System.out.println("Введите значение b:");
//        float b = scanner.nextFloat();
//        System.out.println("Введите значение c:");
//        float c = scanner.nextFloat();
//        float d = (float) (Math.pow(b, 2) - 4*a*c);
//        if (d < 0) {
//            System.out.println("Уравнение не имеет корней.");
//        } else if (d == 0){
//            float x = (float) (-b + Math.sqrt(d))/2*a;
//            System.out.print("Уравнение имеет один корень: " + Math.round(x, ));
//        } else if (d > 0){
//            float x = (float) ((-b + Math.sqrt(d))/2*a);
//            float y = (float) ((-b - Math.sqrt(d))/2*a);
//            System.out.print("Уравнение имеет два корня: " + x + " и " + y);
//        }
//    }


    //С клавиатуры вводится номер месяца. Требуется определить, к какому времени года он относится.

//    public static void month() throws InputMismatchException {
//        System.out.println("Определение сезона");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите порядковый номер мясяца:");
//        try {
//            int month = scanner.nextInt();
//            while (month > 12 || month < 1) {
//                System.out.println("Введите число от 1 до 12");
//                Scanner scaner1 = new Scanner(System.in);
//                month = scaner1.nextInt();
//            }
//            if (month >= 3 && month <= 5) {
//                System.out.println("Это весенний месяц.");
//            }
//            if (month >= 6 && month <= 8) {
//                System.out.println("Это летний месяц.");
//            }
//            if (month >= 9 && month <= 11) {
//                System.out.println("Это осенний месяц.");
//            }
//            if (month == 12 || month <= 2) {
//                System.out.println("Это зимний месяц.");
//            }
//        }
//        catch (InputMismatchException e) {
//            System.out.println("Введите число от 1 до 12");
//            month();
//        }
//    }


    //Ввести возрастчеловека(от 1 до 150 лет) и вывести его вместе с последующим словом «год», «года» или «лет».

    public static void humanAge() throws InputMismatchException {
        try {
            System.out.println("Введите количество целых лет:");
            Scanner scanner = new Scanner(System.in);
            int age = scanner.nextInt();
            if (age > 150 || age < 1) {
                System.out.println("Таких людей не бывает :) Попробуйте еще раз.");
                humanAge();
            }
            String ageOfHuman = Integer.toString(age);
            switch (ageOfHuman.length()) {
                case 1:
                    age = Integer.parseInt(ageOfHuman);
                    if (age == 0 || age >= 5) {
                        System.out.println("Возраст: " + age + " лет.");
                    } else if (age >= 2 & age <= 4 ) {
                        System.out.println("Возраст: " + age + " года.");
                    }
                    break;
                case 2:
                    age = Integer.parseInt(ageOfHuman.substring(1,2));
                    if (age == 0 || age >= 5) {
                        System.out.println("Возраст: " + age + " лет.");
                    } else if (age >= 2 & age <= 4 ) {
                        System.out.println("Возраст: " + age + " года.");
                    }
                    break;
                case 3:
                    age = Integer.parseInt(ageOfHuman.substring(2,3));
                    if (age == 0 || age >= 5) {
                        System.out.println("Возраст: " + age + " лет.");
                    } else if (age >= 2 & age <= 4 ) {
                        System.out.println("Возраст: " + age + " года.");
                    }
                    break;
            }
        }
        catch (InputMismatchException e) {
            System.out.println("Введите целое число.");
            humanAge();
        }

    }




}