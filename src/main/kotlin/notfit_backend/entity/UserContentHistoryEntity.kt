
package notfit_backend.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table
import java.time.Instant
import java.util.UUID

@Entity
@Table(name = "user_content_history")
open class UserContentHistoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    open var id: UUID? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    open var user: UserEntity? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "article_id")
    open var article: ArticleEntity? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "video_id")
    open var video: VideoEntity? = null

    @Column(name = "progress_percent", nullable = false)
    open var progressPercent: Int = 0

    @Column(name = "is_completed", nullable = false)
    open var isCompleted: Boolean = false

    @Column(name = "last_viewed_at", nullable = false)
    open var lastViewedAt: Instant = Instant.now()

    @Column(name = "created_at", nullable = false, updatable = false)
    open var createdAt: Instant = Instant.now()
}
