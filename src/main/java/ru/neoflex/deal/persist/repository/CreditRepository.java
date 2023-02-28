package ru.neoflex.deal.persist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.neoflex.deal.persist.model.Credit;

@Repository
public interface CreditRepository extends JpaRepository<Credit, Long> {

}
