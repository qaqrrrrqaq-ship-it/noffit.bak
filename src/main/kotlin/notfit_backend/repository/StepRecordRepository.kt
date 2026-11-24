package notfit_backend.repository

import notfit_backend.entity.StepRecordEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.time.LocalDate
import java.util.UUID

interface StepRecordRepository : JpaRepository<StepRecordEntity, UUID> {

    fun findByUser_IdAndRecordDate(userId: UUID, recordDate: LocalDate): StepRecordEntity?

    fun findAllByUser_IdAndRecordDateBetweenOrderByRecordDateAsc(
        userId: UUID,
        startDate: LocalDate,
        endDate: LocalDate
    ): List<StepRecordEntity>
}