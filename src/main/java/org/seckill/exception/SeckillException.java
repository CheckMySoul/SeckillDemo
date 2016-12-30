package org.seckill.exception;

/**
 * 秒杀相关业务异常
 * @author Operations
 *
 */
public class SeckillException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3848327706412041512L;
	
	public SeckillException(String message) {
		super(message);
	}
	
	public SeckillException(String message, Throwable cause) {
		super(message, cause);
	}
}
