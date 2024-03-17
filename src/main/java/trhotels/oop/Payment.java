package trhotels.oop;

import java.util.Date;

public class Payment {
    private double amount;
    private Date date;
    private EPaymentMethod method;
    private User payer;
    private Host receiver;

    public User getPayer() {
        return payer;
    }

    public void setPayer(User payer) {
        this.payer = payer;
    }

    public Host getReceiver() {
        return receiver;
    }

    public void setReceiver(Host receiver) {
        this.receiver = receiver;
    }

    public Payment(double amount, Date date, EPaymentMethod method, User payer, Host receiver) {
        this.amount = amount;
        this.date = date;
        this.method = method;
        this.payer = payer;
        this.receiver = receiver;
    }

    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public EPaymentMethod getMethod() {
        return method;
    }
    public void setMethod(EPaymentMethod method) {
        this.method = method;
    }
}
