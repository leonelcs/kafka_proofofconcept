package br.com.kafka.dto;

import java.util.UUID;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OfertaPerfilCliente {
    private UUID idCustomer;
    private UUID idProducto;
}
