public class Cat {
    private String name;
    private String color;

    //defining accessors
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    //defining mutators
    public void setName(String name) {
        this.name = name;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setName("James");
        cat1.setColor("red");

        Cat cat2 = new Cat();
        cat2.setName("John");
        cat2.setColor("blue");

        System.out.println(cat1.getName());
        System.out.println(cat1.getColor());

        System.out.println(cat2.getName());
        System.out.println(cat2.getColor());
    }
}
