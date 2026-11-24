package notfit_backend.repository

import notfit_backend.entity.ExerciseEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface ExerciseRepository : JpaRepository<ExerciseEntity, UUID> {

    fun findAllByNameContainingIgnoreCase(name: String): List<ExerciseEntity>

    fun findAllByCategoryIgnoreCase(category: String): List<ExerciseEntity>
}