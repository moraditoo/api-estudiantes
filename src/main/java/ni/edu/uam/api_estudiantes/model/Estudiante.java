package ni.edu.uam.api_estudiantes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Audited;
import org.springframework.data.annotation.Id;

@Entity
@Audited.Table(name = "estudiantes")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Estudiante{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombres;
    private String apellidos;
    private String carrera;
}