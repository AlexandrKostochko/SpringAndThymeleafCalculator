package tms.security.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Operation {

    @Pattern(regexp = "\\d+([.]\\d+)?", message = "only numbers and fractional numbers can be entered through .")
    private String firstNum;

    @Pattern(regexp = "\\d+([.]\\d+)?", message = "only numbers and fractional numbers can be entered through .")
    private String secondNum;

    @Pattern(regexp = "[A-z]{3}", message = "the name of the operation must be shortened to 3 letters")
    private String operation;

    private double result;
}
