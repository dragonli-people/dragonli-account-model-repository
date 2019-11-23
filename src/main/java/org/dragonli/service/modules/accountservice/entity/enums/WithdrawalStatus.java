package org.dragonli.service.modules.accountservice.entity.enums;

public enum WithdrawalStatus {
    /* 创建 */ INIT,
    /* 企业帐户审核中 */ CHILD_CHECHING,
    /* 企业帐户审核通过 */ CHILD_HAD_BE_ACCEPT,
    /* 资金划转中 */ CHILD_HAD_TRASFER,
    /* 等待审核 */ HAD_DEDUCTION_AND_WAIT,
    /* 审核已通过 */ HAD_ACCEPT,
    /* 提现完成 */ SUCCESS,
    /* 提现失败 */ FAILED,
    /* 网络异常，人工复核中 */ NETWORK_ERROR,
    /* 企业帐户审核拒绝 */ REFUSE_CHILD,
    /* 平台审核拒绝 */ REFUSE_WITHDRAWAL,
    /* 已返回资金 */ HAD_BACK_MONEY,
    /* 返回资金已到帐 */ BACK_MONEY_DONE,
    /* 资金转帐失败 */ DEDUCTION_PAYMENT_FAILD,//table will modfy add
    /* 返回资金转帐失败 */ BACK_MONEY_PAYMENT_FAILD,//table will modfy add
}
