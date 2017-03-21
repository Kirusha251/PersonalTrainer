package by.achramionok.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Kirill on 01.03.2017.
 */
@Entity
@Table(name = "users", catalog = "d6nc4cdvp2slen", schema = "public")
public class User implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "role")
    private int role;

    @Column(name = "age")
    private int age;

    @Column(name = "email", length = 50)
    private String email;

    @Column(name = "password", length = 50)
    private String password;

    @Column(name = "sex", length = 20)
    private String sex;

    @Column(name = "birthday")
    private Date birthday;

    @Column(name = "registered_at")
    private Date registeredAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getRegisteredAt() {
        return registeredAt;
    }

    public void setRegisteredAt(Date registeredAt) {
        this.registeredAt = registeredAt;
    }
}
