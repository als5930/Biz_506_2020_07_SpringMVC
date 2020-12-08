package com.biz.data.model;

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
public class BisStation {
	
	
	//"STATION_LIST":
		//[
		// {
			// "STATION_NUM":1,
			// "BUSSTOP_NAME":"동원촌",
			// "ARS_ID":"5396",
			// "NEXT_BUSSTOP":"비아동주민센터(앞)",
			// "BUSSTOP_ID":2513,"LONGITUDE":126.927,
			// "NAME_E":"Dongwonchon",
			//"LATITUDE":35.14214722}
	
	private String STATION_NUM;
	private String BUSSTOP_NAME;
	private String ARS_ID;
	private String NEXT_BUSSTOP;
	private String BUSSTOP_ID;

}
