package by.achramionok.model;



import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by Kirill on 04.03.2017.
 */
@Entity
@Table(name = "exercise", catalog = "d6nc4cdvp2slen", schema = "public")
public class Exercise implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "id",nullable = false)
    private int id;

    @Column(name = "name",length = 50)
    private String name;

    @Column(name = "description",length = 300)
    private String description;

    @OneToMany(mappedBy = "exercise")
    private Set<TrainingSet> exercises;

    @ManyToOne
    @JoinTable(
            name="trainingSet",
            joinColumns=
            @JoinColumn(name="exercise_id", referencedColumnName="id"),
            inverseJoinColumns=
            @JoinColumn(name="training_id", referencedColumnName="id")
    )
    @JsonIgnore
    private Training training;

    public Exercise() {
    }


    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }


    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public Set<TrainingSet> getExercises() {
        return exercises;
    }

    public void setExercises(Set<TrainingSet> exercises) {
        this.exercises = exercises;
    }

    public Training getTraining() {
        return training;
    }

    public void setTraining(Training training) {
        this.training = training;
    }

}
