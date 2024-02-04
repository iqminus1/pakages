package pdp.uz.model.template;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;

@MappedSuperclass
public abstract class AbsIntegerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @CreationTimestamp
    @Column(updatable = false)
    private Timestamp created;

    @UpdateTimestamp
    private Timestamp updated;
}
