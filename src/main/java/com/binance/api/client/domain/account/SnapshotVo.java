
package com.binance.api.client.domain.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SnapshotVo {

    private Data data;
    private String type;
    private Long updateTime;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "SnapshotVo{" +
                "data=" + data +
                ", type='" + type + '\'' +
                ", updateTime=" + updateTime +
                '}';
    }
}
