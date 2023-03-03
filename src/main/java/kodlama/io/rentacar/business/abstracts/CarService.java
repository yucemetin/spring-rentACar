package kodlama.io.rentacar.business.abstracts;

import kodlama.io.rentacar.business.requests.CreateCarRequest;
import kodlama.io.rentacar.business.requests.UpdateCarRequest;
import kodlama.io.rentacar.business.responses.GetAllCarsResponse;
import kodlama.io.rentacar.business.responses.GetByIdCarResponse;

import java.util.List;

public interface CarService {
    List<GetAllCarsResponse> getAll();

    GetByIdCarResponse getById(int id);

    void add(CreateCarRequest createCarRequest);

    void update(UpdateCarRequest updateCarRequest);

    void delete(int id);
}
