package by.achramionok.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by Kirill on 04.03.2017.
 */
@Entity
@Table(name = "training", catalog = "d6nc4cdvp2slen", schema = "public")
public class Training implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "user_id")
    private int userId;

    @OneToMany(mappedBy = "training")
    private Set<TrainingSet> trainingSets;

    @OneToMany
    @JoinTable(
        name="trainingSet",
        joinColumns= @JoinColumn(name="training_id"),
        inverseJoinColumns=
        @JoinColumn(name="exercise_id")
    )
    private Set<Exercise> exercises;

    public Training() {
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }


    public int getUserId(){
        return userId;
    }

    public void setUserId(int userId){
        this.userId = userId;
    }

    public Set<TrainingSet> getTrainingSets() {
        return trainingSets;
    }

    public void setTrainingSets(Set<TrainingSet> trainingSets) {
        this.trainingSets = trainingSets;
    }

    public Set<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(Set<Exercise> exercises) {
        this.exercises = exercises;
    }
}

