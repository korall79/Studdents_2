package entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Term {


    private int ID;
    private String name;

    private String duretion;

    private List<Discipline>  disciplines = new ArrayList<>();

    public Term() {
    }

    public Term(int ID, String name, String duretion, List<Discipline> disciplines) {
        this.ID = ID;
        this.name = name;
        this.duretion = duretion;
        this.disciplines = disciplines;
    }

    public void addDiscipline(Discipline discipline){
        disciplines.add(discipline);

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

    public String getDuretion() {
        return duretion;
    }

    public void setDuretion(String duretion) {
        this.duretion = duretion;
    }

    public List<Discipline> getDisciplines() {
        return disciplines;
    }

    public void setDisciplines(List<Discipline> disciplines) {
        this.disciplines = disciplines;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Term term = (Term) o;
        return ID == term.ID && Objects.equals(name, term.name) && Objects.equals(duretion, term.duretion) && Objects.equals(disciplines, term.disciplines);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, name, duretion, disciplines);
    }

    @Override
    public String toString() {
        return "Term{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", duretion='" + duretion + '\'' +
                ", disciplines=" + disciplines +
                '}';
    }
}
