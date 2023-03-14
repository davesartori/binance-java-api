
package com.binance.api.client.domain.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {

    private List<Balance> balances;
    private String totalAssetOfBtc;

    public List<Balance> getBalances() {
        return balances;
    }

    public void setBalances(List<Balance> balances) {
        this.balances = balances;
    }

    public String getTotalAssetOfBtc() {
        return totalAssetOfBtc;
    }

    public void setTotalAssetOfBtc(String totalAssetOfBtc) {
        this.totalAssetOfBtc = totalAssetOfBtc;
    }

    @Override
    public String toString() {
        return "Data{" +
                "balances=" + balances +
                ", totalAssetOfBtc='" + totalAssetOfBtc + '\'' +
                '}';
    }
}
