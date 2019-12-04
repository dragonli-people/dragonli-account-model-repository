package org.dragonli.service.modules.accountservice.entity.enums;

public enum PaymentStatus {
    INIT(false),
    FROM_BEGIN(false),
    FROM_FINISHED(false),
    TO_BEGIN(false),
    TO_FINISHED(false),
    SUCCESS(true),
    FAILED(true);

    private boolean finished;
    PaymentStatus(boolean finished){
        this.finished = finished;
    }

    public boolean isFinished() {
        return finished;
    }
}
