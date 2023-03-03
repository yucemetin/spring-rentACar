package kodlama.io.rentacar.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetByIdCarResponse {

    private int id;

    @NotNull
    @NotBlank
    private String plate;

    @NotBlank
    @NotNull
    private double dailyPrice;

    @NotBlank
    @NotNull
    private int modelYear;

    @NotBlank
    @NotNull
    private int state;

    @NotBlank
    @NotNull
    private String brandName;

    @NotBlank
    @NotNull
    private String modelName;
}
