package tutorial.restful.user;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@JsonIgnoreProperties(value = {"password", "ssn"})
//@JsonFilter("UserInfo")
@ApiModel(description = "User Detail Info Domain instance")
public class User {
    private Integer id;

    @Size(min = 2, message = "Min length of name parameter is 2")
    @ApiModelProperty(notes = "Enter username")
    private String name;
    @Past
    @ApiModelProperty(notes = "Enter join date")
    private LocalDateTime joinDate;

//    @JsonIgnore
    @ApiModelProperty(notes = "Enter password")
    private String password;
//    @JsonIgnore
    @ApiModelProperty(notes = "Enter ssn")
    private String ssn;

}
