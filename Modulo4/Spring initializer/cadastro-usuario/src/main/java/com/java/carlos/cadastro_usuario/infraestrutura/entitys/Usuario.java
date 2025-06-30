package com.java.carlos.cadastro_usuario.infraestrutura.entitys;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "usuario")
@Entity

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "name")
    private String none;


}
