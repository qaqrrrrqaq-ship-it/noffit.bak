
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
import java.math.BigDecimal
import java.util.UUID

@Entity
@Table(name = "meal_items")
open class MealItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    open var id: UUID? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "meal_id", nullable = false)
    open var meal: MealEntity? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "food_product_id")
    open var foodProduct: FoodProductEntity? = null

    @Column(name = "product_name", nullable = false, length = 200)
    open var productName: String = ""

    @Column(name = "quantity_grams", nullable = false, precision = 10, scale = 2)
    open var quantityGrams: BigDecimal = BigDecimal.ZERO

    @Column(name = "calories", nullable = false, precision = 10, scale = 2)
    open var calories: BigDecimal = BigDecimal.ZERO

    @Column(name = "protein", nullable = false, precision = 10, scale = 2)
    open var protein: BigDecimal = BigDecimal.ZERO

    @Column(name = "fat", nullable = false, precision = 10, scale = 2)
    open var fat: BigDecimal = BigDecimal.ZERO

    @Column(name = "carbs", nullable = false, precision = 10, scale = 2)
    open var carbs: BigDecimal = BigDecimal.ZERO

    @Column(name = "fiber", precision = 10, scale = 2)
    open var fiber: BigDecimal? = null
}
