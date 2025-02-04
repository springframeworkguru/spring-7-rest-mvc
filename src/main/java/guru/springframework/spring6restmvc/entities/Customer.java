package guru.springframework.spring6restmvc.entities;

import jakarta.persistence.*;
<<<<<<< Updated upstream
=======
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
>>>>>>> Stashed changes
import lombok.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.annotations.UuidGenerator;
import org.hibernate.type.SqlTypes;

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
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
<<<<<<< Updated upstream
    @Id
    @GeneratedValue(generator = "UUID")
    @UuidGenerator
    @Column(length = 36, columnDefinition = "varchar", updatable = false, nullable = false)
    @JdbcTypeCode(SqlTypes.CHAR)
    private UUID id;
    private String name;

=======

    @Id
    @GeneratedValue(generator = "UUID")
    @UuidGenerator
    @Column(length = 36, columnDefinition = "varchar(36)", updatable = false, nullable = false)
    @JdbcTypeCode(SqlTypes.CHAR)
    private UUID id;

    @NotBlank
    @NotNull
    private String name;

    @NotBlank
    @NotNull
>>>>>>> Stashed changes
    @Column(length = 255)
    private String email;

    @Version
    private Integer version;
    private LocalDateTime createdDate;
    private LocalDateTime updateDate;
<<<<<<< Updated upstream
}
=======
}
>>>>>>> Stashed changes
