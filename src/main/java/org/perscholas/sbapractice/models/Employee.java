package org.perscholas.sbapractice.models;

import lombok.*;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Employee {
	
	
	   @NonNull
	   int id;
	   @NonNull
	   String name;
	   @NonNull @ToString.Exclude
	   String password;
	   Office office;
	

}
