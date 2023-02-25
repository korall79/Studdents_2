package entity;

import java.util.Objects;

public class Role {

    private int ID;

    private String name;

    public Role() {
    }

    public Role(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return ID == role.ID && Objects.equals(name, role.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, name);
    }

    @Override
    public String
    toString() {
        return "Role{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                '}';
    }
}
