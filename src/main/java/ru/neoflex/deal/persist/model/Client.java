package ru.neoflex.deal.persist.model;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import ru.neoflex.deal.model.EmploymentDTO;
import ru.neoflex.deal.model.PassportInfo;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "client")
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
@SequenceGenerator(name = "clientSeqGenerator", sequenceName = "client_id_seq", allocationSize = 1)
@Data
@Builder
@NoArgsConstructor
@Accessors(chain = true)
public class Client {
    @Id
    @Column(name = "client_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "clientSeqGenerator")
    private Long clientId;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Column(name = "email")
    private String email;

    @Column(name = "gender")
    private String gender;

    @Column(name = "maritalStatus")
    private String maritalStatus;

    @Column(name = "dependentAmount")
    private Integer dependentAmount;

    @Column(name = "passport")
    @Type(type = "jsonb")
    private PassportInfo passport;

    @Column(name = "employment")
    @Type(type = "jsonb")
    private EmploymentDTO employment;

    @Column(name = "account")
    private String account;
}
