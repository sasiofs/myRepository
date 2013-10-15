public class FileRead {
	public static void main(String[] args)  
    {  
      try   
      {  
        Runtime runtime = Runtime.getRuntime();  
        @SuppressWarnings("unused")
     
		Process process = runtime.exec("C:/WINDOWS/system32/notepad.exe D:/Java/FIO/FIOTest.txt");  
		System.out.println("Hi Sasi");
      }  
      catch (Exception e)  
      {  
        System.out.println("error is:"+e);  
      } 
    }  
}
