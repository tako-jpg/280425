public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Тебе уже есть 18 лет!");
        }
            if (age <= 18) {
                System.out.println("Твой возраст совершеннолетия, еще не наступил!");
        }
        System.out.println("Задание 1_2");
        int age1 = 18;
        if (age1 < 18) {
            System.out.println("Если возраст человека равен или больше" +age1+ ", то он совершеннолетний");
        }
        else {
            System.out.println("Если возраст человека меньше " +age1+ ", то нужно немного подождать");
        }

    }
}