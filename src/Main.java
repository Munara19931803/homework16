public class Main {
    public static void main(String[] args) {


        Animal[] animals = {new Shark("Кармен", 1), new Turtle("Кейси", 2), new Eagle("Ниндзья", 1)};
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Shark) {
                ((Shark) animals[i]).attack();
            } else if (animals[i] instanceof Turtle) {
                ((Turtle) animals[i]).swim();
            } else if (animals[i] instanceof Eagle) {
                ((Eagle) animals[i]).fly();
            }
        System.out.println(animals[i]);
        }
    Shark shark = new Shark("Кармен", 1);
    Shark shark1 = new Shark("Кaрмен1", 2);
    Shark[] sharks = new Shark[]{shark, shark1};

        for (int i = 0; i < sharks.length; i++) {
            System.out.println(sharks[i]);
            sharks[i].attack();
        }

    Turtle turtle = new Turtle("Кейси", 1);
    Turtle turtle1 = new Turtle("Кейси1", 2);
    Turtle[] turtles = new Turtle[]{turtle, turtle1};

        for (int i = 0; i < turtles.length; i++) {
            System.out.println(turtles[i]);
            turtles[i].swim();
        }
    Eagle eagle = new Eagle("Ниндзья", 6);
    Eagle eagle1 = new Eagle("Ниндзья1", 4);
    Eagle[] eagles = new Eagle[]{eagle, eagle1};
        for (int i = 0; i < eagles.length; i++) {
            System.out.println(eagles[i]);
            eagles[i].fly();
        }
    }


}