
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
@Table(name = "notifications")
open class NotificationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    open var id: UUID? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    open var user: UserEntity? = null

    @Column(name = "title", nullable = false, length = 200)
    open var title: String = ""

    @Column(name = "message", nullable = false, length = 1000)
    open var message: String = ""

    @Column(name = "notification_type", nullable = false, length = 30)
    open var notificationType: String = "GENERAL"

    @Column(name = "action_url", length = 2048)
    open var actionUrl: String? = null

    @Column(name = "is_read", nullable = false)
    open var isRead: Boolean = false

    @Column(name = "read_at")
    open var readAt: Instant? = null

    @Column(name = "created_at", nullable = false, updatable = false)
    open var createdAt: Instant = Instant.now()
}
