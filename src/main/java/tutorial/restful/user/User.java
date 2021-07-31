package tutorial.restful.user;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@JsonFilter("UserInfo")
public class User {
    private Integer id;

    @Size(min = 2, message = "Min length of name parameter is 2")
    private String name;
    @Past
    private LocalDateTime joinDate;

//    @JsonIgnore
    private String password;
//    @JsonIgnore
    private String ssn;
}
