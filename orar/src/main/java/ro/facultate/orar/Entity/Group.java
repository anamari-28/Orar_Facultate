package ro.facultate.orar.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "`group`")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "group_name")
    private String groupName;
}