package ru.neoflex.deal.persist.model;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import ru.neoflex.deal.model.ApplicationStatus;
import ru.neoflex.deal.model.ApplicationStatusHistoryDTO;
import ru.neoflex.deal.model.LoanOfferDTO;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "application")
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
@SequenceGenerator(name = "applicationSeqGenerator", sequenceName = "application_id_seq", allocationSize = 1)
@Data
@Builder
@NoArgsConstructor
@Accessors(chain = true)
public class Application {
    @Id
    @Column(name = "application_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "applicationSeqGenerator")
    private Long applicationId;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "credit_id")
    private Credit credit;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private ApplicationStatus status;

    @Column(name = "creation_date")
    private Date creationDate;

    @Column(name = "sign_date")
    private Date signDate;

    @Column(name = "applied_offer")
    @Type(type = "jsonb")
    private LoanOfferDTO appliedOffer;

    @Column(name = "ses_code")
    private Integer sesCode;

    @Column(name = "status_history")
    @Type(type = "jsonb")
    private List<ApplicationStatusHistoryDTO> statusHistory;

}
