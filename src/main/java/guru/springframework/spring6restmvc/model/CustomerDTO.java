package guru.springframework.spring6restmvc.model;

<<<<<<< Updated upstream
=======
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
>>>>>>> Stashed changes
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

<<<<<<< Updated upstream
/**
 * Created by jt, Spring Framework Guru.
 */
@Data
@Builder
public class CustomerDTO {
    private UUID id;
    private String name;
    private Integer version;
    private LocalDateTime createdDate;
    private LocalDateTime updateDate;
=======
@Builder
@Data
public class CustomerDTO {
    private UUID id;

    @NotBlank
    @NotNull
    private String name;

    @NotBlank
    @NotNull
    private String email;

    private Integer version;
    private LocalDateTime createdDate;
    private LocalDateTime lastModifiedDate;
>>>>>>> Stashed changes
}
