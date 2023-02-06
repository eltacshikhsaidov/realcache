package io.shixseyidrin.realcache.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@Builder
@Entity(name = "usr")
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    @Serial
    private static final long serialVersionUID = 123456789L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
}
