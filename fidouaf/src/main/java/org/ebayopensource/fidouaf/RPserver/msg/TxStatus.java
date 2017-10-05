package org.ebayopensource.fidouaf.RPserver.msg;

public class TxStatus {
    String status;

    public TxStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
