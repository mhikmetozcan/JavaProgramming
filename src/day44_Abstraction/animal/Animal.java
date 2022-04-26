package day44_Abstraction.animal;

public abstract class Animal {

    private String name;
    private final String breed;
    private final char gender;
    private int age;
    private String size;
    private final String color;

    public final static boolean doesBreathe = true;

    public String getName(){
        return this.name;
    }
    public String getBreed(){
        return this.breed;
    }
    public String getColor(){
        return this.color;
    }
    public String getSize(){
        return this.size;
    }
    public int getAge(){
        if (age < 0)
            throw new RuntimeException("Age can not be less than 0: " + age);
        return this.age;
    }
    public char getGender(){
        return this.gender;
    }

    public void setName(String name){
        if(name.isEmpty() || name.isBlank()){
            throw new RuntimeException("Name can not be left blank");
        }
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setSize(String size){
        this.size = size;
    }

    public Animal(String name, String breed, char gender, int age, String size, String color) {
        setName(name);
        this.breed = breed;
        if(!(gender == 'M' || gender == 'F')){
            throw new RuntimeException("Invalid gender: " + gender);
        }
        this.gender = gender;
        setAge(age);
        setSize(size);
        this.color = color;
    }

    public final void drink(){
        System.out.println(name + " is drinking water");
    }

    public abstract void eat();

    @Override
    public String toString() {
        return  getClass().getSimpleName() +
                "{name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
