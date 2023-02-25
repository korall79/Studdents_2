package entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class user {

    private int ID;

    private String login;

    private String password;

    private List<Role> roles =  new  ArrayList<>();

    public user() {
    }

    public user(int ID, String login, String password, List<Role> roles) {
        this.ID = ID;
        this.login = login;
        this.password = password;
        this.roles = roles;
    }

    public void addROle(Role role){
        roles.add(role);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        user user = (user) o;
        return ID == user.ID && Objects.equals(login, user.login) && Objects.equals(password, user.password) && Objects.equals(roles, user.roles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, login, password, roles);
    }

    @Override
    public String toString() {
        return "user{" +
                "ID=" + ID +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", roles=" + roles +
                '}';
    }
}
