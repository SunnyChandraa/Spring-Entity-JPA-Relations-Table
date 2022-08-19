package com.domain.dto;

import java.util.ArrayList;
import java.util.List;

// <T> maskudnya objeknya boleh apa saja nantinya
public class ResponseData<T> {
    private boolean status;
    private List<String> messages = new ArrayList();
    // kalo datanya berhasil disimpaan akan return lagi dan direspon balik yang disimpan didalam payload
    private T payload;
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public List<String> getMessages() {
        return messages;
    }
    public void setMessages(List<String> messages) {
        this.messages = messages;
    }
    public T getPayload() {
        return payload;
    }
    public void setPayload(T payload) {
        this.payload = payload;
    }

    
}
