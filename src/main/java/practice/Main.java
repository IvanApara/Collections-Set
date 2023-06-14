package practice;

import java.util.Scanner;

public class Main {
    private static EmailList emailList = new EmailList();

    /* TODO:
        Пример вывода списка Email, после ввода команды LIST в консоль:
        test@test.com
        hello@mail.ru
        - каждый адрес с новой строки
        - список должен быть отсортирован по алфавиту
        - email в разных регистрах считается одинаковыми
           hello@skillbox.ru == HeLLO@SKILLbox.RU
        - вывод на печать должен быть в нижнем регистре
           hello@skillbox.ru
        Пример вывода сообщения об ошибке при неверном формате Email:
        "Неверный формат email"
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email;
        String commandsUser;
        while (true) {
            String input = scanner.nextLine();
            int team = input.indexOf(' ');

            if (team < 0) {
                commandsUser = input;
            } else {
                commandsUser = input.substring(0, team);
            }
            email = input.substring(team + 1);
            if (commandsUser.equals("ADD")) {
                emailList.add(email);
            }
            if (commandsUser.equals("LIST")) {
                for (String emailsUser : emailList.getSortedEmails()){
                    System.out.println(emailsUser);
                }
            }

        }
    }
}