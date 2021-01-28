package avitepa.foundation.bank.bankservices.model;

public class Transfer {

    private long fromAccId;

    private long toAccId;

    private float transferAmt;

    public long getFromAccId() {
        return fromAccId;
    }

    public void setFromAccId(long fromAccId) {
        this.fromAccId = fromAccId;
    }

    public long getToAccId() {
        return toAccId;
    }

    public void setToAccId(long toAccId) {
        this.toAccId = toAccId;
    }

    public float getTransferAmt() {
        return transferAmt;
    }

    public void setTransferAmt(float transferAmt) {
        this.transferAmt = transferAmt;
    }
}
