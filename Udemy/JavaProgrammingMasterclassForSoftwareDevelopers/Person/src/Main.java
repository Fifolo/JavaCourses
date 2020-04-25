public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(20);
        person.setFirstName("Filip");
        person.setLastName("Starczewski");
        System.out.println("Full name : "+person.getFullName());
        System.out.println("He is "+person.getAge()+" years old");
        System.out.println("He is a teeneger = "+person.isTeen());
    }
}
