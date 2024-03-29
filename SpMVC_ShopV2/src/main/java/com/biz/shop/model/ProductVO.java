package com.biz.shop.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ProductVO {
	
private String p_code;
private String	p_name;
private String	p_dcode;
private String	p_std;
private int	p_iprice;
private int	p_oprice;
private String	p_image;

// DB연동을 할때 CHAR(1) TinyInt 형으로 선언된 칼럼과 연동하기 위해
// 사용하는 type이 type 0 ~ 255, -128 ~ -127까지의 값만을 지정하는 데이터
// 메모리 공간 크기가 1byte(8bit)
// int 형은 java에서 4byte 크기를 사용
// String형은 wrapper클래스이다 보니 실제적으로 상당히 큰
// 메모리 공간을 차지한다
// 단순히  flag와 같은 데이터를 취급할때는 char, byte형으로 사용하면
//메모리 절약을 힐수잇다


/*
 * DB p_not_use 칼럼의 값이 null(IS NULL)이면 정상적인 데이터이고
 * null이 아니면 (IS NOT NULL)이면 삭제된 데이터로 취급하기로 하였다
 *Update를 수행할때 VO의 칼럼에 값이 null이면 jdbcType.VARCHAR, confing에 수행 설정때문에
 *DB에 업데이트할때 NULL이 아닌 다른 값이 저장되어 버린다
 *Dao.Update()수행하기 전에 VO에 해당 칼럼의 값을 강제로 NULL로 해줄필요가 있다
 *하지만 기본형인 변수는 NULL을저장하여 DB로 보낼수 없다
 *
 *때문에
 *이 칼럼에 타입을 btye 형이 아닌 Byte wrapper클래스형으로 설정한다
 */

private Byte p_not_use;
	

}
