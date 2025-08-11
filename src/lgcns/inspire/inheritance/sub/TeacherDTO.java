package lgcns.inspire.inheritance.sub;

import lgcns.inspire.inheritance.PersonDTO;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@ToString
public class TeacherDTO extends PersonDTO{
    private String subject;
    public String teacherInfo() {
        return super.personInfo() + ", subject=" + subject;
    }
    @Override
    public String personInfo() {
        return super.personInfo() + ", subject=" + subject;
    }
}
