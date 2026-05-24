class InvalidItemIDException extends Exception {
public InvalidItemIDException(String message) {
super(message);
}
}
class OutOfStockException extends Exception {
public OutOfStockException(String message) {
super(message);
}
}
class PaymentProcessingException extends Exception {
public PaymentProcessingException(String message) {
super(message);
}
}
public class OnlineShopping {
public static void purchaseItem(String itemId, int stock, booleanpaymentSuccessful) {
try {
if (!itemId.equals("item1") && !itemId.equals("item2") && !itemId.equals("item3")) {
throw new InvalidItemIDException("Invalid item ID!");
}
try {
if (stock <= 0) {
throw new OutOfStockException("Item out of stock!");
}
// Simulate payment processing
try {
if (!paymentSuccessful) {
throw new PaymentProcessingException("Payment processing failed!");
}
stock -= 1;
System.out.println("Purchase successful! Remaining stock: " + stock);
} catch (PaymentProcessingExceptionppe) {
System.out.println("Error: " + ppe.getMessage());
}
} catch (OutOfStockExceptionose) {
System.out.println("Error: " + ose.getMessage());
}
} catch (InvalidItemIDExceptioniie) {
System.out.println("Error: " + iie.getMessage());
}
}
public static void main(String[] args) {
purchaseItem("item4", 5, true); // Invalid item ID
purchaseItem("item1", 0, true); // Out of stock
purchaseItem("item1", 5, false); // Payment processing failed
purchaseItem("item1", 5, true); // Successful purchase
}
}
