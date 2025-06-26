public class Park {
    String name;

    public Park(String name) {
        this.name = name;
    }

    public static class Attraction {
        String attractionName;
        String workingHours;
        double cost;

        public Attraction(String attractionName, String workingHours, double cost) {
            this.attractionName = attractionName;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        public void printInfo() {
            System.out.println("Attraction Name: " + attractionName);
            System.out.println("Working Hours: " + workingHours);
            System.out.println("Cost: " + cost + " Руб");
        }
    }

    public static void main(String[] args) {
        Park park = new Park("Park");
        Attraction attractionOne = new Attraction("Attraction1", "10:00 - 14:00", 20);
        attractionOne.printInfo();
    }
}