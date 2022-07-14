package br.com.gustavo.store.quote;

import br.com.gustavo.store.quote.status.QuoteStatus;
import br.com.gustavo.store.quote.status.UnderAnalysis;

import java.math.BigDecimal;

public class Quote {
    private BigDecimal value;
    private int quantityOfItems;

    private QuoteStatus status;

    public Quote(BigDecimal value, int quantityOfItems){
        this.value = value;
        this.quantityOfItems = quantityOfItems;
        this.status = new UnderAnalysis();
    }
    public void applyExtraDiscount(){
        BigDecimal extraDiscountValue = this.status.calculateExtraDiscountValue(this);
        this.value = this.value.subtract(extraDiscountValue);
    }
    //ESTATE
    public void approve(){ this.status.approve(this); }
    public void disapprove(){
        this.status.disapprove(this);
    }
    public void finish(){
        this.status.finish(this);
    }
    public BigDecimal getValue() {
        return value;
    }
    public int getQuantityOfItems() {
        return quantityOfItems;
    }
    public QuoteStatus getStatus() {
        return status;
    }
    public void setStatus(QuoteStatus status) {
        this.status = status;
    }
}
