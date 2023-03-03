package kodlama.io.rentacar.business.concretes;

import kodlama.io.rentacar.business.abstracts.BrandService;
import kodlama.io.rentacar.business.requests.CreateBrandrequest;
import kodlama.io.rentacar.business.requests.UpdateBrandRequest;
import kodlama.io.rentacar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentacar.business.responses.GetByIdBrandResponse;
import kodlama.io.rentacar.business.rules.BrandBusinessRules;
import kodlama.io.rentacar.core.utilities.mappers.ModelMapperService;
import kodlama.io.rentacar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentacar.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;
    private ModelMapperService modelMapperService;
    private BrandBusinessRules brandBusinessRules;

    @Override
    public List<GetAllBrandsResponse> getAll() {
        List<Brand> brands = brandRepository.findAll();
        List<GetAllBrandsResponse> brandsResponses = brands.stream()
                .map(brand -> this.modelMapperService.forResponse()
                        .map(brand, GetAllBrandsResponse.class)).collect(Collectors.toList());
        return brandsResponses;
    }

    @Override
    public GetByIdBrandResponse getById(int id) {
        Brand brand = this.brandRepository.findById(id).orElseThrow();
        return this.modelMapperService.forResponse().map(brand, GetByIdBrandResponse.class);
    }

    @Override
    public void add(CreateBrandrequest createBrandrequest) {
        this.brandBusinessRules.checkIfBrandNameExists(createBrandrequest.getName());
        Brand brand = this.modelMapperService.forRequest().map(createBrandrequest, Brand.class);
        this.brandRepository.save(brand);
    }

    @Override
    public void update(UpdateBrandRequest updateBrandRequest) {
        this.brandBusinessRules.checkIfBrandNameExists(updateBrandRequest.getName());
        Brand brand = this.modelMapperService.forRequest().map(updateBrandRequest, Brand.class);
        this.brandRepository.save(brand);
    }

    @Override
    public void delete(int id) {

        this.brandRepository.deleteById(id);
    }
}
