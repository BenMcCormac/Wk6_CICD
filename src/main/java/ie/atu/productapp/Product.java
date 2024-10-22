package ie.atu.productapp;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product
{
    @PositiveOrZero(message = "ID must be positive")
    @NotNull(message = "Id can't be null")
    private int id;

    @NotBlank(message = "Name can't be blank")
    private String name;

    @PositiveOrZero(message = "Price must be positive")
    @NotNull(message = "Price can't be Null")
    private float price;
}
