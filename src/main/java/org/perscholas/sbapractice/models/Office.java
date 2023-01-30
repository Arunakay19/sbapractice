package org.perscholas.sbapractice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
public class Office {
   @Id
   @NonNull
   int id;
   @NonNull
   String office;
   /*
public void add(Office o) {
	// TODO Auto-generated method stub
	
}*/
public void add(Office o) {
	// TODO Auto-generated method stub
	
}
}
