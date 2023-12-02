import java.util.Scanner;

public class BasicContactManager implements ContactManagement{
    Scanner scanner = new Scanner(System.in);
    private int maxContacts = 100;
    private String[] names = new String[maxContacts];
    private String[] phoneNumbers = new String[maxContacts];
    int count = 0;
    void action() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nВыберите действие");
            int code = scanner.nextInt();
            switch (code) {
                case 1:
                    addContact();
                    break;
                case 2:
                    displayAllContact();
                    break;
                case 3:
                    editContact();
                    break;
                case 4:
                    deleteContact();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Выберите еще раз");
                    break;
            }
        }
    }

    @Override
    public void addContact() {
        System.out.print("Введите номер контакта -");
        String num = scanner.nextLine();
        phoneNumbers[count] = num;
        System.out.print("Введите имя контакта -");
        String name = scanner.nextLine();
        names[count] = name;
        count++;
    }

    @Override
    public void editContact() {
        System.out.print("Выберите контакт - ");
        int index = scanner.nextInt();
        while (index <= 0 || index >= count) {
            System.out.println("Неверный индекс контакта. Введите снова: ");
            index = scanner.nextInt();
        }

        System.out.print("Введите новый номер контакта: ");
        String newNum = scanner.next();
        phoneNumbers[index] = newNum;

        System.out.print("Введите новое имя контакта: ");
        String newName = scanner.next();
        names[index] = newName;

        System.out.println("Контакт обновлен.");
    }

    @Override
    public void deleteContact() {
        System.out.print("Выберите контакт - ");
        int index = scanner.nextInt();
        while (index <= 0 || index >= count) {
            System.out.println("Неверный индекс контакта. Введите снова: ");
            index = scanner.nextInt();
        }
        phoneNumbers[index] = " ";
        names[index] = " ";
        System.out.println("Контакт удален успешно");
    }

    @Override
    public void displayAllContact() {
        for (int i = 0; i < count; i++) {
            String num = phoneNumbers[i];
            String name = names[i];
            System.out.println(i + 1 + ":" + " Имя: " + name + ", номер: " + num);
        }
    }
}