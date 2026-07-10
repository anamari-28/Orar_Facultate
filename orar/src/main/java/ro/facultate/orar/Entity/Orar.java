package ro.facultate.orar.Entity;

import jakarta.persistence.*;
import lombok.*;
import ro.facultate.orar.Entity.*;

import java.time.LocalTime;

@Entity
@Table(name = "orar")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Orar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ora_inceput")
    private LocalTime oraInceput;

    @Column(name = "ora_sfarsit")
    private LocalTime oraSfarsit;

    private String ziua;

    @Enumerated(EnumType.STRING)
    @Column(name = "tip_disciplina")
    private TipDisciplina tipDisciplina;

    private String saptamana;

    @ManyToOne
    @JoinColumn(name = "profesor_id")
    private Profesor profesor;

    @ManyToOne
    @JoinColumn(name = "disciplina_id")
    private Disciplina disciplina;

    @ManyToOne
    @JoinColumn(name = "grupa_id")
    private Grupa grupa;

    @ManyToOne
    @JoinColumn(name = "sala_id")
    private Sala sala;
}