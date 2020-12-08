package ru.homework.java.core;

public class Lesson1Main {
    public static void main(String[] args) {
        catJump();
        System.out.println();
        robotRace();
        System.out.println();
        humanJump();
    }

    public static void catJump(){
        System.out.println("Cats jumping:");
        Cat[] catArray = new Cat[4];
        catArray[0] = new Cat("Murzik", 120, 2.5);
        catArray[1] = new Cat("Barsik", 160, 2);
        catArray[2] = new Cat("Timur", 280, 3);
        catArray[3] = new Cat("Vasya", 100, 3.5);
        Wall[] wallArray = new Wall[5];
        wallArray[0] = new Wall(1);
        wallArray[1] = new Wall(1.5);
        wallArray[2] = new Wall(2.4);
        wallArray[3] = new Wall(2.8);
        wallArray[4] = new Wall(3.5);

        for (int i = 0; i < catArray.length; i++) {
            for (int j = 0; j < wallArray.length; j++) {
                if (!catArray[i].jump(catArray[i].name, catArray[i].heightLimit, wallArray[j].height)) {
                    break;
                }
            }
            System.out.println();
        }
    }

    public static void robotRace(){
        System.out.println("Robots running:");
        Robot[] robotArray = new Robot[3];
        robotArray[0] = new Robot("Larry", 2000, 2.5);
        robotArray[1] = new Robot("Barry", 20000, 5);
        robotArray[2] = new Robot("Gary", 60000, 10);
        Treadmill[] treadmillArray = new Treadmill[3];
        treadmillArray[0] = new Treadmill(1000);
        treadmillArray[1] = new Treadmill(5000);
        treadmillArray[2] = new Treadmill(20000);

        for (int i = 0; i < robotArray.length; i++) {
            for (int j = 0; j < treadmillArray.length; j++) {
                if (!robotArray[i].run(robotArray[i].name, robotArray[i].lengthLimit, treadmillArray[j].distance)) {
                    break;
                }
            }
            System.out.println();
        }
    }

    public static void humanJump() {
        System.out.println("Humans jumping:");
        Human[] humanArray = new Human[4];
        humanArray[0] = new Human("Andrei", 1200, 0.8);
        humanArray[1] = new Human("Misha", 1600, 1);
        humanArray[2] = new Human("Aleksei", 2800, 1.2);
        humanArray[3] = new Human("Natasha", 10000, 1.6);
        Wall[] wallArray = new Wall[3];
        wallArray[0] = new Wall(0.5);
        wallArray[1] = new Wall(1);
        wallArray[2] = new Wall(1.5);

        for (int i = 0; i < humanArray.length; i++) {
            for (int j = 0; j < wallArray.length; j++) {
                if (!humanArray[i].jump(humanArray[i].name, humanArray[i].heightLimit, wallArray[j].height)) {
                    break;
                }
            }
            System.out.println();
        }
    }
}
