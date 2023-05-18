import java.util.Scanner;

public class StringSwitch {
    public static void main(String[] args) {
        do{
            Scanner in = new Scanner(System.in);
            System.out.println("Введите команду: ");
            String command = in.nextLine();
            switch (command){
                case "connect":
                    System.out.println("Набор оператора для команды \"Соедиение\"");
                    break;
                case "cancel":
                    System.out.println("Набор оператора для команды \"Отмена действия\"");
                    break;
                case "disconnect":
                    System.out.println("Набор оператора для команды \"Разъедиение\"");
                    break;
                case "exit":
                    return;
                default:
                    System.out.println("Неверная команда!");
                    break;

            }
        } while (true);

    }
}
// TODO: 18.05.2023
