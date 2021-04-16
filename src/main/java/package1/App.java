package package1;

import java.io.*;
import java.net.URL;
import java.util.*;

/**
 * Hello world!
 */
public class App {
    public App() throws FileNotFoundException {
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //1.Создание пользователей
        CreateNameSurname createNameSurname = new CreateNameSurname();
        List<Person> list = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            list.add(new Person(createNameSurname.getListName(), createNameSurname.getListSurName()));
        }

        //2.Сортировка меньше 21 возраст и печать на экран
        list.stream().filter(e -> e.getAge() < 21).forEach(e -> System.out.println(e));

        //3.Сортировка меньше 21 возраст и печать на экран
        Collections.sort(list, Person.sortPerson());

        //4.Убираем дубли
        HashSet<Person> hashSetListPerson = new HashSet<>(list);

        //5.Сохраняем в файл
        Person.saveFile(hashSetListPerson);

        //6.Читаем файл
        Person.readFile();


        //7.Сериализация и дессериализация
        //8.Вывод на экран
        Person.SerDesFile(hashSetListPerson);



    }
}
