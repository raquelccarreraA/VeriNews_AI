package com.verinews.backend.models;

import com.verinews.backend.models.enums.TipoMetrica;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "metrica")
public class Metrica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoMetrica tipo;

    private Integer alertas;

    @Column(columnDefinition = "TEXT")
    private String observaciones;

    @Column(name = "fragmentos_detectados", columnDefinition = "TEXT")
    private String fragmentosDetectados;

    @ManyToOne
    @JoinColumn(name = "resultado_id")
    private ResultadoAnalisis resultado;
}