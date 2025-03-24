package in.Meghana.Service;


import in.Meghana.Entity.User;
import in.Meghana.Entity.Salary;
import in.Meghana.Entity.SalaryResponseDTO;

import org.springframework.stereotype.Service;

public interface SalaryService {

    String addSalary(Integer user,SalaryResponseDTO salaryRequest);

	//Salary getSalaryByUserId(Integer userId);
     SalaryResponseDTO getDetails (Integer userId) ;


}
