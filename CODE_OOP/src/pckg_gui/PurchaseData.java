package pckg_gui;

public class PurchaseData {

    private String category;
    private String payment;
    private String delivery;
    private boolean gift;
    private boolean giftBox;
    private boolean specGift;

    public PurchaseData(String category, String payment, String delivery, boolean gift, boolean giftBox, boolean specGift) {
        this.category = category;
        this.payment = payment;
        this.delivery = delivery;
        this.gift = gift;
        this.giftBox = giftBox;
        this.specGift = specGift;
    }

    @Override
    public String toString() {
        return "PurchaseData{" +
                "category='" + category + '\'' +
                ", payment='" + payment + '\'' +
                ", delivery='" + delivery + '\'' +
                ", gift=" + gift +
                ", giftBox=" + giftBox +
                ", specGift=" + specGift +
                '}';
    }
}
