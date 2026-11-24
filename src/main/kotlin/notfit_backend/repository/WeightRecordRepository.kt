package notfit_backend.repository

import notfit_backend.entity.WeightRecordEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.time.LocalDate
import java.util.UUID

interface WeightRecordRepository : JpaRepository<WeightRecordEntity, UUID> {

    fun findAllByUser_IdOrderByRecordedAtDesc(userId: UUID): List<WeightRecordEntity>

    fun findAllByUser_IdAndRecordedAtBetweenOrderByRecordedAtAsc(
        userId: UUID,
        startDate: LocalDate,
        endDate: LocalDate
    ): List<WeightRecordEntity>
}