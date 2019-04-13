package kg.programming.languages.model;

import javax.persistence.*;

@Entity
@Table(name="language")
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer numOfStudents;

    public Language() {
    }

    public Language(String name, Integer numOfStudents) {
        this.name = name;
        this.numOfStudents = numOfStudents;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(Integer numOfStudents) {
        this.numOfStudents = numOfStudents;
    }
}
