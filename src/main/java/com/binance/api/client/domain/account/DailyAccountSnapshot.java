
package com.binance.api.client.domain.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DailyAccountSnapshot {

    private Integer code;
    private String msg;
    private List<SnapshotVo> snapshotVos;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<SnapshotVo> getSnapshotVos() {
        return snapshotVos;
    }

    public void setSnapshotVos(List<SnapshotVo> snapshotVos) {
        this.snapshotVos = snapshotVos;
    }

    @Override
    public String toString() {
        return "DailyAccountSnapshot{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", snapshotVos=" + snapshotVos +
                '}';
    }
}
