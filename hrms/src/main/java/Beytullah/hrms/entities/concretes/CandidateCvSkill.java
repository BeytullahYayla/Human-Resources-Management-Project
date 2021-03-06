package Beytullah.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "candidate_cv_skills")
@AllArgsConstructor
@NoArgsConstructor
public class CandidateCvSkill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @NotNull
    @Min(1)
    @Max(5)
    @Column(name = "level")
    private int level;

    @NotNull
    @ManyToOne()
    @JoinColumn(name = "skill_id")
    private Skill skill;

    @NotNull
    @ManyToOne()
    @JoinColumn(name = "candidate_cv_id")
    private CandidateCv candidateCv;

}