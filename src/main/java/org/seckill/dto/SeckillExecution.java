package org.seckill.dto;

import org.seckill.entity.SuccessKilled;

/**
 * 封装秒杀执行后的结果
 * @author Operations
 *
 */
public class SeckillExecution {
	
	private long seckillId;
	
	//秒杀执行结果状态
	private int state;
	
	//状态表示
	private String stateInfo;
	
	//秒杀成功对象
	private SuccessKilled successkilled;

	public SeckillExecution(long seckillId, int state, String stateInfo, SuccessKilled successkilled) {
		super();
		this.seckillId = seckillId;
		this.state = state;
		this.stateInfo = stateInfo;
		this.successkilled = successkilled;
	}

	public SeckillExecution(int state, String stateInfo, SuccessKilled successkilled) {
		super();
		this.state = state;
		this.stateInfo = stateInfo;
		this.successkilled = successkilled;
	}

	public long getSeckillId() {
		return seckillId;
	}

	public void setSeckillId(long seckillId) {
		this.seckillId = seckillId;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getStateInfo() {
		return stateInfo;
	}

	public void setStateInfo(String stateInfo) {
		this.stateInfo = stateInfo;
	}

	public SuccessKilled getSuccesskilled() {
		return successkilled;
	}

	public void setSuccesskilled(SuccessKilled successkilled) {
		this.successkilled = successkilled;
	}

	@Override
	public String toString() {
		return "SeckillExecution [seckillId=" + seckillId + ", state=" + state + ", stateInfo=" + stateInfo
				+ ", successkilled=" + successkilled + "]";
	}
	
}
