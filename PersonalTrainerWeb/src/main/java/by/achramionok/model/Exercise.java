package by.achramionok.model;



import javax.persistence.*;

/**
 * Created by Kirill on 04.03.2017.
 */
@Entity
@Table(name = "EXERCISE")
public class Exercise {
    private int id;
    private String name;
    private String description;

    public Exercise() {
    }

    @Id
    @GeneratedValue
    @Column(name = "ID",nullable = false)
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    @Column(name = "NAME",length = 50)
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Column(name = "DESCRIPTION",length = 300)
    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }
}
