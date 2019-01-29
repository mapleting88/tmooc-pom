package cn.tedu.json;
/*
"student_email":"123456@qq.com",		//邮箱
"student_name": “张三",				//姓名
"student_gender":"男",				//性别
"student_phone":188108929866,			//手机号
"student_education_background”: v1,		//学历
"student_order_code”:347813236557,		//学员订单号
"class_code":"111111111",				//班级编码
"series_class_code":"qqqqqq",			//系列班编码
"center_code":"1111",				//中心编码
"study_mode":"105100",				//学习方式（vip、脱产）
“course_id":"java",					//课程方向
"operation_mode":"新建",				//操作类型（新增、修改）
"create_time":"2018-06-06",					//操作时间
}
*/
public class Json {
	
	private String student_email;
	private String student_name;
	private String student_gender;
	private String student_phone;
	private String student_education_background;
	private String student_order_code;
	private String class_code;
	private String series_class_code;
	private String center_code;
	private String study_mode;
	private String course_id;
	private String operation_mode;
	private String create_time;
	public String getStudent_email() {
		return student_email;
	}
	public void setStudent_email(String student_email) {
		this.student_email = student_email;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_gender() {
		return student_gender;
	}
	public void setStudent_gender(String student_gender) {
		this.student_gender = student_gender;
	}
	public String getStudent_phone() {
		return student_phone;
	}
	public void setStudent_phone(String student_phone) {
		this.student_phone = student_phone;
	}
	public String getStudent_education_background() {
		return student_education_background;
	}
	public void setStudent_education_background(String student_education_background) {
		this.student_education_background = student_education_background;
	}
	public String getStudent_order_code() {
		return student_order_code;
	}
	public void setStudent_order_code(String student_order_code) {
		this.student_order_code= student_order_code;
	}
	public String getClass_code() {
		return class_code;
	}
	public void setClass_code(String class_code) {
		this.class_code = class_code;
	}
	public String getSeries_class_code() {
		return series_class_code;
	}
	public void setSeries_class_code(String series_class_code) {
		this.series_class_code = series_class_code;
	}
	public String getCenter_code() {
		return center_code;
	}
	public void setCenter_code(String center_code) {
		this.center_code = center_code;
	}
	public String getStudy_mode() {
		return study_mode;
	}
	public void setStudy_mode(String study_mode) {
		this.study_mode = study_mode;
	}
	public String getCourse_id() {
		return course_id;
	}
	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}
	public String getOperation_mode() {
		return operation_mode;
	}
	public void setOperation_mode(String operation_mode) {
		this.operation_mode = operation_mode;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	
	public String toString(){
		return ("{student_email:"+student_email+",student_name:"+ student_name+",student_gender:"+student_gender+",student_phone:"+student_phone+",student_education_background:"+student_education_background+",student_order_code:"+student_order_code+",class_code:"+class_code+",series_class_code:"+series_class_code+",center_code:"+center_code+",study_mode:"+study_mode+",course_id:"+course_id+",operation_mode:"+operation_mode+",create_time:"+create_time+"}");
		
	}
	

}
