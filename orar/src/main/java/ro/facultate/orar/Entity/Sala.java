package ro.facultate.orar.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "sala")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nume;

    @Column(nullable = false)
    private String cladire;

    private Integer etaj;

    @Column(name = "nr_locuri")
    private Integer nrLocuri;

    @Enumerated(EnumType.STRING)
    @Column(name = "tip_sala")
    private TipSala tipSala;
}