package Shop;

public class OrderTracker {
    private String orderId;
    private Status deliveryStatus;

    public OrderTracker(String orderId) {
        this.orderId = orderId;
        this.deliveryStatus = Status.NEW;
    }

    public void updateDeliveryStatus(Status newStatus) {
        if (newStatus != null && !newStatus.equals(deliveryStatus)) {
            this.deliveryStatus = newStatus;
        }
    }

    public Status getDeliveryStatus() {
        return deliveryStatus;
    }
}
