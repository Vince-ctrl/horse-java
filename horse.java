/**
 * horse
 */
public class horse {
    String name;
    String[] names;
    int numberofNames = 0;
    int age = 0;
    public horse(String horseName, int year){
        name = horseName;
        age = 2024 - year;
    }
    public void changeAge(int newAge){
        age = newAge;
    }
    public void changeName(String newName){
        names[numberofNames] = name;
        numberofNames++;
        name = newName;
    }
    public String toString(){
        return name + "," + age;
    }
    public static void main(String[] args) {
        horse horse1 = new horse("Horsie", 2000);
        System.out.println(horse1);
        horse horse2 = new horse("BOBBY", 2012);
        System.out.println(horse2);
        horse horse3 = new horse("Daffodil", 2008);
        System.out.println(horse3);
    }
}