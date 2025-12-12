package org.upc.guiaturisticoback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.upc.guiaturisticoback.dto.ReporteDTO;
import org.upc.guiaturisticoback.model.GuiaTuristico;

import java.util.List;
import java.util.Objects;

@Repository
public interface GuiaTuristicoRepository extends JpaRepository<GuiaTuristico, Long> {

    @Query ("SELECT g.nombre, avg(c.puntuacion) " +
            "FROM GuiaTuristico g JOIN g.calificaciones c " +
            "GROUP BY g.nombre " +
            "ORDER BY c.puntuacion DESC ")
    List<Object[]> PromedioporGuiaTuristico();
}
