import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int toadEyesCount;          //Жабьи глаза
        int ghoulTearsCount;        //Слезы вурдалака
        int ravenBonesCount;        //Кости ворона
        int dumplingsCount;         //Пельмени(а почему, собственно нет? xD)
//        int toadEyesCount = 10;          //Жабьи глаза
//        int ghoulTearsCount = 10;        //Слезы вурдалака
//        int ravenBonesCount = 10;        //Кости ворона
//        int dumplingsCount = 10;         //Пельмени(а почему, собственно нет? xD)
        //todo реализовать ввод пользователем кол-ва ингредиентов.
        System.out.print("How many toad's eyes do you have?: ");
        toadEyesCount = new Scanner(System.in).nextInt();
        System.out.print("How many ghoul's tears do you have?: ");
        ghoulTearsCount = new Scanner(System.in).nextInt();
        System.out.print("How many raven's bones do you have?: ");
        ravenBonesCount = new Scanner(System.in).nextInt();
        System.out.print("How many dumplings do you have?: ");
        dumplingsCount = new Scanner(System.in).nextInt();

        //Рецепты Эликсиров:
        // 1. 3 Жабьих глаза + 1 кость ворона - Эликсир зоркости
        // 2. 2 кости ворона + 4 пельменя - Эликсир стойкости
        // 3. 7 слез вурдалака + 1 пельмень + 2 жабьих глаза - Эликсир скрытности
        // 4. 5 слез вурдалака + 10 пельменей + 4 жабьих глаза + 3 кости ворона - Запретный эликсир

         int elixirOfVigilance = toadEyesCount / 3 + ravenBonesCount;
         int elixirOfEndurance = ravenBonesCount / 2 + dumplingsCount / 4;
         int elixirOfSecrecy = ghoulTearsCount / 7 + dumplingsCount + toadEyesCount / 2;
         int forbiddenElixir = ghoulTearsCount / 5 + dumplingsCount / 10 + toadEyesCount / 4 +
                                ravenBonesCount / 3;

        //todo дописать логику программы сюда
        if (toadEyesCount / 3 > 0 && ravenBonesCount > 0) {
            System.out.println("You can make " + toadEyesCount / 3 + " elixirs of Vigilance");
        }
        if (ravenBonesCount / 2 > 0 && dumplingsCount / 4 > 0) {
            System.out.println("You can make " + dumplingsCount / 4 + " elixirs of Endurance");
        }
        if (ghoulTearsCount / 7 > 0 && dumplingsCount > 0 && toadEyesCount / 2 > 0) {
            System.out.println("You can make " + ghoulTearsCount / 7 + " elixirs of Secrecy");
        }
        if (ghoulTearsCount / 5 > 0 &&
                dumplingsCount / 10 > 0 &&
                toadEyesCount / 4 > 0 &&
                ravenBonesCount / 3 > 0) {
            System.out.println("You can make " + dumplingsCount / 10 + " forbidden elixirs");
        }
        if (toadEyesCount < 2 || ghoulTearsCount < 5 || ravenBonesCount < 1 || dumplingsCount < 1) {
            System.out.println("You can't make elixirs! You don't have ingredients enough!");
        }
    }
}
