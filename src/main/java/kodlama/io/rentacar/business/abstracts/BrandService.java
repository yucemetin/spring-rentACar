package kodlama.io.rentacar.business.abstracts;

import kodlama.io.rentacar.business.requests.CreateBrandrequest;
import kodlama.io.rentacar.business.requests.UpdateBrandRequest;
import kodlama.io.rentacar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentacar.business.responses.GetByIdBrandResponse;

import java.util.List;

public interface BrandService {
    List<GetAllBrandsResponse> getAll();

    GetByIdBrandResponse getById(int id);

    void add(CreateBrandrequest createBrandrequest);

    void update(UpdateBrandRequest updateBrandRequest);

    void delete(int id);
}
