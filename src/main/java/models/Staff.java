package models;

public class Staff extends Person{
    private String role;


    public Staff(int id, String name, int age, double wallet) {
        super(id, name, age, wallet);
    }



    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
