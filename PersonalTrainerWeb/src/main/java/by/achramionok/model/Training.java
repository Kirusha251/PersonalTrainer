package by.achramionok.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Kirill on 04.03.2017.
 */
@Entity
@Table(name = "TRAINING",schema = "d6nc4cdvp2slen.public")
public class Training {
    private int id;
    private int userId;

    @Id
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

