package com.bmft.pojo;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
public class User implements Serializable {
	private Integer id; //id 
	private String userCode; //用户编码
	private String userName; //用户名称
	private String userPassword; //用户密码
	private Integer gender;  //性别
	private Date birthday;  //出生日期
	private String phone;   //电话
	private String address; //地址
	private Integer userRole;    //用户角色的id，
	private Integer createdBy;   //创建者
	private Date creationDate; //创建时间
	private Integer modifyBy;     //更新者
	private Date modifyDate;   //更新时间

	private Integer age;//年龄

	private String userRoleName;    //用户角色名称


	public Integer getAge() {
		/*long time = System.currentTimeMillis()-birthday.getTime();
		Integer age = Long.valueOf(time/365/24/60/60/1000).IntegerValue();*/
		Date date = new Date();
		Integer age = date.getYear() - birthday.getYear();
		return age;
	}
}