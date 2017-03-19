package by.achramionok.soap;

import by.achramionok.model.Training;
import by.achramionok.model.TrainingSet;
import by.achramionok.repository.TrainingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import tr.kir.akhram.*;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by pavel.rubatski
 * pavel.rubatski@gmail.com
 * on 15.03.2017.
 */
@Endpoint
public class TrainingEndpoint {

    private static final String NAMESPACE_URI = "http://akhram.kir.tr";

    @Autowired
    private TrainingRepository trainingRepository;


    public TrainingEndpoint(TrainingRepository trainingRepository) {
        this.trainingRepository = trainingRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
    @ResponsePayload
    public GetTrainingResponse getTrainingResponse(@RequestPayload GetTrainingRequest request) {
        GetTrainingResponse response = new GetTrainingResponse();
        List<Training> trainingsList = trainingRepository.findAll();
        for(Training tr: trainingsList){
            TrainingSoap trainingSoap = new TrainingSoap();
            trainingSoap.setId(tr.getId());
            for(TrainingSet ts :tr.getTrainingSets()){
                TrainingSetSoap trainingSetSoap = new TrainingSetSoap();
                ExerciseSoap exerciseSoap = new ExerciseSoap();
                exerciseSoap.setId(ts.getExercise().getId());
                exerciseSoap.setDescription(ts.getExercise().getDescription());
                exerciseSoap.setName(ts.getExercise().getName());
                trainingSetSoap.setExcersice(exerciseSoap);
                trainingSetSoap.setNumber(ts.getNumber());
                trainingSetSoap.setWeight(BigDecimal.valueOf(ts.getWeight()));
                trainingSoap.getTrainingSet().add(trainingSetSoap);
            }
            response.getTraining().add(trainingSoap);
        }

        return response;
    }
}
