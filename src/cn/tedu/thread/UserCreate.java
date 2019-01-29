package cn.tedu.thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import org.apache.log4j.Logger;
import cn.tedu.json.Json;
import cn.tedu.util.CourseUtil;
import cn.tedu.util.EmailUtil;
import cn.tedu.util.NameUtil;
import cn.tedu.util.PhoneUtil;

public class UserCreate implements Runnable {

	private Logger logger = Logger.getLogger(UserCreate.class);

	@Override
	public void run() {
		while (true) {
			SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			//历史数据的生成
			/*long start = 0L;
			long end = 0L;
			try {
				start = format.parse("2018/12/26 00:00:00").getTime();
				end = format.parse("2019/1/25 00:00:00").getTime();
			} catch (ParseException e1) {
				e1.printStackTrace();
			}
			long date=(long) (Math.random()*(end-start)+start);*/
			//实时数据的生成
			long date = System.currentTimeMillis();
			String now = format.format(new Date(date));
			Json json = new Json();
			json.setStudent_email(EmailUtil.getEmail());
			json.setStudent_name(NameUtil.getName());
			json.setStudent_gender("" + (int) (Math.random() * 2));
			json.setStudent_phone(PhoneUtil.getPhone());
			json.setStudent_education_background("" + (int) (Math.random() * 3) + 1);
			json.setStudent_order_code(UUID.randomUUID().toString());
			json.setClass_code("201812");
			String str = CourseUtil.getCourse();
			json.setSeries_class_code(str + "201812");
			json.setCenter_code("" + (int) (Math.random() * 100) + 1);
			json.setStudy_mode("" + (int) (Math.random() * 2));
			json.setCourse_id(str);
			json.setOperation_mode("0");
			json.setCreate_time(now);
			Start.list.add(json.toString());
			logger.info(json.toString());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e2) {
				e2.printStackTrace();
			}
		}
	}

}
