public class App {
    public static void main(String[] args) throws Exception {
        var age = 29;
        var name = "Daniel";
        var lastName = "Arias";
        var total = name + lastName + age;
        System.out.println("Hello, World! my name is "+name+ " "+lastName+" and I am "+age+" years old.");
        System.out.println(total);
        System.out.printf("Hello, World! my name is %s %s and I am %d years old.",name,lastName,age);
    }
}
