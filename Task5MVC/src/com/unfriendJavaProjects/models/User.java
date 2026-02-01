package com.unfriendJavaProjects.models;

import com.unfriendJavaProjects.specialAnnotation.ValidateConfirmPassword;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ValidateConfirmPassword(
        field = "password",
        fieldMatch = "confirmPassword",
        message = "Passwords do not match!"
)
public class User {

    @NotNull(message = "firstname can not be null")
    private String firstname;

    @NotNull(message = "lastname can not be null")
    private String lastname;

    @Email(message = "Email should be valid")
    private String email;

    @NotNull(message = "Please select a date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;

    @NotBlank(message = "Please enter your city")
    private String city;

    @Pattern(regexp = "^[a-zA-Z0-9]{6,10}$")
    private String password;

    private String confirmPassword;
}