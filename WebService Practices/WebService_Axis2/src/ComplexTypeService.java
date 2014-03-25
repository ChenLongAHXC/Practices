import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import data.User;


public class ComplexTypeService {
	
	public User getUser(){
		User user=new User();
		user.setAddress("china");
		user.setEmail("abc@def.com");
		user.setId(1);
		user.setName("zhangsan");
		return user;
	}
		
	public int[] getIntArray(){
		int[] array=new int[]{1,2,3,4,5,6,7,8,9,10};
		return array;
	}
	
	public String[] getStringArray(){
		return new String[]{"宣城","北京","上海","安徽"};
	}
	
	public String uploadByte(byte[] bytes, int length){
		String path="";
		FileOutputStream fos=null;
		try {
			path=System.getProperty("user.dir")+File.separator+"test.txt";
			File file=new File(path);
			fos=new FileOutputStream(file);
			fos.write(bytes, 0, length);
			path=file.getAbsolutePath();
			System.out.println("file absolute paht: "+path);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return path;
	}
}
