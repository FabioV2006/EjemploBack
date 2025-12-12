package org.upc.guiaturisticoback.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class GuiaTuristico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idguia;

    private String nombre;

    private String apellido;

    private String especialidad;

    private Integer experienciaanios;

    @OneToMany(mappedBy = "guiaturistico", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Calificacion> calificaciones;

}
