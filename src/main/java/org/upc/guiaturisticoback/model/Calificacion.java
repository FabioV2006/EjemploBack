package org.upc.guiaturisticoback.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Calificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idcalificacion;

    private Integer puntuacion;

    private String comentario;

    private Date fecha;

    @ManyToOne
    @JoinColumn(name = "idguiaturistico")
    private GuiaTuristico guiaturistico;
}
