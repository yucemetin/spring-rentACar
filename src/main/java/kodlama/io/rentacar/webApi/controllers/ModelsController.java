package kodlama.io.rentacar.webApi.controllers;

import kodlama.io.rentacar.business.abstracts.ModelService;
import kodlama.io.rentacar.business.requests.CreateModelRequest;
import kodlama.io.rentacar.business.requests.UpdateModelRequest;
import kodlama.io.rentacar.business.responses.GetAllModelsResponse;
import kodlama.io.rentacar.business.responses.GetByIdModelResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/models")
@AllArgsConstructor
public class ModelsController {
    private ModelService modelService;

    @GetMapping
    List<GetAllModelsResponse> getAll() {
        return modelService.getAll();
    }

    @GetMapping("/{id}")
    GetByIdModelResponse getById(@PathVariable int id) {
        return this.modelService.getById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void add(@RequestBody CreateModelRequest createModelRequest) {
        this.modelService.add(createModelRequest);
    }

    @PutMapping
    public void update(@RequestBody UpdateModelRequest updateModelRequest) {
        this.modelService.update(updateModelRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        this.modelService.delete(id);
    }


}
