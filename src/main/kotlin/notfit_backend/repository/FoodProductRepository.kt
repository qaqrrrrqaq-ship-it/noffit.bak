
package notfit_backend.repository

import notfit_backend.entity.FoodProductEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface FoodProductRepository : JpaRepository<FoodProductEntity, UUID> {

    fun findAllByNameContainingIgnoreCase(name: String): List<FoodProductEntity>

    fun findAllByBrandContainingIgnoreCase(brand: String): List<FoodProductEntity>
}
