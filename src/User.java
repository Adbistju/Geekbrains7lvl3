public class User {
    private String name;
    private String nameT;
    private int age;

    public User(String name, String fotyName, int age) {
        this.name = name;
        this.nameT = fotyName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFotyName() {
        return nameT;
    }

    public void setFotyName(String fotyName) {
        this.nameT = fotyName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", fotyName='" + nameT + '\'' +
                ", age=" + age +
                '}';
    }
}