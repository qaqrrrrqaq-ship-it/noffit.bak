package notfit_backend.repository

import notfit_backend.entity.WorkoutEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.time.LocalDate
import java.util.UUID

interface WorkoutRepository : JpaRepository<WorkoutEntity, UUID> {

    fun findAllByUser_IdOrderByWorkoutDateDesc(userId: UUID): List<WorkoutEntity>

    fun findAllByUser_IdAndWorkoutDateBetweenOrderByWorkoutDateDesc(
        userId: UUID,
        startDate: LocalDate,
        endDate: LocalDate
    ): List<WorkoutEntity>
}