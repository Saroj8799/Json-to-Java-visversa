package in.ashokit.conversion;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import in.ashokit.binding.Customer;

public class JavatoJSon {
	public static void main(String[] args) throws Exception {
		Customer c=new Customer(101,"Saroj",7676);
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("customer.json"),c);
		System.out.println("serialization completed");
		
		
;
	}

}
