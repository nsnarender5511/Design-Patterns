import com.narender.FactoryAssignMent.Person;
import com.narender.FactoryAssignMent.PersonFactory;

public class AssignMentTest {

    public static void main(String[] args){
        Person male = PersonFactory.createPerson("male");
        Person female = PersonFactory.createPerson("female");
    }
}
