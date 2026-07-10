package ro.facultate.orar.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "profesor")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Profesor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "pers_id", nullable = false)
    private Persoana persoana;

    private String gradDidactic;

    private String departament;
}