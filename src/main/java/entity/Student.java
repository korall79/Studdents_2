package entity;

import java.sql.Date;
import java.util.Objects;

public class Student {

    private int ID;

    private String name;

    private String surname;

    private Group group;

    private Date date;

    public Student() {

    }

    public Student(int ID, String name, String surname, Group group, Date date) {
        this.ID = ID;
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.date = date;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return ID == student.ID && Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && Objects.equals(group, student.group) && Objects.equals(date, student.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, name, surname, group, date);
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", group=" + group +
                ", date=" + date +
                '}';
    }
}
