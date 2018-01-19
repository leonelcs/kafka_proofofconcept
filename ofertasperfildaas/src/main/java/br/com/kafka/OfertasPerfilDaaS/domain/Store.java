package br.com.kafka.OfertasPerfilDaaS.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
public class Store {
    public Store(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Id
    @Column(name = "uuid", unique = true)
    private UUID uuid;
    private String name;
    private String address;
}
