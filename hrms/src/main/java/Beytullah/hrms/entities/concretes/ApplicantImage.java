package Beytullah.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="applicant_images")
public class ApplicantImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int applicantImageId;

    @Column(name = "url")
    private String url;

    @OneToOne
    @JoinColumn(referencedColumnName = "cv_id")
    private ApplicantCv applicantCv;

    

}
