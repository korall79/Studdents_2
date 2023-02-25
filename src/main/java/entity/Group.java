package entity;

import java.util.Objects;

public class Group {

    private int iD;

    private String name;

    public Group() {
    }

    public Group(int iD, String name) {
        this.iD = iD;
        this.name = name;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
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
        Group group = (Group) o;
        return iD == group.iD && Objects.equals(name, group.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iD, name);
    }

    @Override
    public String toString() {
        return "Group{" +
                "iD=" + iD +
                ", name='" + name + '\'' +
                '}';
    }
}
