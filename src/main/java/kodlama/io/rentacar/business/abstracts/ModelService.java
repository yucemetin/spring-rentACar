package kodlama.io.rentacar.business.abstracts;

import kodlama.io.rentacar.business.requests.CreateModelRequest;
import kodlama.io.rentacar.business.requests.UpdateModelRequest;
import kodlama.io.rentacar.business.responses.GetAllModelsResponse;
import kodlama.io.rentacar.business.responses.GetByIdModelResponse;

import java.util.List;

public interface ModelService {
    List<GetAllModelsResponse> getAll();

    GetByIdModelResponse getById(int id);

    void add(CreateModelRequest createModelRequest);

    void update(UpdateModelRequest updateModelRequest);

    void delete(int id);
}
