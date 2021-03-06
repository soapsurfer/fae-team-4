package de.th.koeln.fae.ungewoehnlichesverhalten.DVP.repositories;

import de.th.koeln.fae.ungewoehnlichesverhalten.DVP.models.DVP;
import org.springframework.data.repository.query.Param;


public interface CustomDvpRepository {

    Iterable<DVP> findAllByUmkreissuche(@Param("lat") double lat, @Param("lng") double lng,  @Param("radius") long radius);
}
