package by.achramionok.model;



import javax.persistence.*;

/**
 * Created by Kirill on 04.03.2017.
 */
@Entity
@Table(name = "exercise", catalog = "d6nc4cdvp2slen", schema = "public")
public class Exercise {
    private int id;
    private String name;
    private String description;

    public Exercise() {
    }

    @Id
    @GeneratedValue
    @Column(name = "id",nullable = false)
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    @Column(name = "name",length = 50)
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Column(name = "description",length = 300)
    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }
}
