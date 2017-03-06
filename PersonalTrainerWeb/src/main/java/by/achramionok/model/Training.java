package by.achramionok.model;

import javax.persistence.*;

/**
 * Created by Kirill on 04.03.2017.
 */
@Entity
@Table(name = "TRAINING")
public class Training {
    private int id;
    private int userId;

    public Training() {
    }

    @Id
    @GeneratedValue
    @Column(name = "ID", nullable = false)
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    @Column(name = "USER_ID")
    public int getUserId(){
        return userId;
    }

    public void setUserId(int userId){
        this.userId = userId;
    }
}

