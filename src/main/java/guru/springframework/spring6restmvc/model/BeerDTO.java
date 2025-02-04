package guru.springframework.spring6restmvc.model;

<<<<<<< Updated upstream
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;
=======
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
>>>>>>> Stashed changes

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

<<<<<<< Updated upstream
/**
 * Created by jt, Spring Framework Guru.
 */
@Builder
@Data
=======
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
>>>>>>> Stashed changes
public class BeerDTO {
    private UUID id;
    private Integer version;

    @NotBlank
    @NotNull
<<<<<<< Updated upstream
=======
    @Size(max = 50)
    @Column(length = 50)
>>>>>>> Stashed changes
    private String beerName;

    @NotNull
    private BeerStyle beerStyle;

<<<<<<< Updated upstream
    @NotNull
    @NotBlank
    private String upc;
    private Integer quantityOnHand;

    @NotNull
    private BigDecimal price;
    private LocalDateTime createdDate;
    private LocalDateTime updateDate;

=======
    @NotBlank
    @NotNull
    @Size(max = 255)
    private String upc;

    private Integer quantityOnHand;

    @NotNull
    @Positive
    private BigDecimal price;

    private LocalDateTime createdDate;
    private LocalDateTime updateDate;
>>>>>>> Stashed changes
}
