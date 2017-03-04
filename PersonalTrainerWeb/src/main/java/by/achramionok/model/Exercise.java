package by.achramionok.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Kirill on 04.03.2017.
 */
@Entity
@Table(name = "EXERCISE", schema = "d6nc4cdvp2slen.public")
public class Exercise {
    private int id;
    private String name;
    private String description;

    @Id
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
