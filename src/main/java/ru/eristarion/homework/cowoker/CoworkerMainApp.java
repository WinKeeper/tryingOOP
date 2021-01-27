package ru.eristarion.homework.cowoker;

public class CoworkerMainApp {

    public static void main(String[] args) {
        Coworker worker1 = new Coworker("Omaewa", "Mou", "Shindeiru", "Начальник", "onepunch@gmail.com", 100000, 10);
        System.out.println("Полная информация по сотруднику:");
        worker1.printInfo();
        System.out.println();
        System.out.println("--------");

//        Illness ageIll = new Illness(true);

        Coworker workersArr[] = new Coworker[5];
        workersArr[0] = new Coworker("Gr8", "Boy", "Jack", "Dog", "", 0, 55);
        workersArr[1] = new Coworker("Best", "Friend", "", "Friend", "", 10, 3);
        workersArr[2] = new Coworker("Boys", "Next", "Door", "CappaPride", "boysnextdoor", 60,30);
        workersArr[3] = new Coworker("Hercules", "", "", "SonOfZeus", "", 0, 1000);
        workersArr[4] = new Coworker("Nobody", "Nowhere", "", "Somewhere", "empty@gmail.com", 0, 15);


        for (int i = 0; i < workersArr.length; i++) {
            if (workersArr[i].getAge() >= 40) {
                System.out.println("Сотрудник " + workersArr[i].getName() + " подходит по возрасту.");
//            } else if (workersArr[i].getAge() >= 50) {
            } else {
                System.out.println("Сотрудник " + workersArr[i].getName() + " не подходит по возрасту.");
            }
        }
    }


}
