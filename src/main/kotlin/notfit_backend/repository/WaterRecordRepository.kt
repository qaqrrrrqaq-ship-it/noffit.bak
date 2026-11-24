package notfit_backend.repository

import notfit_backend.entity.WaterRecordEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.time.LocalDate
import java.util.UUID

interface WaterRecordRepository : JpaRepository<WaterRecordEntity, UUID> {

    fun findAllByUser_IdAndRecordDate(userId: UUID, recordDate: LocalDate): List<WaterRecordEntity>

    fun findAllByUser_IdAndRecordDateBetween(
        userId: UUID,
        startDate: LocalDate,
        endDate: LocalDate
    ): List<WaterRecordEntity>
}