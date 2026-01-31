# 🧪 Challenge: The Broken Discount Engine

**Topic**: Testing (JUnit 5, Mocking)

## 📝 Problem Statement

You have been given a `DiscountEngine` class by a legacy developer.
It is supposed to calculate the price after discount.
BUT... it might have bugs. Or maybe it works? We don't know.

Your job is to write **Unit Tests** to prove it works (or fail if it doesn't).

**Rules**:

1. A code "VIP" gets 20% off.
2. A code "SALE" gets 10% off.
3. Any other code gets 0% off.
4. Negative prices should throw an Exception.

---

## 💻 Starter Code

Copy this code into `DiscountTest.java`. (We assume `DiscountEngine` exists inside).

```java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DiscountEngine {
    public double calculate(double price, String code) {
        if (price < 0) throw new IllegalArgumentException("Negative Price");
        
        if ("VIP".equals(code)) return price * 0.80;
        if ("SALE".equals(code)) return price * 0.90;
        
        return price;
    }
}

class DiscountTest {

    // TODO 1: Write a test for the 'VIP' case (20% off)
    @Test
    void testVipDiscount() {
        DiscountEngine engine = new DiscountEngine();
        // assertEquals(expected, actual);
    }

    // TODO 2: Write a test for 'SALE'
    
    // TODO 3: Write a test for Validation (Negative price)
    // HINT: Use assertThrows(IllegalArgumentException.class, () -> ... )
}
```

---

## ✅ Acceptance Criteria

1. **Coverage**: You must have at least 3 separate tests (`@Test`).
2. **Accuracy**: `testVipDiscount` should assert that `100.0` becomes `80.0`.
3. **Safety**: The standard JUnit assertions (`assertEquals`, `assertThrows`) must be used.
