package ro.facultate.orar.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "persoana")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Persoana {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nume;

    @Column(nullable = false)
    private String prenume;

    @Column(nullable = false, unique = true, length = 13)
    private String cnp;

    @Column(name = "initiala_tata", length = 1)
    private String initialaTata;
}