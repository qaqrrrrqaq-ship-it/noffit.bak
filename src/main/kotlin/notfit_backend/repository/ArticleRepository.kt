package notfit_backend.repository

import notfit_backend.entity.ArticleEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface ArticleRepository : JpaRepository<ArticleEntity, UUID> {

    fun findAllByIsPublishedTrueOrderByPublishedAtDesc(): List<ArticleEntity>

    fun findAllByCategory_IdAndIsPublishedTrue(categoryId: UUID): List<ArticleEntity>
}