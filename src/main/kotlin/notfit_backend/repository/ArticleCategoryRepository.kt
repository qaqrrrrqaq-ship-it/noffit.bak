package notfit_backend.repository

import notfit_backend.entity.ArticleCategoryEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface ArticleCategoryRepository : JpaRepository<ArticleCategoryEntity, UUID> {

    fun findAllByIsActiveTrueOrderBySortOrderAsc(): List<ArticleCategoryEntity>
}