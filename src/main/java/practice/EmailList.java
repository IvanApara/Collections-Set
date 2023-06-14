package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailList {
    private TreeSet<String> emaiList = new TreeSet<>();
    private String finishEmail;

    public void add(String email) {
        String smallText = email.toLowerCase();
        finishEmail ="[a-zA-Z]{0,100}[@]{1}[a-yA-Z]{0,100}[.]{1}[a-z]{2,10}";
        Pattern pattern = Pattern.compile(finishEmail);
        Matcher matcher = pattern.matcher(smallText);
        String equals = "";
        while (matcher.find()) {
            equals = matcher.group();
        }
        if(equals.equals(email)){
            emaiList.add(email);
        } else {
            System.out.println("Неверный формат email");
        }
        // TODO: валидный формат email добавляется, email это строка, она быть может любой
        // принять решение добавлять аргумент email или нет должен этот метод
    }
    public List<String> getSortedEmails() {
        List<String > result = new ArrayList<>(emaiList);

        // TODO: возвращается сортированный список электронных адресов в алфавитном порядке
        return result;
    }


}
