package notfit_backend.repository

import notfit_backend.entity.WorkoutExerciseEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface WorkoutExerciseRepository : JpaRepository<WorkoutExerciseEntity, UUID> {

    fun findAllByWorkout_Id(workoutId: UUID): List<WorkoutExerciseEntity>

    fun deleteAllByWorkout_Id(workoutId: UUID)
}