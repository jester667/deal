package ru.neoflex.deal.persist.model;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import ru.neoflex.deal.model.PaymentScheduleElement;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "credit")
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
@SequenceGenerator(name = "creditSeqGenerator", sequenceName = "credit_id_seq", allocationSize = 1)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Credit {
    @Id
    @Column(name = "credit_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "creditSeqGenerator")
    private Long creditId;

    @Column(name = "amount")
    private BigDecimal amount;

    @Column(name = "term")
    private Integer term;

    @Column(name = "monthly_payment")
    private BigDecimal monthlyPayment;

    @Column(name = "rate")
    private BigDecimal rate;

    @Column(name = "psk")
    private BigDecimal psk;

    @Column
    @Type(type = "jsonb")
    private List<PaymentScheduleElement> paymentSchedule;

    @Column(name = "insurance_enable")
    private Boolean insuranceEnable;

    @Column(name = "salary_client")
    private Boolean salaryClient;

    @Column(name = "credit_status")
    @Enumerated(EnumType.STRING)
    private CreditStatus creditStatus;
}
