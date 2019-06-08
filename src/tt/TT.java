package tt;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TT {
	public static void main(String[]args) throws IOException {
		OutputStream out = new FileOutputStream("D:\\haha.txt");
		try {
			InputStream input=new FileInputStream("D:\\dram.out");
			BufferedReader reader=new BufferedReader(new InputStreamReader(input,"gb2312"));
			
			String line=null;
			int i=0;
			while((line=reader.readLine())!=null) {
				if(i>100000)
					break;
				i++;
				if(i>2) {
					String tem[]=line.split(":");
					String[] rr=tem[3].split(" ");
					String addr=rr[2];
					String type="";
					if(rr[1].equals("WriteReq"))
						type="2";
					else
						type="1";
					String data=type+" "+addr+"\n";
					out.write(data.getBytes());
					
				}
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			out.flush();
			out.close();
		}
	}
}
