package tca.common;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Helper {

	public static final String REST_PREFIX_SERVICE = System.getenv("tca_service_url")==null ?
			"http://localhost:9090/service/" : System.getenv("tca_service_url");

	public static Map<Integer, String> statusMap=new HashMap<Integer,String>();

	static {
		statusMap.put(1000, "New");
		statusMap.put(2010, "Pending for approval");
		statusMap.put(2015, "Assign to collection");
		statusMap.put(2020, "Start to collection");
		statusMap.put(2030, "Sign & Complete");
		statusMap.put(2041, "Cargo not ready");
		statusMap.put(2042, "Merchant not around");
		statusMap.put(3000, "Request to check-in");
		statusMap.put(3010, "Warehouse accept");
		statusMap.put(3020, "Auto-assign to delivery vehicle");
		statusMap.put(3025, "Approved for Auto-assign to delivery vehicle");
		statusMap.put(3030, "Driver request to check-out");
		statusMap.put(3040, "Warehouse ready to check-out");
		statusMap.put(3050, "Driver confirm to check-out");
		statusMap.put(4000, "Start to delivery");
		statusMap.put(4010, "Delivery complete");
		statusMap.put(4020, "Customer not around");
		statusMap.put(4030, "Customer reject");
		statusMap.put(4040, "Delivery without signature");
		statusMap.put(1010, "Complete");
		statusMap.put(1020, "Partial complete");
		statusMap.put(1030, "Reject");
		statusMap.put(1040, "Cancel");
	}

	public static String convertStatus(int status) {

		return statusMap.get(status);

	}

    /**
     * 产生4位随机字符串
     */
    public static String getCheckCode() {
        String base = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        int size = base.length();
        Random r = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i <= 4; i++) {
            //产生0到size-1的随机值
            int index = r.nextInt(size);
            //在base字符串中获取下标为index的字符
            char c = base.charAt(index);
            //将c放入到StringBuffer中去
            sb.append(c);
        }
        return sb.toString();
    }

	public static String formatDate(String input) {
		SimpleDateFormat fromUser = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
		String reformattedStr = "";
		try {

			reformattedStr = myFormat.format(fromUser.parse(input));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return reformattedStr;
	}

	public void writelog(String data,String type){
		//new WriteLogFile().write(className+"->"+username+" "+feedback,"process");
		String todayDate="";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.sss");
		Date now = new Date();
		todayDate = sdf.format(now);

		//2016-12-11
		String LOG_DIRECTORY = "E:\\Gosstech\\Merchant\\Website\\";
		String folderPath=LOG_DIRECTORY+"\\"+todayDate.substring(0,4)+todayDate.substring(5,7);
    	File folder = new File(folderPath);
    	if (!folder.exists()) {
    	    try{
    	    	folder.mkdirs();
    	    }
    	    catch(SecurityException se){
    	        //handle it
    	    }
    	}

		String filePath=folderPath+"\\"+todayDate.substring(8,10)+todayDate.substring(5,7)+todayDate.substring(0,4)
				+"-"+ type + "log.txt";
    	File file = new File(filePath);
    	if (!file.exists()) {
    	    try{
    	    	file.getParentFile().mkdirs();
    	    }
    	    catch(SecurityException se){
    	        //handle it
    	    }
    	}

    	BufferedWriter bw = null;
		FileWriter fw = null;

		try {
			// true = append file
			fw = new FileWriter(file.getAbsoluteFile(), true);
			bw = new BufferedWriter(fw);
			bw.write(todayDate+"->"+data);
			bw.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

	public static String convertMD5(String md5) {
		   try {
		        java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
		        byte[] array = md.digest(md5.getBytes());
		        StringBuffer sb = new StringBuffer();
		        for (int i = 0; i < array.length; ++i) {
		          sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
		       }
		        return sb.toString();
		    } catch (java.security.NoSuchAlgorithmException e) {
		    }
		    return null;
		}

	public static String defaultVal(String val, String defaultVal) {
		if (isBlank(val))
			return defaultVal;

		return val;
	}

	public static String defaultEmpty(String val) {
		return defaultVal(val, "");
	}

	public static boolean isBlank(String val) {
		return (val == null || "".equals(val.trim()));
	}

	public static boolean isInteger(String val) {

		try {
			Integer.parseInt(val);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public static boolean isDouble(String val) {

		try {
			Double.parseDouble(val);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public static boolean isSame(String val1, String val2) {

		if (val1 == null) {
			if (val2 == null)
				return true;
		} else {
			if (val1.equals(val2))
				return true;
		}

		return false;
	}

	public static boolean isEmpty(Collection<?> list) {
		return (list == null || list.isEmpty());
	}
}


