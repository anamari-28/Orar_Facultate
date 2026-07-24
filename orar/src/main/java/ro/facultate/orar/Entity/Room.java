package ro.facultate.orar.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "room")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String building;

    private Integer floor;

    @Column(name = "seat_count")
    private Integer seatCount;

    @Enumerated(EnumType.STRING)
    @Column(name = "room_type")
    private RoomType roomType;
}