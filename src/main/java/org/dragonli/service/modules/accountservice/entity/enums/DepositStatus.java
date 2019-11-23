package org.dragonli.service.modules.accountservice.entity.enums;

public enum DepositStatus {
    /* 捕获可能的数据 */ INIT,
    /* 已从区块确认充值 */ CONFIRM,
    /* 已从开始内部转账 */ BEGIN,
    /* 充值成功 */ SUCCESS,
    /* 充值失败 */ FAILED,
    /* 内部充值成功 */ PAYMENT_FAILD,
    /* memo格式错误 */ MEMO_EXCEPTION,
}
