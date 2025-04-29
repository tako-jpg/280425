public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int age1 = 18;
        if (age1 >= 18) {
            System.out.println("Если твой возраст равен или больше " + age1 + ", то ты совершеннолетний.");
        } else {
            System.out.println("Эээ ты куда, как танк... в паспорт глянь салага ¯\\_(ツ)_/¯.");
        }
        System.out.println("Задание 2");
        int t = 5;
        if (t >= 5) {
            System.out.println("О! + " + t + " сегодня можно без шапки, на улице тепло!");
        } else {
            System.out.println("Можно без шапки, только уши оставь дома");
        }
        System.out.println("Задание 3");
        int speed = 65;
        if (speed >= 61 && speed <= 80) {
            System.out.println("Если Ваша скорость больше 60, но меньше 80 , и равна " + speed + " км/ч., то Вам скорее всего не выпишут штраф.");
        } else {
            System.out.println("Если у Вас другая скорость, узнайте о штрафах на сайте ГИБДД");
        }
        if (speed >= 81 && speed <= 100) {
            System.out.println("Если Ваша скорость больше 80, но меньше 100, и равна " + speed + " км/ч., то Вам выпишут штраф 500 руб.");
        } else {
            System.out.println("Если у Вас другая скорость, узнайте о штрафах на сайте ГИБДД");
        }

        }
    }






