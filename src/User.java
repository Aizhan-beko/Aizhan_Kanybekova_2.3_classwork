public class User {
    private String name;
    private int age;

    public User() {

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) throws IllegalNameLengthException{
        if(name.length() > 20){
            throw new IllegalNameLengthException("Length of User name should not be more than 20 symbols");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if( age <= 0 || age > 100){
            throw new IllegalAgeException("Age should be between 1 and 100!!!");
        }
        this.age = age;
    }
}
