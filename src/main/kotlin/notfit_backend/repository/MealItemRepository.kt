
package notfit_backend.repository

import notfit_backend.entity.MealItemEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface MealItemRepository : JpaRepository<MealItemEntity, UUID> {

    fun findAllByMeal_Id(mealId: UUID): List<MealItemEntity>

    fun deleteAllByMeal_Id(mealId: UUID)
}
