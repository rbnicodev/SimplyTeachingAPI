package com.rbnico.simplyteaching.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "groups")
public class GroupModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private Long id;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_subject"))
    private SubjectModel subject;

    private int day;

//    @Temporal(TemporalType.TIME)
//    private

}
