package by.achramionok.model;

import javax.persistence.*;

/**
 * Created by Kirill on 04.03.2017.
 */
@Entity
@Table(name = "training", catalog = "d6nc4cdvp2slen", schema = "public")
public class Training {
    private int id;
    private int userId;

    public Training() {
    }

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    @Column(name = "user_id")
    public int getUserId(){
        return userId;
    }

    public void setUserId(int userId){
        this.userId = userId;
    }
}

