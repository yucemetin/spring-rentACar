package kodlama.io.rentacar.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateCarRequest {
    private int id;

    @NotNull
    @NotBlank
    private String plate;

    @NotNull
    @NotBlank
    private double dailyPrice;

    @NotNull
    @NotBlank
    private int modelYear;

    @NotNull
    @NotBlank
    private int state;

    @NotNull
    @NotBlank
    private int modelId;
}
