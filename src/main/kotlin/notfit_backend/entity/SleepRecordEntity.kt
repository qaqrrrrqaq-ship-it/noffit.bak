
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
@Table(name = "sleep_records")
open class SleepRecordEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    open var id: UUID? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    open var user: UserEntity? = null

    @Column(name = "sleep_start", nullable = false)
    open var sleepStart: Instant = Instant.now()

    @Column(name = "sleep_end", nullable = false)
    open var sleepEnd: Instant = Instant.now()

    @Column(name = "duration_minutes", nullable = false)
    open var durationMinutes: Int = 0

    @Column(name = "quality", length = 20)
    open var quality: String? = null

    @Column(name = "notes", length = 500)
    open var notes: String? = null

    @Column(name = "created_at", nullable = false, updatable = false)
    open var createdAt: Instant = Instant.now()
}
