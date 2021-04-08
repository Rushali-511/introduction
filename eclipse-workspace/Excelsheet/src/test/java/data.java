import java.io.IOException;
import java.util.ArrayList;

public class data {

	public static void main(String[] args) throws IOException {
	excel e =new excel();
ArrayList dat=e.exceltesting("purchase");
System.out.println(dat.get(0));
System.out.println(dat.get(1));
}}