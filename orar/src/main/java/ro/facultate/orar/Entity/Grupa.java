package ro.facultate.orar.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "grupa")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Grupa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nume_grupa", nullable = false)
    private String numeGrupa;
}