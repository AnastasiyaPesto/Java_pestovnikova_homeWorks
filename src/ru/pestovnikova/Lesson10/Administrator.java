package ru.pestovnikova.Lesson10;

import javax.jws.soap.SOAPBinding;
import java.io.*;
import java.util.ArrayList;

public class Administrator extends User {
    private File fileUsers;
    public Administrator(String name, String surname, int age, TypesUsers viewUser) {
        super(name, surname, age, viewUser);
        File fileUsers = new File("users.txt");
    }

    public Administrator() {
        super();
        File fileUsers = new File("users.txt");
    }

    /*добавление нового пользователя*/
    public void addNewUser() throws IOException {
        AnyUser newAnyUser = new AnyUser();
        try (BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in))) {
            System.out.println("Имя нового пользователя:");
            newAnyUser.setName(bufferedReader.readLine());

            System.out.println("Фамилия нового пользователя:");
            newAnyUser.setSurname(bufferedReader.readLine());

            System.out.println("Возраст");
            String age = bufferedReader.readLine();
            newAnyUser.setAge(Integer.parseInt(age));

            System.out.println("Вид пользователя:\n 1 - Обычный пользователь\n 2 - Администратор\n 3 - Менеджер" );
            String typeUser = bufferedReader.readLine();
            newAnyUser.setViewUser(TypesUsers.parseIntToTypeUser(Integer.parseInt(typeUser)));
        }
    }

    // TODO-me разделить добавление пользователей (пр. если простой юзер, то метод свой)
    // или внутри этого метода 3 ветки сделать
    private void writeNewAnyUserDB(User newUser) throws IOException {
        //TODO-me посмотреть лекцию про приведение пользовательских типов и instanceof
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileUsers))) {
            writer.write(/*newUser.getId* + '/' +*/ newUser.getName() + "/" + newUser.getSurname() + "/" +
                    newUser.getAge() + "/" + newUser.getViewUser());
        }
    }
}
