// Базовый класс Животное
class Animal {
    private static int animalCount = 0;
    protected String name;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public void run(int distance) {
        System.out.println(name + " бежит " + distance + " м.");
    }

    public void swim(int distance) {
        System.out.println(name + " плывет " + distance + " м.");
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}

// Класс Собака
class Dog extends Animal {
    private static int dogCount = 0;
    private final int maxRunDistance = 500;
    private final int maxSwimDistance = 10;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            super.run(distance);
        } else {
            System.out.println(name + " не может пробежать " + distance + " м. (максимум " + maxRunDistance + " м.)");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= maxSwimDistance) {
            super.swim(distance);
        } else {
            System.out.println(name + " не может проплыть " + distance + " м. (максимум " + maxSwimDistance + " м.)");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }
}

// Класс Кот
class Cat extends Animal {
    private static int catCount = 0;
    private final int maxRunDistance = 200;
    private boolean isFull; // сытость
    private boolean hasEaten; // пытался ли кот есть

    public Cat(String name) {
        super(name);
        this.isFull = false;
        this.hasEaten = false;
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            super.run(distance);
        } else {
            System.out.println(name + " не может пробежать " + distance + " м. (максимум " + maxRunDistance + " м.)");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать!");
    }

    public void eat(Bowl bowl, int amount) {
        if (bowl.decreaseFood(amount)) {
            isFull = true;
            hasEaten = true;
            System.out.println(name + " поел из миски и теперь сыт.");
        } else {
            hasEaten = true;
            System.out.println(name + " не смог поесть - в миске недостаточно еды.");
        }
    }

    public boolean isFull() {
        return isFull;
    }

    public boolean hasEaten() {
        return hasEaten;
    }

    public static int getCatCount() {
        return catCount;
    }
}

// Класс Миска
class Bowl {
    private int foodAmount;

    public Bowl(int initialFood) {
        this.foodAmount = Math.max(initialFood, 0); // гарантируем, что не будет отрицательного значения
    }

    public boolean decreaseFood(int amount) {
        if (amount <= 0) return false;
        if (foodAmount >= amount) {
            foodAmount -= amount;
            return true;
        }
        return false;
    }

    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount;
            System.out.println("В миску добавлено " + amount + " еды. Теперь в миске " + foodAmount + " еды.");
        }
    }

    public int getFoodAmount() {
        return foodAmount;
    }
}

public class Animals {
    public static void main(String[] args) {
        // Тестирование животных
        Dog dog = new Dog("Бобик");
        Cat cat = new Cat("Мурзик");

        dog.run(150);
        dog.run(600);
        dog.swim(5);
        dog.swim(15);

        cat.run(100);
        cat.run(250);
        cat.swim(10);

        // Работа с котами и миской
        Bowl bowl = new Bowl(30);
        Cat[] cats = {
                new Cat("Барсик"),
                new Cat("Рыжик"),
                new Cat("Васька"),
                new Cat("Пушок"),
                new Cat("Черныш")
        };

        // Кормим котов
        for (Cat c : cats) {
            c.eat(bowl, 10);
        }

        // Проверяем сытость
        System.out.println("\nСостояние котов:");
        for (Cat c : cats) {
            System.out.println(c.name + ": " + (c.isFull() ? "сыт" : "голоден"));
        }

        // Добавляем еды и кормим снова
        bowl.addFood(30);
        for (Cat c : cats) {
            if (!c.isFull()) {
                c.eat(bowl, 10);
            }
        }

        // Статистика
        System.out.println("\nСтатистика:");
        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Собак: " + Dog.getDogCount());
        System.out.println("Котов: " + Cat.getCatCount());
    }
}