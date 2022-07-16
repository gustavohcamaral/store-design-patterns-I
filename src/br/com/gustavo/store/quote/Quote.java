package br.com.gustavo.store.quote;

import br.com.gustavo.store.quote.status.Finished;
import br.com.gustavo.store.quote.status.QuoteStatus;
import br.com.gustavo.store.quote.status.UnderAnalysis;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Quote implements Quotable{
    private BigDecimal value;
    //COMPOSITE
    private List<Quotable> items;
    private QuoteStatus status;
    public Quote(){
        this.value = BigDecimal.ZERO;
        this.items = items = new ArrayList<>();
        this.status = new UnderAnalysis();
    }
    public void applyExtraDiscount(){
        BigDecimal extraDiscountValue = this.status.calculateExtraDiscountValue(this);
        this.value = this.value.subtract(extraDiscountValue);
    }
    //ESTATE

    public BigDecimal getValue() {
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            throw  new RuntimeException(e);
        }
        return value;
    }
    public int getQuantityOfItems() {
        return items.size();
    }
    public void addItem(Quotable item) {
        this.items.add(item);
        this.value = value.add(item.getValue());
    }
    public QuoteStatus getStatus() {
        return status;
    }
    public void setStatus(QuoteStatus status) {
        this.status = status;
    }
    public void approve(){ this.status.approve(this); }
    public void disapprove(){
        this.status.disapprove(this);
    }
    public void finish(){
        this.status.finish(this);
    }
    public boolean isFinished(){
        return status instanceof Finished;
    }
}
