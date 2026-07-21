package ro.facultate.orar.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "student")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "pers_id", nullable = false)
    private Persoana persoana;

    @Column(name = "numar_matricol", nullable = false, unique = true)
    private String numarMatricol;

    @ManyToOne
    @JoinColumn(name = "grupa_id")
    private Grupa grupa;

    @Column(nullable = false)
    private String parola;
}