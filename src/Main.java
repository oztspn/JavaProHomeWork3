public class Main {
    public static void main(String[] args) {
        //0
        AreaComputable[] shapesAreas = {
                new Circle(5.0),
                new Triangle(4.0, 3.0),
                new Square(1),
                new Circle(3.0),
                new Triangle(6.0, 2.5)
        };
        double totalArea = calculateTotalArea(shapesAreas);
        System.out.println(totalArea);

        //1-9
        Participant[] participants = {
                new Person("Billy", 400, 1),
                new Cat("Fluffy", 200, 3),
                new Robot("Fred", 5000, 0)
        };


        Obstacle[] obstacles = {
                new Treadmill(10),
                new Wall(1),
                new Treadmill(100),
                new Wall(2),
                new Treadmill(4500),
                new Wall(5)
        };

        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                obstacle.overcome(participant);
            }
        }
    }

    public static double calculateTotalArea(AreaComputable[] shapesAreas) {
        double totalArea = 0;
        for (AreaComputable shapeArea : shapesAreas) {
            totalArea += shapeArea.calculateArea();
        }
        return totalArea;
    }
}