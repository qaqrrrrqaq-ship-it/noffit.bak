
package notfit_backend.repository

import notfit_backend.entity.MealEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.time.LocalDate
import java.util.UUID

interface MealRepository : JpaRepository<MealEntity, UUID> {

    fun findAllByUser_IdAndMealDate(userId: UUID, mealDate: LocalDate): List<MealEntity>

    fun findAllByUser_IdAndMealDateBetween(
        userId: UUID,
        startDate: LocalDate,
        endDate: LocalDate
    ): List<MealEntity>
}
