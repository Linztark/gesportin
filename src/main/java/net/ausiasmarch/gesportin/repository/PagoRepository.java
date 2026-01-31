package net.ausiasmarch.gesportin.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import net.ausiasmarch.gesportin.entity.PagoEntity;


public interface PagoRepository extends JpaRepository<PagoEntity, Long> {
    
    Page<PagoEntity> findByCuotaDescripcionContainingIgnoreCase (String descripcion, Pageable oPageable);

    Page<PagoEntity> findByCuotaId(Long idCuota, Pageable oPageable);

    Page<PagoEntity> findByJugadorId(Long idJugador, Pageable oPageable);

    Page<PagoEntity> findByJugadorUsuarioId(Long idUsuario, Pageable oPageable);

    Page<PagoEntity> findByJugadorEquipoId(Long idEquipo, Pageable oPageable);

    Page<PagoEntity> findByCuotaEquipoId(Long idEquipo, Pageable oPageable);

    Page<PagoEntity> findByAbonado(Integer abonado, Pageable oPageable);

    Page<PagoEntity> findByIdAndAbonado(Long id, Integer abonado);
}
