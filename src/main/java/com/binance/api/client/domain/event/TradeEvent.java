package com.binance.api.client.domain.event;

import com.binance.api.client.domain.market.AggTrade;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TradeEvent extends AggTrade {
    @JsonProperty("e")
    private String eventType;

    @JsonProperty("E")
    private long eventTime;

    @JsonProperty("s")
    private String symbol;

    @JsonProperty("t")
    private String tradeId;

    @JsonProperty("p")
    private String price;

    @JsonProperty("q")
    private String quantity;

    @JsonProperty("b")
    private String buyerOrderId;

    @JsonProperty("a")
    private String sellerOrderId;

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public long getEventTime() {
        return eventTime;
    }

    public void setEventTime(long eventTime) {
        this.eventTime = eventTime;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    @Override
    public String getPrice() {
        return price;
    }

    @Override
    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getBuyerOrderId() {
        return buyerOrderId;
    }

    public void setBuyerOrderId(String buyerOrderId) {
        this.buyerOrderId = buyerOrderId;
    }

    public String getSellerOrderId() {
        return sellerOrderId;
    }

    public void setSellerOrderId(String sellerOrderId) {
        this.sellerOrderId = sellerOrderId;
    }

    @Override
    public String toString() {
        return "TradeEvent{" +
                "eventType='" + eventType + '\'' +
                ", eventTime=" + eventTime +
                ", symbol='" + symbol + '\'' +
                ", tradeId='" + tradeId + '\'' +
                ", price='" + price + '\'' +
                ", quantity='" + quantity + '\'' +
                ", buyerOrderId='" + buyerOrderId + '\'' +
                ", sellerOrderId='" + sellerOrderId + '\'' +
                '}' + super.toString();
    }
}
