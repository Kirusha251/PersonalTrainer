package by.achramionok.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Kirill on 01.03.2017.
 */
@Entity
@Table(name = "user")//,catalog = "d6nc4cdvp2slen", schema = "public")
public class User  implements Serializable {
    private int id;
    private String name;
    private int role;
    private int age;
    private String email;
    private String password;
    private String sex;
    private Date birthday;
    private Date registeredAt;

    public User() {

    }

    @Id
    @GeneratedValue
    @Column(name = "id",nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    @Basic
    @Column(name = "name", length = 50)
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Basic
    @Column(name = "role")
    public int getRole(){
        return role;
    }

    public void setRole(int role){
        this.role = role;
    }

    @Basic
    @Column(name = "age")
    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    @Basic
    @Column(name = "email", length = 50)
    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    @Basic
    @Column(name = "password", length = 50)
    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    @Basic
    @Column(name = "sex", length = 20)
    public String getSex(){
        return sex;
    }

    public void setSex(String sex){
        this.sex = sex;
    }

    @Basic
    @Column(name = "birthday")
    public Date getBirthday(){
        return birthday;
    }

    public void setBirthday(Date birthday){
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "registered_at")
    public Date getRegisteredAt(){
        return registeredAt;
    }

    public void setRegisteredAt(Date registeredAt){
        this.registeredAt = registeredAt;
    }
}
