import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Практическое задание № 1.8, РИБО-03-22, Тувыкин Михаил Денисович, Вариант №4");
        List<Person> passport = new ArrayList<>();
        passport.add(new Person("Антонов Андрей Антонович", 445566, "сантехник", false));
        passport.add(new Person("Иванов Иван Иванович", 112134, "директор", true));
        passport.add(new Person("Яковлева Юлия Аристарховна", 306306, "секретарь", false));
        passport.add(new Person("Шельпук Михаил Игоревич", 789123, "сетевой инженер", true));
        passport.add(new Person("Ситчихин Павел Евгеньевич", 691354, "младший аналитик", false));

        Collections.sort(passport, Comparator.comparing(Person::getFio));
        for (Person str : passport) {
            System.out.println(str.getFio() + " " + str.getPropusk() + " " + str.getDolzn() + " " + str.isDop());
        }
        System.out.println("\n");
        Collections.sort(passport, Comparator.comparing(Person::getPropusk));
        for (Person str : passport) {
            System.out.println(str.getFio() + " " + str.getPropusk() + " " + str.getDolzn() + " " + str.isDop());
        }
        Scanner scanner = new Scanner(System.in);
        int flag = -1;
        System.out.println("Добавить человека в список или вывести имеющийся (1 - для добавления, 2 - для вывода): ");
        if (scanner.hasNextInt()) {
            flag = scanner.nextInt();
            scanner.nextLine();
        } else {
            scanner.nextLine();
        }
        while (flag != 2) {
            String fio = "";
            while (fio.isBlank()) {
                System.out.println("Введите ФИО: ");
                fio = scanner.nextLine();
            }
            int propusk = 0;
            while (propusk <= 99999 || propusk >= 1000000) {
                System.out.println("Введите Номер пропуска(6 цифр): ");
                if (scanner.hasNextInt()) {
                    propusk = scanner.nextInt();
                    scanner.nextLine();
                } else {
                    scanner.nextLine();
                }
            }
            String dolzn = "";
            while (dolzn.isBlank()) {
                System.out.println("Введите Должность: ");
                dolzn = scanner.nextLine();
            }

            System.out.println("Введите Уровень допуска(true/false): ");
            while (!scanner.hasNextBoolean()) {
                System.out.println("Введите Уровень допуска(true/false): ");
                scanner.nextLine();
            }
            boolean dop = scanner.nextBoolean();
            scanner.nextLine();

            Person newPerson = new Person(fio, propusk, dolzn, dop);
            for (Person person : passport) {
                if (person.getPropusk() == newPerson.getPropusk()) {
                    passport.remove(person);
                    break;
                }
            }
            passport.add(newPerson);

            Collections.sort(passport, Comparator.comparing(Person::getFio));
            for (Person str : passport) {
                System.out.println(str.getFio() + " " + str.getPropusk() + " " + str.getDolzn() + " " + str.isDop());
            }
            System.out.println("\n");
            Collections.sort(passport, Comparator.comparing(Person::getPropusk));
            for (Person str : passport) {
                System.out.println(str.getFio() + " " + str.getPropusk() + " " + str.getDolzn() + " " + str.isDop());
            }

            flag = -1;
            while (flag < 1 || flag > 2) {
                System.out.println("Добавить человека в список или вывести имеющийся (1 - для добавления, 2 - для вывода): ");
                if (scanner.hasNextInt()) {
                    flag = scanner.nextInt();
                    scanner.nextLine();
                } else {
                    scanner.nextLine();
                }
            }
        }
    }
}
