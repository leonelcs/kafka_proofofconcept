package br.com.kafka.OfertasPerfilDaaS.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
public class OfferCustomerHistoryEntity {
    @Id
    @Column(name = "uuid", unique = true)
    private UUID uuid;

    private UUID id_customer;
    private UUID id_product;
    private Timestamp timestamp;
}
