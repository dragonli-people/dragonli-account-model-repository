package org.dragonli.service.modules.accountservice.entity.enums;

/**
 * @author liwenyu
 * 凭条状态
 */
public enum EvidenceStatus {

	/**
	 * 刚建立，等待tick
	 */
	INIT(false),
	/**
	 * 超时，暂未使用
	 */
	TIME_OUT(true),
	/**
	 * 完成，余额不足未操作
	 */
	BALANCE_NOT_ENOUGH(true),
	/**
	 * 暂未使用
	 */
	FROM_BEGIN(false),
	/**
	 * 暂未使用
	 */
	FROM_FINISHED(false),
	/**
	 * 暂未使用
	 */
	TO_BEGIN(false),

	/**
	 * 暂未使用
	 */
	TO_FINISHED(false),
	
	
	SUCCESS(true),
	
	FAILED(true),
	
	//'INIT','TIME_OUT','BALANCE_NOT_ENOUGH','FROM_BEGIN','FROM_FINISHED','TO_BEGIN','TO_FINISHED','SUCCESS','FAILED','CLOSE'
	/**
	 * 关闭，已经处理。暂未使用
	 */
	CLOSE(true);

	
	public final boolean isFinalStatus;

	private EvidenceStatus(boolean isFinalStatus) {
		this.isFinalStatus = isFinalStatus;
	}
	
	
	
}
