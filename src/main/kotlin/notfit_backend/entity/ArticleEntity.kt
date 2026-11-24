
package notfit_backend.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.PreUpdate
import jakarta.persistence.Table
import java.time.Instant
import java.util.UUID

@Entity
@Table(name = "articles")
open class ArticleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    open var id: UUID? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    open var category: ArticleCategoryEntity? = null

    @Column(name = "title", nullable = false, length = 250)
    open var title: String = ""

    @Column(name = "summary", length = 1000)
    open var summary: String? = null

    @Column(name = "content", nullable = false, columnDefinition = "TEXT")
    open var content: String = ""

    @Column(name = "cover_image_url", length = 2048)
    open var coverImageUrl: String? = null

    @Column(name = "reading_time_minutes")
    open var readingTimeMinutes: Int? = null

    @Column(name = "is_published", nullable = false)
    open var isPublished: Boolean = false

    @Column(name = "published_at")
    open var publishedAt: Instant? = null

    @Column(name = "created_at", nullable = false, updatable = false)
    open var createdAt: Instant = Instant.now()

    @Column(name = "updated_at", nullable = false)
    open var updatedAt: Instant = Instant.now()

    @PreUpdate
    fun updateTimestamp() {
        updatedAt = Instant.now()
    }
}
