package guru.springframework.spring6restmvc.entities;

import guru.springframework.spring6restmvc.model.BeerStyle;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.annotations.UuidGenerator;
import org.hibernate.type.SqlTypes;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

<<<<<<< Updated upstream
/**
 * Created by jt, Spring Framework Guru.
 */
=======
>>>>>>> Stashed changes
@Getter
@Setter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Beer {

    @Id
    @GeneratedValue(generator = "UUID")
    @UuidGenerator
<<<<<<< Updated upstream
    @Column(length = 36, columnDefinition = "varchar", updatable = false, nullable = false)
=======
    @Column(length = 36, columnDefinition = "varchar(36)", updatable = false, nullable = false)
>>>>>>> Stashed changes
    @JdbcTypeCode(SqlTypes.CHAR)
    private UUID id;

    @Version
    private Integer version;

    @NotNull
    @NotBlank
    @Size(max = 50)
    @Column(length = 50)
    private String beerName;

    @NotNull
<<<<<<< Updated upstream
    @JdbcTypeCode(value = SqlTypes.SMALLINT)
=======
>>>>>>> Stashed changes
    private BeerStyle beerStyle;

    @NotNull
    @NotBlank
    @Size(max = 255)
    private String upc;
<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes
    private Integer quantityOnHand;

    @NotNull
    private BigDecimal price;
<<<<<<< Updated upstream
    private LocalDateTime createdDate;
    private LocalDateTime updateDate;
}
=======

    private LocalDateTime createdDate;
    private LocalDateTime updateDate;
}
>>>>>>> Stashed changes
