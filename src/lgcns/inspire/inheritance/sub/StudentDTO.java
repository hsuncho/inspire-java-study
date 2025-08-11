package lgcns.inspire.inheritance.sub;

import lgcns.inspire.inheritance.PersonDTO;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@ToString
public class StudentDTO extends PersonDTO{
    private String stuId;
    public String studentInfo() {
        return super.personInfo() + ", stuId=" + stuId;
    }
    @Override
    public String personInfo() {
        return super.personInfo() + ", stuId=" + stuId;
    }
}
